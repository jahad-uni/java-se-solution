package Topic01.Basics;

public class Lesson07ForLoop {
}

class ForLoop {
    public static void main(String[] args) {
        for (int i = 10; i > 1; i--) {
            System.out.println("The value of i is: " + i);
        }
    }
}

class InfiniteForLoop {
    public static void main(String[] args) {
        for (int i = 1; i >= 1; i++) {
            System.out.println("The value of i is: " + i);
        }
    }
}

class ForLoopToIterateArray {
    public static void main(String[] args){
        int[] arr ={2,11,45,9};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

class EnhancedForLoopToIterateArray {
    public static void main(String[] args){
        int[] arr ={2,11,45,9};
        //enhanced for loop to iterate
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

class EnhancedForLoopToIterateStringArray {
    public static void main(String[] args){
        String[] arr ={"hello","to","everybody"};
        //enhanced for loop to iterate
        for (String word : arr) {
            System.out.println(word);
        }
    }
}



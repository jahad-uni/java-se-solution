package Topic01.Basics;

public class Lesson08WhileLoop {
}

class WhileLoop {
    public static void main(String[] args){
        int i=10;
        while(i>1){
            System.out.println(i);
            i--;
        }
    }
}

class InfiniteWhileLoop {
    public static void main(String[] args){
        int i=10;
        while(i>1)
        {
            System.out.println(i);
            i++;
        }
    }
}

class WhileLoopToIterateArray {
    public static void main(String[] args){
        int[] arr ={2,11,45,9};
        int i=0;
        while(i<4){
            System.out.println(arr[i]);
            i++;
        }
    }
}

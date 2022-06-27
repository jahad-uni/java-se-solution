package Topic01.Basics;

public class Lesson09DoWhileLoop {
}

class DoWhileLoop {
    public static void main(String[] args){
        int i=10;
        do{
            System.out.println(i);
            i--;
        }while(i>1);
    }
}

class DoWhileLoopToIterateArray {
    public static void main(String[] args){
        int[] arr ={2,11,45,9};
        //i starts with 0 as array index starts with 0
        int i=0;
        do{
            System.out.println(arr[i]);
            i++;
        }while(i<4);
    }
}

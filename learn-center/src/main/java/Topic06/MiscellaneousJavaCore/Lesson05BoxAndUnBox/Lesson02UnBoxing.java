package Topic06.MiscellaneousJavaCore.Lesson05BoxAndUnBox;

import java.util.ArrayList;

public class Lesson02UnBoxing {

    public static void myMethod(int num){
        System.out.println(num);
    }
    public static void main(String[] args) {

        Integer inum = new Integer(100);

        // passed Integer wrapper class object, it
        // would be converted to int primitive type
        // at Runtime
        myMethod(inum);

        int num = inum; //unboxing object to primitive conversion
        int iNum = inum.intValue(); // what compiler does when unboxing

        ArrayList<Integer> arrayList = new ArrayList();
        int newNum = arrayList.get(0); // unboxing because get method returns an Integer object
    }
}

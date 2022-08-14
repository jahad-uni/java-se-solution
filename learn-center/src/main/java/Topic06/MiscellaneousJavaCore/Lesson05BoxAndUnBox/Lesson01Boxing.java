package Topic06.MiscellaneousJavaCore.Lesson05BoxAndUnBox;

import java.util.ArrayList;

public class Lesson01Boxing {

    public static void myMethod(Integer num){
        System.out.println(num);
    }
    public static void main(String[] args) {
        // passed int (primitive type), it would be
        // converted to Integer object at Runtime
        myMethod(2);

        Integer inum = 3; //Assigning int to Integer: Autoboxing
        Integer number = Integer.valueOf(3); // what compiler does when Autoboxing

        Long lnum = 32L; //Assigning long to Long: Autoboxing
        Long Lnum = Long.valueOf(32L); // what compiler does when Autoboxing

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(11); //Autoboxing - int primitive to Integer
        arrayList.add(22); //Autoboxing
    }
}

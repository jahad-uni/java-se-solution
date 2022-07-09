package Topic04.Collections.Lesson01ArrayList.Lesson03ArrayListAddOrRemove;

import java.util.ArrayList;

public class Lesson01AddElementToArrayList {

    public static void main(String[] args) {

        //ArrayList<String> Declaration
        ArrayList<String> names= new ArrayList<>();
        //add method for String ArrayList
        names.add("Farhad");
        names.add("Mehrdad");
        names.add("Farzad");
        names.add("Ali");
        names.add("Saeed");
        System.out.println("Elements of ArrayList of String Type: " + names);

        //ArrayList<Integer> Declaration
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //add method for integer ArrayList
        numbers.add(1);
        numbers.add(34);
        numbers.add(99);
        numbers.add(99);
        numbers.add(78);
        System.out.println("Elements of ArrayList of Integer Type: " + numbers);
    }
}

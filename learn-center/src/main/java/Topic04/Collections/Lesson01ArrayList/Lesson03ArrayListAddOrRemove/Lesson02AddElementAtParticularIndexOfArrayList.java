package Topic04.Collections.Lesson01ArrayList.Lesson03ArrayListAddOrRemove;

import java.util.ArrayList;

public class Lesson02AddElementAtParticularIndexOfArrayList {
    public static void main(String[] args) {

        // ArrayList of String type
        ArrayList<String> words = new ArrayList<>();
        // simple add() methods for adding elements at the end
        words.add("Hi");
        words.add("hello");
        words.add("String");
        words.add("Test");
        //adding element to the 4th position
        //4th position = 3 index as index starts with 0
        words.add(3,"Sunday");

        System.out.println("Elements after adding string Sunday:" + words);
        //adding bye word to 1st position
        words.add(0, "Bye");

        //Print
        System.out.println("Elements after adding string bye:"+ words);
    }
}

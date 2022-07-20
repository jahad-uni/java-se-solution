package Topic04.Collections.Lesson04HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Lesson03ConvertHashSetToArrayList {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hset = new HashSet<>();

        //add elements to HashSet
        hset.add("Farhad");
        hset.add("Mehrdad");
        hset.add("Ali");
        hset.add("Saeed");
        hset.add("Hossein");

        // Displaying HashSet elements
        System.out.println("HashSet contains: "+ hset);

        // Creating a List of HashSet elements
        List<String> list = new ArrayList<>(hset);

        // Displaying ArrayList elements
        System.out.println("ArrayList contains: "+ list);
    }
}

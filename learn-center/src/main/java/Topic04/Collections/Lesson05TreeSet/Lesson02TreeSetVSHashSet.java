package Topic04.Collections.Lesson05TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Lesson02TreeSetVSHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hset = new HashSet<>();

        //add elements to HashSet
        hset.add("Farhad");
        hset.add("Ramin");
        hset.add("Kaveh");
        hset.add("Saeed");
        hset.add("Hossein");
        // Duplicate removed
        hset.add("Ramin");

        // Displaying HashSet elements
        System.out.println("HashSet contains: ");
        for(String temp : hset){
            System.out.println(temp);
        }



        //----------TreeSet

        // Create a TreeSet
        TreeSet<String> tset = new TreeSet<>();

        tset.add("Farhad");
        tset.add("Ramin");
        tset.add("Kaveh");
        tset.add("Saeed");
        tset.add("Hossein");
        // Duplicate removed
        tset.add("Ramin");

        // Displaying TreeSet elements
        System.out.println("TreeSet contains: ");
        for(String temp : tset){
            System.out.println(temp);
        }
    }
}


//    HashSet vs TreeSet

// 1) HashSet gives better performance (faster) than TreeSet for the operations like add, remove, contains, size etc. HashSet offers constant time cost while TreeSet offers log(n) time cost for such operations.
//
// 2) HashSet does not maintain any order of elements while TreeSet elements are sorted in ascending order by default.
//
//    Similarities:
//
// 1) Both HashSet and TreeSet does not hold duplicate elements, which means both of these are duplicate free.
//
// 2) If you want a sorted Set then it is better to add elements to HashSet and then convert it into TreeSet rather than creating a TreeSet and adding elements to it.
//
// 3) Both of these classes are non-synchronized that means they are not thread-safe and should be synchronized explicitly when there is a need of thread-safe operations.
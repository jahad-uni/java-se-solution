package Topic04.Collections.Lesson04HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Lesson01HashSetDemo {
    public static void main(String[] args) {
        // HashSet declaration
        HashSet<String> hset = new HashSet<>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);

        //Displaying HashSet elements
        System.out.println(hset);

        //Iterate with iterator
        Iterator<String> it = hset.iterator();
        System.out.println("iterate with iterator...");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Remove Fig
        hset.remove("Fig");

        //Iterate without iterator
        System.out.println("iterate without iterator...");
        for (String temp : hset) {
            System.out.println(temp);
        }

        //Clear All
        System.out.println("------Clear HashSet----");
        hset.clear();
        //Check HashSet is Empty
        if(hset.isEmpty())
            System.out.println("HashSet is empty...");
    }
}

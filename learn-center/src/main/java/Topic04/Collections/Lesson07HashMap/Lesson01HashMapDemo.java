package Topic04.Collections.Lesson07HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lesson01HashMapDemo {
    public static void main(String[] args) {
        /* This is how to declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Farhad");
        hmap.put(2, "Farzad");
        hmap.put(7, "Sina");
        hmap.put(49, "Ali");
        hmap.put(3, "Hossein");


        /* Get values based on key*/
        String var= hmap.get(2);
        System.out.println("Value at index 2 is: "+var);

        /* Remove values based on key*/
        hmap.remove(3);
        System.out.println("Map key and values after removal:");

        /*WHILE LOOP & ITERATOR*/
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }

        //FOR LOOP
        System.out.println("For Loop:");
        for (Map.Entry me : hmap.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

        // int size() method returns the number of key value pairs
        System.out.println("Size of HashMap : " + hmap.size());


        // Getting values from HashMap
        String val=hmap.get(2);
        System.out.println("The Value mapped to Key 2 is:"+ val);

        /* Here Key "55" is not mapped to any value so this
         * operation returns null.
         */
        String val2=hmap.get(5);
        System.out.println("The Value mapped to Key 5 is:"+ val2);

        // Checking Key Existence
        boolean flag = hmap.containsKey(2);
        System.out.println("Key 2 exists in HashMap? : " + flag);

        boolean flag2 = hmap.containsKey(55);
        System.out.println("Key 55 exists in HashMap? : " + flag2);
    }
}


//  ArrayList vs HashMap in Java
//1) Implementation: ArrayList implements List Interface while HashMap is an implementation of Map interface. List and Map are two entirely different collection interfaces.
//
//2) Memory consumption: ArrayList stores the element’s value alone and internally maintains the indexes for each element.
//
//3) Order: ArrayList maintains the insertion order while HashMap doesn’t. Which means ArrayList returns the list items in the same order in which they got inserted into the list. On the other side HashMap doesn’t maintain any order, the returned key-values pairs are not sorted in any kind of order.
//
//4) Duplicates: ArrayList allows duplicate elements but HashMap doesn’t allow duplicate keys (It does allow duplicate values).
//
//5) Nulls: ArrayList can have any number of null elements. HashMap allows one null key and any number of null values.
//
//6) get method: In ArrayList we can get the element by specifying the index of it. In HashMap the elements is being fetched by specifying the corresponding key.
//

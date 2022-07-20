package Topic04.Collections.Lesson09LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lesson01LinkedHashMapDemo {
    public static void main(String[] args) {
        // LinkedHashMap Declaration
        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<>();

        //Adding elements to LinkedHashMap
        lhmap.put(22, "Farhad");
        lhmap.put(33, "Mehrdad");
        lhmap.put(1, "Saman");
        lhmap.put(2, "Kaveh");
        lhmap.put(100, "Ali");

        // Generating a Set of entries
        Set set = lhmap.entrySet();

        // Displaying elements of LinkedHashMap
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print("Key is: "+ me.getKey() +
                    "& Value is: "+me.getValue()+"\n");
        }
    }
}

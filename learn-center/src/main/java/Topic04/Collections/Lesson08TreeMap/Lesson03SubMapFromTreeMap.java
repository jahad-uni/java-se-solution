package Topic04.Collections.Lesson08TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Lesson03SubMapFromTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, String> treemap = new TreeMap<>();

        // Put elements to the map
        treemap.put("Key1", "Farhad");
        treemap.put("Key2", "Mehrdad");
        treemap.put("Key3", "Saeed");
        treemap.put("Key4", "Hossein");
        treemap.put("Key5", "Ali");
        treemap.put("Key6", "Naser");

        // Displaying TreeMap elements
        System.out.println("TreeMap Contains : " + treemap);

        // Getting the sub map
        /* public SortedMap<K,V> subMap(K fromKey,K toKey): Returns
         * a view of the portion of this map whose keys range from
         * fromKey, inclusive, to toKey, exclusive.
         * (If fromKey and toKey are equal, the returned map is empty.)
         * The returned map is backed by this map, so changes in the
         * returned map are reflected in this map, and vice-versa.
         * The returned map supports all optional map operations that
         * this map supports.
         */
        SortedMap<String, String> sortedMap = treemap.subMap("Key2","Key5");
        System.out.println("SortedMap Contains : " + sortedMap);

        // Removing an element from Sub Map
        sortedMap.remove("Key4");

        /* Displaying elements of original TreeMap after
         * removing an element from the Sub Map. Since Sub Map is
         * backed up by original Map, the element should be removed
         * from this TreeMap too.
         */
        System.out.println("TreeMap Contains : " + treemap);
    }
}

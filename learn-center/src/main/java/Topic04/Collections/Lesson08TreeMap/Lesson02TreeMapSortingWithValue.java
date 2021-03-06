package Topic04.Collections.Lesson08TreeMap;

import java.util.*;

public class Lesson02TreeMapSortingWithValue {

    public static <K, V extends Comparable<V>> Map<K, V>
    sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator =
                new Comparator<K>() {
                    public int compare(K k1, K k2) {
                        int compare =
                                map.get(k1).compareTo(map.get(k2));
                        if (compare == 0)
                            return 1;
                        else
                            return compare;
                    }
                };

        Map<K, V> sortedByValues =
                new TreeMap<>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

    public static void main(String[] args) {
        TreeMap<String, String> treemap = new TreeMap<String, String>();

        // Put elements to the map
        treemap.put("Key1", "Farhad");
        treemap.put("Key2", "Ali");
        treemap.put("Key3", "Saeed");
        treemap.put("Key4", "Hossein");
        treemap.put("Key5", "Mehrdad");

        // Calling the method sortByvalues
        Map sortedMap = sortByValues(treemap);

        // Get a set of the entries on the sorted map
        Set set = sortedMap.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}

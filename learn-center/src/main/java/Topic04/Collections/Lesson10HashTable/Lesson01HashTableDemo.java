package Topic04.Collections.Lesson10HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lesson01HashTableDemo {
    public static void main(String[] args) {
        Enumeration names;
        String key;
        // HashTable is synchronized and Thread-safe HashMap
        // Creating a Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Adding Key and Value pairs to Hashtable
        hashtable.put("Key1","Farhad");
        hashtable.put("Key2","Ali");
        hashtable.put("Key3","Mehrdad");
        hashtable.put("Key4","Hossein");
        hashtable.put("Key5","Mohammad");

        names = hashtable.keys();
        while(names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " +key+ " & Value: " +
                    hashtable.get(key));
        }
    }
}

package Topic04.Collections.Lesson02LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Lesson03LinkedListIterator {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> linkedlist = new LinkedList<>();

        // Add elements to LinkedList
        linkedlist.add("Tehran");
        linkedlist.add("Esfehan");
        linkedlist.add("Shiraz");
        linkedlist.add("Amol");
        linkedlist.add("Ghazvin");

        // Obtaining Iterator
        Iterator it = linkedlist.iterator();

        // Iterating the list in forward direction
        System.out.println("LinkedList elements:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

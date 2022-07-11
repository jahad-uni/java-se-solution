package Topic04.Collections.Lesson02LinkedList.Lesson04LinkedListIteratorOrListIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class Lesson02LinkedListListIterator {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> linkedlist = new LinkedList<String>();

        // Add elements to LinkedList
        linkedlist.add("Tehran");
        linkedlist.add("Esfehan");
        linkedlist.add("Shiraz");
        linkedlist.add("Amol");
        linkedlist.add("Ghazvin");

        // Obtaining ListIterator
        ListIterator listIt = linkedlist.listIterator();

        // Iterating the list in forward direction
        System.out.println("Forward iteration:");
        while(listIt.hasNext()){
            System.out.println(listIt.next());
        }

        // Iterating the list in backward direction
        System.out.println("\nBackward iteration:");
        while(listIt.hasPrevious()){
            System.out.println(listIt.previous());
        }
    }
}

package Topic04.Collections.Lesson02LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Lesson05LinkedListInReverseSequentialOrder {

    public static void main(String[] args) {

        // create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");

        // Displaying LinkedList elements
        System.out.println("LinkedList elements: "+list);

        // Returns an iterator over the elements in this list in reverse sequential order
        Iterator it = list.descendingIterator();

        // Displaying list in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

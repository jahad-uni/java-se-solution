package Topic04.Collections.Lesson02LinkedList.Lesson03LinkedListGetOrSearch;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lesson01LinkedListGetOrSearch {
}

class GetFirstAndLast {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> linkedlist = new LinkedList<>();

        // Add elements to LinkedList
        linkedlist.add("Item1");
        linkedlist.add("Item2");
        linkedlist.add("Item3");
        linkedlist.add("Item4");
        linkedlist.add("Item5");
        linkedlist.add("Item6");

        // Getting First element of the List
        Object firstElement = linkedlist.getFirst();
        System.out.println("First Element is: "+firstElement);

        // Getting Last element of the List
        Object lastElement = linkedlist.getLast();
        System.out.println("Last Element is: "+lastElement);
    }
}

class GetElementFromSpecificIndex {
    public static void main(String[] args) {

        // Creating LinkedList of String Elements
        LinkedList<String> linkedlist = new LinkedList<>();

        // Populating it with String values
        linkedlist.add("AA");
        linkedlist.add("BB");
        linkedlist.add("CC");
        linkedlist.add("DD");
        linkedlist.add("EE");

        System.out.println("LinkedList Elements : ");
        //get(i) returns element present at index i
        for(int i=0; i < linkedlist.size(); i++){
            System.out.println("Element at index "+i+" is: "+linkedlist.get(i));
        }
    }
}

class SearchInLinkedList {

    public static void main(String[] args) {

        // Step1: Create a LinkedList
        LinkedList<String> linkedlist = new LinkedList<>();

        // Step2: Add elements to LinkedList
        linkedlist.add("Farhad");
        linkedlist.add("Mehrdad");
        linkedlist.add("Saeed");
        linkedlist.add("Mehrdad");
        linkedlist.add("Ramin");
        linkedlist.add("Mehrdad");

        //Searching first occurrence of element
        int firstIndex = linkedlist.indexOf("Mehrdad");
        System.out.println("First Occurrence: " + firstIndex);

        //Searching last occurrence of element
        int lastIndex = linkedlist.lastIndexOf("Mehrdad");
        System.out.println("Last Occurrence: " + lastIndex);
    }
}


class SublistFromLinkedList {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> linkedlist = new LinkedList<>();

        // Add elements to LinkedList
        linkedlist.add("Item1");
        linkedlist.add("Item2");
        linkedlist.add("Item3");
        linkedlist.add("Item4");
        linkedlist.add("Item5");
        linkedlist.add("Item6");
        linkedlist.add("Item7");

        // Displaying LinkedList elements
        System.out.println("LinkedList elements:");
        Iterator it= linkedlist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Obtaining Sublist from the LinkedList
        List sublist = linkedlist.subList(2,5);

        // Displaying SubList elements
        System.out.println("\nSub List elements:");
        Iterator subit= sublist.iterator();
        while(subit.hasNext()){
            System.out.println(subit.next());
        }

        /* Any changes made to Sub List will be reflected
         * in the original List. Lets take this example - We
         * are removing element "Item4" from sublist and it
         * should be removed from original list too. Observe
         * the Output of this part of the program.
         */
        sublist.remove("Item4");
        System.out.println("\nLinkedList elements After remove:");
        Iterator it2= linkedlist.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}

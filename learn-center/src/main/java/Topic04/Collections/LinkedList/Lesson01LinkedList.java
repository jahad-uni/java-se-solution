package Topic04.Collections.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lesson01LinkedList {
}

class AddElementToLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Farhad");
        list.add("Mehrdad");
        list.add("Ramin");

        //Adding an element to the first position
        list.addFirst("Farzad");

        //Adding an element to the last position
        list.addLast("Reza");

        //Adding an element to the 3rd position
        list.add(2, "Saeed");

        //Iterating LinkedList
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class AddElementToSpecificIndexInLinkedList {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to LinkedList
        linkedList.add("Tehran");
        linkedList.add("Rasht");
        linkedList.add("Esfahan");
        linkedList.add("Shiraz");
        linkedList.add("Ghazvin");

        // Adding new Element at 5th Position
        linkedList.add(4, "NEW ELEMENT");

        // Iterating the list in forward direction
        System.out.println("LinkedList elements After Addition:");
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class RemoveElementFromLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        //Adding elements to the Linked list
        list.add("Farhad");
        list.add("Mehrdad");
        list.add("ali");
        list.add("reza");
        list.add("saeed");

        //Removing First element
        //Same as list.remove(0);
        list.removeFirst();

        //Removing Last element
        list.removeLast();

        //Iterating LinkedList
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        //removing 2nd element, index starts with 0
        list.remove(1);

        System.out.print("\nAfter removing second element: ");
        //Iterating LinkedList again
        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
    }
}

class RemoveElementFromSpecificIndexInLinkedList {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> linkedlist = new LinkedList<>();

        // Add elements to LinkedList
        linkedlist.add("Cobol");
        linkedlist.add("JCL");
        linkedlist.add("C++");
        linkedlist.add("C#");
        linkedlist.add("Java");

        // Displaying Elements before replace
        System.out.println("LinkedList Elements:");
        for (String str : linkedlist)
            System.out.println(str);

        // Removing 3rd element
        Object e1 = linkedlist.remove(2);
        System.out.println("\nElement " + e1 + " removed from the list\n");

        // LinkedList elements after remove
        System.out.println("After removal:");
        for (String str2 : linkedlist)
            System.out.println(str2);
    }
}

class RemoveAllElementFromLinkedList {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to LinkedList
        linkedList.add("Item1");
        linkedList.add("Item2");
        linkedList.add("Item3");
        linkedList.add("Item4");
        linkedList.add("Item5");

        // Displaying Elements before remove
        System.out.println("Before clear():");
        for (String str : linkedList)
            System.out.println(str);

        // Removing all the elements from LinkedList
        linkedList.clear();

        // LinkedList elements after remove
        System.out.println("After clear():");
        for (String str2 : linkedList)
            System.out.println(str2);

    }
}

class AppendAllTheElementsOfListToLinkedList {

    public static void main(String[] args) {

        // create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("AA");
        linkedList.add("BB");
        linkedList.add("CC");
        linkedList.add("DD");

        // Displaying linked list before add
        System.out.println("Before: LinkedList: " + linkedList);

        // create a new list having few elements
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Item1");
        arrayList.add("Item2");
        arrayList.add("Item3");

        // Append the list elements to LinkedList
        linkedList.addAll(arrayList);

        System.out.println("After: LinkedList: " + linkedList);
    }
}





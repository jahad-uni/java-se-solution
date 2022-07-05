package Topic04.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson01ArrayList {
}

class AddElementToArrayList {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("farhad");
        alist.add("mehrdad");
        alist.add("ali");
        alist.add("saeed");
        alist.add("arash");
        alist.add("siamak");

        //displaying elements
        System.out.println(alist);

        //Adding "hossein" at the fourth position
        alist.add(3, "hossein");

        //displaying elements
        System.out.println(alist);
    }
}

class AddElementToArrayListAtParticularIndex {
    public static void main(String[] args) {
        // ArrayList of String type
        ArrayList<String> al = new ArrayList<String>();
        // simple add() methods for adding elements at the end
        al.add("Hi");
        al.add("hello");
        al.add("String");
        al.add("Test");
        //adding element to the 4th position
        //4th position = 3 index as index starts with 0
        al.add(3, "Howdy");

        System.out.println("Elements after adding string Howdy:" + al);
        //adding string to 1st position
        al.add(0, "Bye");

        //Print
        System.out.println("Elements after adding string bye:" + al);
    }
}

class AddAllElementToArrayList {
    public static void main(String[] args) {
        // ArrayList1 of String type
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hi");
        al.add("hello");
        al.add("String");
        al.add("Test");
        System.out.println("ArrayList1 before addAll:" + al);

        //ArrayList2 of String Type
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Text1");
        al2.add("Text2");
        al2.add("Text3");
        al2.add("Text4");

        //Adding ArrayList2 into ArrayList1
        al.addAll(al2);
        System.out.println("ArrayList1 after addAll:" + al);
    }
}

class CopyAllListToArrayList {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        //Adding elements to the ArrayList
        al.add("Text 1");
        al.add("Text 2");
        al.add("Text 3");

        System.out.println("ArrayList Elements are: " + al);

        //Adding elements to a List
        List<String> list = new ArrayList<>();
        list.add("Text 4");
        list.add("Text 5");
        list.add("Text 6");

        //Adding all elements of list to ArrayList using addAll
        al.addAll(list);
        System.out.println("Updated ArrayList Elements: " + al);
    }
}

class InsertAllCollectionElementsToTheSpecifiedPositionInArrayList {
    public static void main(String[] args) {
        // ArrayList1
        ArrayList<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Orange");
        al.add("Grapes");
        al.add("Mango");
        System.out.println("ArrayList1 before addAll:" + al);

        //ArrayList2
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Strawberry");
        al2.add("Pear");
        al2.add("Banana");
        al2.add("watermelon");
        System.out.println("ArrayList2 content:" + al2);

        //Adding ArrayList2 in ArrayList1 at 3rd position(index =2)
        al.addAll(2, al2);
        System.out.println("ArrayList1 after adding ArrayList2 at 3rd Pos:\n" + al);
    }
}

class ChangeElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("farhad");
        names.add("mehrdad");
        names.add("saeed");
        names.add("arash");
        System.out.println(names);
        names.set(0, "farzad");
        System.out.println(names);
    }
}

class RemoveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("farhad");
        alist.add("mehrdad");
        alist.add("ali");
        alist.add("saeed");
        alist.add("arash");
        alist.add("siamak");

        System.out.println(alist);

        //Removing "ali" and "saeed"
        alist.remove("ali");
        alist.remove("saeed");

        System.out.println(alist);

        //Removing 2nd element
        alist.remove(1);

        System.out.println(alist);
    }
}

class IterateOnArrayList {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("farhad");
        alist.add("mehrdad");
        alist.add("ali");
        alist.add("saeed");
        alist.add("arash");
        alist.add("siamak");

        //iterating ArrayList
        for (String str : alist)
            System.out.println(str);
    }
}

class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Number of elements in ArrayList: " + numbers.size());
    }
}

class ArrayListSomeMethod {
    public static void main(String[] args) {

        ArrayList<String> obj = new ArrayList<String>();

        obj.add("farhad");
        obj.add("mehrdad");
        obj.add("ali");
        obj.add("saeed");
        obj.add("arash");
        obj.add("siamak");

        // Displaying elements
        System.out.println("Original ArrayList:");
        for (String str : obj)
            System.out.println(str);

        // Add element at the given index
        // obj.add(0, "farzad") - Adding element "Rahul" at first position
        //obj.add(1, "ramin") - Adding element "Justin" at second position

        obj.add(0, "farzad");
        obj.add(1, "ramin");

        // Displaying elements
        System.out.println("ArrayList after add operation:");
        for (String str : obj)
            System.out.println(str);

        //Remove elements from ArrayList like this
        obj.remove("ali"); //Removes "ali" from ArrayList
        obj.remove("arash"); //Removes "arash" from ArrayList

        // Displaying elements
        System.out.println("ArrayList after remove operation:");
        for (String str : obj)
            System.out.println(str);

        //Remove element from the specified index
        obj.remove(1); //Removes Second element from the List

        // Displaying elements
        System.out.println("Final ArrayList:");
        for (String str : obj)
            System.out.println(str);
    }
}

class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        Collections.sort(fruits);

        for (String str : fruits) {
            System.out.println(str);
        }
    }
}



package Topic04.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson01ArrayList {
}

class AddElementToArrayList{
    public static void main(String[] args){
        ArrayList<String> alist=new ArrayList<String>();
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

class ChangeElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("farhad");
        names.add("mehrdad");
        names.add("saeed");
        names.add("arash");
        System.out.println(names);
        names.set(0, "farzad");
        System.out.println(names);
    }
}

class RemoveElementFromArrayList{
    public static void main(String[] args){
        ArrayList<String> alist=new ArrayList<String>();
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

class IterateOnArrayList{
    public static void main(String[] args){
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("farhad");
        alist.add("mehrdad");
        alist.add("ali");
        alist.add("saeed");
        alist.add("arash");
        alist.add("siamak");

        //iterating ArrayList
        for(String str:alist)
            System.out.println(str);
    }
}

class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Number of elements in ArrayList: " + numbers.size());
    }
}

class ArrayListExample {
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
        for(String str:obj)
            System.out.println(str);

        /* Add element at the given index
         * obj.add(0, "Rahul") - Adding element "Rahul" at first position
         * obj.add(1, "Justin") - Adding element "Justin" at second position
         */
        obj.add(0, "farzad");
        obj.add(1, "ramin");

        // Displaying elements
        System.out.println("ArrayList after add operation:");
        for(String str:obj)
            System.out.println(str);

        //Remove elements from ArrayList like this
        obj.remove("ali"); //Removes "ali" from ArrayList
        obj.remove("arash"); //Removes "arash" from ArrayList

        // Displaying elements
        System.out.println("ArrayList after remove operation:");
        for(String str:obj)
            System.out.println(str);

        //Remove element from the specified index
        obj.remove(1); //Removes Second element from the List

        // Displaying elements
        System.out.println("Final ArrayList:");
        for(String str:obj)
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



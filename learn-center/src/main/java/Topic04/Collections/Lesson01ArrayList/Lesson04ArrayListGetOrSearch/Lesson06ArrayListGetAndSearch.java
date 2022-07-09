package Topic04.Collections.Lesson01ArrayList.Lesson04ArrayListGetOrSearch;

import java.util.ArrayList;
import java.util.List;

public class Lesson06ArrayListGetAndSearch {
}

class GetElementByIndex {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("pen");
        al.add("pencil");
        al.add("ink");
        al.add("notebook");
        al.add("book");
        al.add("books");
        al.add("paper");
        al.add("white board");

        System.out.println("First element of the Lesson01ArrayList: " + al.get(0));
        System.out.println("Third element of the Lesson01ArrayList: " + al.get(2));
        System.out.println("Sixth element of the Lesson01ArrayList: " + al.get(5));
        System.out.println("Fourth element of the Lesson01ArrayList: " + al.get(3));
    }
}

class GetElementByContains {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("pen");
        al.add("pencil");
        al.add("ink");
        al.add("notebook");

        System.out.println("Lesson01ArrayList contains the string 'ink pen': "
                +al.contains("ink pen"));
        System.out.println("Lesson01ArrayList contains the string 'pen': "
                +al.contains("pen"));
        System.out.println("Lesson01ArrayList contains the string 'pencil': "
                +al.contains("pencil"));
        System.out.println("Lesson01ArrayList contains the string 'book': "
                +al.contains("book"));

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(99);
        al2.add(56);
        al2.add(13);
        al2.add(44);
        al2.add(6);

        System.out.println("'1' is present in arraylist: "+al2.contains(1));
        System.out.println("'55' is present in arraylist: "+al2.contains(55));
        System.out.println("'44' is there in arraylist: "+al2.contains(44));
        System.out.println("'7' is there in arraylist: "+al2.contains(7));
    }
}

class GetSublistFromArrayList {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        //Addition of elements in Lesson01ArrayList
        al.add("Farhad");
        al.add("Mehrdad");
        al.add("Farzad");
        al.add("Saeed");
        al.add("Ali");
        al.add("Naser");

        System.out.println("Original Lesson01ArrayList Content: " + al);
        try {
            //Sublist to Lesson01ArrayList
            ArrayList<String> al2 = new ArrayList<>(al.subList(1, 10));
            System.out.println("SubList stored in Lesson01ArrayList: " + al2);

            //Sublist to List
            List<String> list = al.subList(1, 4);
            System.out.println("SubList stored in List: " + list);
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}

class FirstIndexOfElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("AB");
        al.add("CD");
        al.add("EF");
        al.add("GH");
        al.add("IJ");
        al.add("KL");
        al.add("MN");
        al.add("KL");

        System.out.println("Index of 'AB': "+al.indexOf("AB"));
        System.out.println("Index of 'KL': "+al.indexOf("KL"));
        System.out.println("Index of 'AA': "+al.indexOf("AA"));
        System.out.println("Index of 'EF': "+al.indexOf("EF"));
    }
}

class LastIndexOfElementInArrayList {
    public static void main(String[] args) {
        //Lesson01ArrayList of Integer Type
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(88);
        al.add(9);
        al.add(17);
        al.add(17);
        al.add(9);
        al.add(17);
        al.add(91);
        al.add(27);
        al.add(1);
        al.add(17);

        System.out.println("Last occurrence of element 1: " + al.lastIndexOf(1));
        System.out.println("Last occurrence of element 9: " + al.lastIndexOf(9));
        System.out.println("Last occurrence of element 17: " + al.lastIndexOf(17));
        System.out.println("Last occurrence of element 91: " + al.lastIndexOf(91));
        System.out.println("Last occurrence of element 88: " + al.lastIndexOf(88));
    }
}


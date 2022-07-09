package Topic04.Collections.Lesson01ArrayList.Lesson01ArrayListBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lesson02InitializeArrayList {
}

class InitializeWithinNormalWay {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<String>();
        books.add("Java Book1");
        books.add("Java Book2");
        books.add("Java Book3");
        System.out.println("Books stored in array list are: " + books);
    }
}

class InitializeWithArraysAsList{
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>(
                Arrays.asList("farhad", "farzad", "mehrdad"));
        System.out.println("Elements are:" + obj);
    }
}

class InitializeWithAnonymousInnerClass {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>(){{
            add("Tehran");
            add("Esfahan");
            add("Yazd");
        }};
        System.out.println("Content of Array list cities:" + cities);
    }
}

class InitializeWithCollectionsNCopies {
    public static void main(String[] args) {
        ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
        System.out.println("Lesson01ArrayList items: "+intlist);
    }
}



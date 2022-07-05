package Topic04.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson05ArrayListSorting {
}

class StringArrayListSorting {

    public static void main(String[] args){
        ArrayList<String> listofcountries = new ArrayList<String>();
        listofcountries.add("Iran");
        listofcountries.add("US");
        listofcountries.add("China");
        listofcountries.add("Denmark");

        /*Unsorted List*/
        System.out.println("Before Sorting:");
        for(String counter: listofcountries){
            System.out.println(counter);
        }

        /* Sort statement*/
        Collections.sort(listofcountries);

        /* Sorted List*/
        System.out.println("After Sorting:");
        for(String counter: listofcountries){
            System.out.println(counter);
        }
    }
}

class IntegerArrayListSorting  {

    public static void main(String args[]){
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(11);
        arraylist.add(2);
        arraylist.add(7);
        arraylist.add(3);
        /* ArrayList before the sorting*/
        System.out.println("Before Sorting:");
        for(int counter: arraylist){
            System.out.println(counter);
        }

        /* Sorting of arraylist using Collections.sort*/
        Collections.sort(arraylist);

        /* ArrayList after sorting*/
        System.out.println("After Sorting:");
        for(int counter: arraylist){
            System.out.println(counter);
        }
    }
}


class SortingArrayListInDescendingOrder  {

    public static void main(String[] args){
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF");

        /*Unsorted List: ArrayList content before sorting*/
        System.out.println("Before Sorting:");
        for(String str: arraylist){
            System.out.println(str);
        }

        /* Sorting in decreasing order*/
        Collections.sort(arraylist, Collections.reverseOrder());

        /* Sorted List in reverse order*/
        System.out.println("ArrayList in descending order:");
        for(String str: arraylist){
            System.out.println(str);
        }
    }
}
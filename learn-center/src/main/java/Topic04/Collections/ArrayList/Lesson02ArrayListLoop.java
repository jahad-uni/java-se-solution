package Topic04.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson02ArrayListLoop {
}

class LoopExample {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(14);
        arrList.add(7);
        arrList.add(39);
        arrList.add(40);

        /* For Loop for iterating ArrayList */
        System.out.println("For Loop");
        for (int counter = 0; counter < arrList.size(); counter++) {
            System.out.println(arrList.get(counter));
        }

        /* Advanced For Loop*/
        System.out.println("Advanced For Loop");
        for (Integer num : arrList) {
            System.out.println(num);
        }

        /* While Loop for iterating ArrayList*/
        System.out.println("While Loop");
        int count = 0;
        while (arrList.size() > count) {
            System.out.println(arrList.get(count));
            count++;
        }

        /*Looping Array List using Iterator*/
        System.out.println("Iterator");
        Iterator<Integer> iter = arrList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        /*Looping Array List using ListIterator*/
        System.out.println("Iterator");
        Iterator<Integer> listIter = arrList.listIterator();
        while (listIter.hasNext()) {
            System.out.println(iter.next());
        }

        /*Looping Using Stream API*/
        System.out.println("Using Stream API");
        arrList.forEach(num->System.out.println(num));
//        arrList.forEach(System.out::println);
    }
}

//**********************************************
//How iterate in ArrayList
//1-For Loop
//2-Advanced for loop
//3-While Loop
//4-Iterator
//5-ListIterator
//6-using Stream API
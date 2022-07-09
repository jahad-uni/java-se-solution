package Topic04.Collections.Lesson01ArrayList.Lesson03ArrayListAddOrRemove;

import java.util.ArrayList;

public class Lesson05InsertAllTheCollectionElementsToTheSpecifiedPositionInArrayList {
    public static void main(String[] args) {

        // ArrayList1
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Apple");
        arrayList1.add("Orange");
        arrayList1.add("Grapes");
        arrayList1.add("Mango");
        System.out.println("ArrayList1 before addAll:" + arrayList1);

        //ArrayList2
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Fig");
        arrayList2.add("Pear");
        arrayList2.add("Banana");
        arrayList2.add("Guava");
        System.out.println("ArrayList2 content:" + arrayList2);

        //Adding ArrayList2 in ArrayList1 at 3rd position(index =2)
        arrayList1.addAll(2, arrayList2);
        System.out.println("ArrayList1 after adding ArrayList2 at 3rd Pos:\n" + arrayList1);
    }
}

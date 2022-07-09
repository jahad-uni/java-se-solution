package Topic04.Collections.Lesson01ArrayList.Lesson03ArrayListAddOrRemove;

import java.util.ArrayList;
import java.util.List;

public class Lesson04CopyAllListElementsToArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        //Adding elements to the ArrayList
        arrayList.add("Text 1");
        arrayList.add("Text 2");
        arrayList.add("Text 3");

        System.out.println("ArrayList Elements are: " + arrayList);

        //Adding elements to a List
        List<String> list = new ArrayList<>();
        list.add("Text 4");
        list.add("Text 5");
        list.add("Text 6");

        //Adding all elements of list to ArrayList using addAll
        arrayList.addAll(list);
        System.out.println("Updated ArrayList Elements: " + arrayList);
    }
}

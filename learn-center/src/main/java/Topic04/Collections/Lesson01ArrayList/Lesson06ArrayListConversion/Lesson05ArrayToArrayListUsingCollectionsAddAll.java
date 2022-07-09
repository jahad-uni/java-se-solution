package Topic04.Collections.Lesson01ArrayList.Lesson06ArrayListConversion;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson05ArrayToArrayListUsingCollectionsAddAll {
    public static void main(String[] args) {

        //Array Declaration and initialization
        String[] array = {"Hi", "Hello", "Howdy", "Bye"};

        //Lesson01ArrayList declaration
        ArrayList<String> arraylist = new ArrayList<>();

        //Conversion
        //This method is mush faster than Arrays.asList()
        Collections.addAll(arraylist, array);

        //Adding new elements to the converted List
        arraylist.add("String1");
        arraylist.add("String2");

        for (String str : arraylist)
            System.out.println(str);
    }
}

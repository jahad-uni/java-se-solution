package Topic04.Collections.Lesson01ArrayList.Lesson06ArrayListConversion;

import java.util.ArrayList;

public class Lesson03ArrayToArrayListUsingManualWay {
    public static void main(String[] args) {

        //Lesson01ArrayList declaration
        ArrayList<String> arraylist = new ArrayList<>();

        //Initialized Array
        String[] array = {"Text1", "Text2", "Text3", "Text4"};

        for (int i = 0; i < array.length; i++)
            arraylist.add(array[i]);

        for (String str : arraylist)
            System.out.println(str);
    }
}

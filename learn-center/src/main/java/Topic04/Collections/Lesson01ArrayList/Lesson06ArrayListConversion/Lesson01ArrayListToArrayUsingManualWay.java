package Topic04.Collections.Lesson01ArrayList.Lesson06ArrayListConversion;

import java.util.ArrayList;

public class Lesson01ArrayListToArrayUsingManualWay {

    public static void main(String[] args) {

        // arrayList declaration and initialization
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("String1");
        arrayList.add("String2");
        arrayList.add("String3");
        arrayList.add("String4");

        //Lesson01ArrayList to Array Conversion
        String[] array = new String[arrayList.size()];
        for (int j = 0; j < arrayList.size(); j++)
            array[j] = arrayList.get(j);

        for (String k : array)
            System.out.println(k);
    }
}

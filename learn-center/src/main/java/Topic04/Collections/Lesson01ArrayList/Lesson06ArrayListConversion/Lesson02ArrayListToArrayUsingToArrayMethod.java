package Topic04.Collections.Lesson01ArrayList.Lesson06ArrayListConversion;

import java.util.ArrayList;

public class Lesson02ArrayListToArrayUsingToArrayMethod {
    public static void main(String[] args) {

        //Lesson01ArrayList declaration and initialization
        ArrayList<String> friendsNames = new ArrayList<>();
        friendsNames.add("farhad");
        friendsNames.add("mehrdad");
        friendsNames.add("saeed");
        friendsNames.add("reza");

        //Lesson01ArrayList to Array Conversion
        String[] friendsNamesInArray = friendsNames.toArray(new String[friendsNames.size()]);

        for (String k : friendsNamesInArray)
            System.out.println(k);
    }
}

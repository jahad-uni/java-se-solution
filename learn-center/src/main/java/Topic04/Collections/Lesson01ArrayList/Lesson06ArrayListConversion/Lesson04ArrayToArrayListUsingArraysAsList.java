package Topic04.Collections.Lesson01ArrayList.Lesson06ArrayListConversion;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson04ArrayToArrayListUsingArraysAsList {
    public static void main(String[] args) {

        // Array Declaration and initialization
        String cityNames[] = {"Tehran", "Rasht", "Shiraz", "Kish"};

        //Array to Lesson01ArrayList conversion
        ArrayList<String> cityList = new ArrayList<>(Arrays.asList(cityNames));

        //Adding new elements to the converted List
        cityList.add("Ghazvin");
        cityList.add("Kerman");

        for (String str : cityList)
            System.out.println(str);
    }
}

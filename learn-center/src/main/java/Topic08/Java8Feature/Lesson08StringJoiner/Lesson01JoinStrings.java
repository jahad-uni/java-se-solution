package Topic08.Java8Feature.Lesson08StringJoiner;

import java.util.StringJoiner;

public class Lesson01JoinStrings {
    public static void main(String[] args) {

        // Passing Hyphen(-) as delimiter
        StringJoiner firstSJ = new StringJoiner("-");

        // Joining multiple strings by using add() method
        firstSJ.add("Logan");
        firstSJ.add("Magneto");
        firstSJ.add("Rogue");
        firstSJ.add("Storm");

        // Displaying the output String
        System.out.println(firstSJ);


        /* Passing comma(,) as delimiter and opening bracket
         * "(" as prefix and closing bracket ")" as suffix
         */
        StringJoiner secondSJ = new StringJoiner(",", "(", ")");

        // Joining multiple strings by using add() method
        secondSJ.add("Negan");
        secondSJ.add("Rick");
        secondSJ.add("Maggie");
        secondSJ.add("Daryl");

        // Displaying the output String
        System.out.println(secondSJ);



        /* Passing comma(,) as delimiter and opening bracket
         * "(" as prefix and closing bracket ")" as suffix
         */
        StringJoiner thirdSJ = new StringJoiner(",", "(", ")");

        thirdSJ.add("Negan");
        thirdSJ.add("Rick");
        thirdSJ.add("Maggie");
        thirdSJ.add("Daryl");

        System.out.println("First String: "+thirdSJ);

        /* Passing hyphen(-) as delimiter and string "pre"
         * as prefix and string "suff" as suffix
         */
        StringJoiner myanotherstring = new StringJoiner("-", "pre", "suff");

        myanotherstring.add("Sansa");
        myanotherstring.add("Imp");
        myanotherstring.add("Jon");
        myanotherstring.add("Ned");

        System.out.println("Second String: "+myanotherstring);

        /* Merging both the strings
         * The important point to note here is that the output string will be
         * having the delimiter prefix and suffix of the first string (the string
         * which is calling the merge method of StringJoiner)
         */
        StringJoiner mergedString = thirdSJ.merge(myanotherstring);
        System.out.println(mergedString);



        //Comma(,) as delimiter
        StringJoiner fourthSJ = new StringJoiner(",");

        /* Using setEmptyValue() method, we can set the default value
         * of a StringJoiner instance, so if the StringJoiner is empty
         * and we print the value of it, this default value will be
         * displayed
         */
        fourthSJ.setEmptyValue("This is a default String");

        /* We have not added any string to StringJoiner yet so
         * this should display the default value of StringJoiner
         */
        System.out.println("Default String: "+fourthSJ);


        // Adding strings to StringJoiner
        fourthSJ.add("Apple");
        fourthSJ.add("Banana");
        fourthSJ.add("Orange");
        fourthSJ.add("Kiwi");
        fourthSJ.add("Grapes");
        System.out.println(fourthSJ);

        /* The length() method of StringJoiner class returns the
         * length of the string (the number of characters in the
         * StringJoiner instance)
         */
        int length = fourthSJ.length();
        System.out.println("Length of the StringJoiner: "+length);

        /* The toString() method is used for converting a StringJoiner
         *  instance to a String.
         */
        String s = fourthSJ.toString();
        System.out.println(s);

    }
}

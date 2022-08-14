package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson03CompareTo {
    public static void main(String[] args) {

        // ********** Java String compareTo() method **********
        String str1 = "String method tutorial";
        String str2 = "compareTo method example";
        String str3 = "String method tutorial";

        int var1 = str1.compareTo( str2 );
        System.out.println("str1 & str2 comparison: "+var1);

        int var2 = str1.compareTo( str3 );
        System.out.println("str1 & str3 comparison: "+var2);

        int var3 = str2.compareTo("compareTo method example");
        System.out.println("str2 & string argument comparison: "+var3);

        // ********** How to find length of a string using String compareTo() method **********
        String strNew1 = "Cow";
        //This is an empty string
        String strNew2 = "";
        String strNew3 = "Goat";

        System.out.println(strNew1.compareTo(strNew2));

        System.out.println(strNew2.compareTo(strNew3));

        // ********** Java String compareToIgnoreCase() **********
        String string1 = "HELLO";
        String string2 = "hello";
        String string3 = "HellO";

        int varr1 = string1.compareToIgnoreCase(string2);
        System.out.println("string1 and string2 comparison: "+varr1);

        int varr2 = string1.compareToIgnoreCase(string3);
        System.out.println("string1 and string3 comparison: "+varr2);

        int varr3 = string1.compareToIgnoreCase("HeLLo");
        System.out.println("string1 and HeLLo comparison: "+varr3);
    }
}

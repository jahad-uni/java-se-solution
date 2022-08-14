package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson07IndexOf {

    public static void main(String[] args) {

        // ********** Java String indexOf() Method **********
        String str1 = new String("This is a Beginners Java tutorial");
        String str2 = new String("Beginners");
        String str3 = new String("Java");
        String str4 = new String("Javas");
        System.out.println("Index of J in str1: "+str1.indexOf('J'));
        System.out.println("Index of J in str1 after 15th char:"+str1.indexOf('J', 15));
        System.out.println("Index of J in str1 after 30th char:"+str1.indexOf('J', 30));
        System.out.println("Index of string str2 in str1:"+str1.indexOf(str2));
        System.out.println("Index of str2 after 15th char"+str1.indexOf(str2, 15));
        System.out.println("Index of string str3:"+str1.indexOf(str3));
        System.out.println("Index of string str4"+str1.indexOf(str4));
        System.out.println("Index of hardcoded string:"+str1.indexOf("is"));
        System.out.println("Index of hardcoded string after 4th char:"+str1.indexOf("is", 4));
    }
}

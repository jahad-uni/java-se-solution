package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson05EndsWith {

    public static void main(String[] args) {

        // ********** Java String endsWith() Method **********
        String str1 = new String("This is a test String");
        String str2 = new String("Test ABC");
        boolean var1 = str1.endsWith("String");
        boolean var2 = str1.endsWith("ABC");
        boolean var3 = str2.endsWith("String");
        boolean var4 = str2.endsWith("ABC");
        System.out.println("str1 ends with String: "+ var1);
        System.out.println("str1 ends with ABC: "+ var2);
        System.out.println("str2 ends with String: "+ var3);
        System.out.println("str2 ends with ABC: "+ var4);

        // ********** String endsWith() method with if statement **********
        String str = "Java String tutorial";
        if(str.endsWith("tutorial")) {
            System.out.println("The Given String ends with tutorial");
        }
    }
}

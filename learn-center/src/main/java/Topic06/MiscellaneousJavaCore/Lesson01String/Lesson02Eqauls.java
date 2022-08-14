package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson02Eqauls {
    public static void main(String[] args) {

        // ********** Java String equals() method **********
        String str1= new String("Hello");
        String str2= new String("Hi");
        String str3= new String("Hello");
        System.out.println("str1 equals to str2:"+str1.equals(str2));
        System.out.println("str1 equals to str3:"+str1.equals(str3));
        System.out.println("str1 equals to Welcome:"+str1.equals("Welcome"));
        System.out.println("str1 equals to Hello:"+str1.equals("Hello"));
        System.out.println("str1 equals to hello:"+str1.equals("hello"));

        // ********** Java String equalsIgnoreCase() method **********
        String strNew1= new String("Apple");
        String strNew2= new String("Orange");
        String strNew3= new String("APPLE");
        System.out.println("str1 equals to str2:"+strNew1.equalsIgnoreCase(strNew2));
        System.out.println("str1 equals to str3:"+strNew1.equalsIgnoreCase(strNew3));
        System.out.println("str1 equals to Welcome:"+strNew1.equalsIgnoreCase("Welcome"));
        System.out.println("str1 equals to Apple:"+strNew1.equalsIgnoreCase("Apple"));
        System.out.println("str2 equals to mango:"+strNew2.equalsIgnoreCase("orange"));
    }
}

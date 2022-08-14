package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson15IsEmpty {

    public static void main(String[] args) {

       // ********** Java String isEmpty() method **********
        String str1 = null;
        String str2 = "Java Tutorial";

        if(str1 == null || str1.isEmpty()){
            System.out.println("String str1 is empty or null");
        }
        else{
            System.out.println(str1);
        }
        if(str2 == null || str2.isEmpty()){
            System.out.println("String str2 is empty or null");
        }
        else{
            System.out.println(str2);
        }
    }
}

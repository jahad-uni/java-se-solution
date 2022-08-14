package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson25Length {

    public static void main(String[] args) {

        // ********** Java String length() Method **********
        String str1= new String("Test String");
        String str2= new String("Farhad");
        String str3= new String("JavaTutorial");
        System.out.println("Length of str1:"+str1.length());
        System.out.println("Length of str2:"+str2.length());
        System.out.println("Length of str3:"+str3.length());


        // ********** Java String length() method to calculate the length of String without spaces **********
        String str = "hi guys    this is a string";

        //length of the String
        System.out.println("Length of the String: "+str.length());

        //length of the String without white spaces
        System.out.println("Length of String without spaces: "+
                str.replace(" ", "").length());



    }
}

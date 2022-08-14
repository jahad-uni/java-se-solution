package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson06Trim {

    public static void main(String[] args) {

        // ********** Java String trim() method **********
        String str = new String("    How are you??   ");
        System.out.println("String before trim: "+str);
        System.out.println("String after trim: "+str.trim());
    }
}

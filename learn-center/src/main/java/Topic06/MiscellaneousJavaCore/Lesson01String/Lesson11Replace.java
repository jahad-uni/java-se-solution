package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson11Replace {

    public static void main(String[] args) {

        // ********** Java String replace() Method **********
        String str = new String("This is .com java tutorial.com");

        System.out.print("String after replacing all 'a' with 'p' :" );
        System.out.println(str.replace('a', 'p'));

        System.out.print("String after replacing all 'i' with 'K' :" );
        System.out.println(str.replace('i', 'K'));

        // ********** Java String replaceFirst() Method **********
        System.out.print("String after replacing java with python :" );
        System.out.println(str.replaceFirst("java", "python"));

        System.out.print("String after replacing Site name:" );
        System.out.println(str.replaceFirst("tutorial(.*)", "XYZ.com"));

        // ********** Java String replaceAll() Method **********
        System.out.print("String after replacing all com with net: " );
        System.out.println(str.replaceAll("com", "net"));

        System.out.print("Replacing whole String: " );
        System.out.println(str.replaceAll("(.*)tutorial(.*)", "Welcome"));

    }
}

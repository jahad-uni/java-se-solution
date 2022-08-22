package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson22ValueOf {

    public static void main(String[] args) {

        // ********** Java String valueOf() method **********
        int i = 10; //int value
        float f = 10.10f; //float value
        long l = 111L; //long value
        double d = 2222.22; //double value
        char ch = 'A'; //char value
        char[] array = {'a', 'b', 'c'}; //char array

        //converting int to String
        String str1 = String.valueOf(i);

        //converting float to String
        String str2 = String.valueOf(f);

        //converting long to String
        String str3 = String.valueOf(l);

        //converting double to String
        String str4 = String.valueOf(d);

        //converting char to String
        String str5 = String.valueOf(ch);

        //converting char array to String
        String str6 = String.valueOf(array);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        
    }
}

package Topic06.MiscellaneousJavaCore.Lesson01String;

import java.io.UnsupportedEncodingException;

public class Lesson24GetBytes {

    public static void main(String[] args) {

        // ********** Java String getBytes() Method **********
        String str = new String("Hello");
        byte[] array1 = str.getBytes();
        System.out.print("Default Charset encoding:");
        for(byte b: array1){
            System.out.print(b);
        }
        System.out.print("\nUTF-16 Charset encoding:");
        try{
            byte [] array2 = str.getBytes("UTF-16");
            for(byte b1: array2){
                System.out.print(b1);
            }
            byte [] array3 = str.getBytes("UTF-16BE");
            System.out.print("\nUTF-16BE Charset encoding:");
            for(byte b2: array3){
                System.out.print(b2);
            }
        }catch(UnsupportedEncodingException ex){
            System.out.println("Unsupported character set"+ex);
        }
    }
}

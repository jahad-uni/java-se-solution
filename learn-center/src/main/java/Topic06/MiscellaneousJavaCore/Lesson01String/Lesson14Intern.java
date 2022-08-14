package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson14Intern {

    public static void main(String[] args) {

        // ********** Java String intern() method **********
        String strr1 = "JavaIntern";

        // The Java String intern() method searches the string "JavaIntern"
        // in the memory pool and returns the reference of it.
        String strr2 = new String("JavaIntern").intern();
        System.out.println("strr1==strr2: "+(strr1==strr2));  //true

        // ********** Java automatically interns String literals **********
        String str1 = "Hello";

        //Java automatically interns this
        String str2 = "Hello";

        //This is same as creating string using string literal
        String str3 = "Hello".intern();

        //This will create a new instance of "Hello" in memory
        String str4 = new String("Hello");

        if ( str1 == str2 ){
            System.out.println("String str1 and str2 are same");
        }

        if ( str2 == str3 ){
            System.out.println("String str2 and str3 are same" );
        }

        if ( str1 == str4 ){
            //This will not be printed as the condition is not true
            System.out.println("String str1 and str4 are same" );
        }

        if ( str3 == str4 ){
            System.out.println("String str3 and str4 are same" );
        }
    }
}

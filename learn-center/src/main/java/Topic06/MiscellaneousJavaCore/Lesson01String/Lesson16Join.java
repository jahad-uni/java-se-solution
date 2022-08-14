package Topic06.MiscellaneousJavaCore.Lesson01String;

import java.util.Arrays;
import java.util.List;

public class Lesson16Join {

    public static void main(String[] args) {

        // ********** Java String Join() method **********
        String str=String.join("^","You","are","Awesome");
        System.out.println(str);

        List<String> list = Arrays.asList("Farhad", "Mehrdad", "Ramin", "Ali");
        String names = String.join(" | ", list);
        System.out.println(names);

    }
}

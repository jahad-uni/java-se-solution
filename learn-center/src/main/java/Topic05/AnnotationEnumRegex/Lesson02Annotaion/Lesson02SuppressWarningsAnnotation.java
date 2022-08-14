package Topic05.AnnotationEnumRegex.Lesson02Annotaion;

import java.util.ArrayList;

public class Lesson02SuppressWarningsAnnotation {

    @SuppressWarnings({"unchecked","deprecated"})
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add("sonoo");
        list.add("vimal");
        list.add("ratan");

        for (Object obj : list)
            System.out.println(obj);

    }
}

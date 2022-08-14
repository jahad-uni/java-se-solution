package Topic05.AnnotationEnumRegex.Lesson01Enum;

public class Lesson05IterateThroughEnum {

    public static void main(String[] args) {
        for (Lesson01SimpleEnumDirection dir : Lesson01SimpleEnumDirection.values()) {
            System.out.println(dir);
        }
    }
}

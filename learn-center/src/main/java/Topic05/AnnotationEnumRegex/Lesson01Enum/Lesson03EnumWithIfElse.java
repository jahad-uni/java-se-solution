package Topic05.AnnotationEnumRegex.Lesson01Enum;

public class Lesson03EnumWithIfElse {

    public static void main(String[] args) {
        Lesson01SimpleEnumDirection dir = Lesson01SimpleEnumDirection.NORTH;
        String str;
        if (dir == Lesson01SimpleEnumDirection.EAST) {
            str = "east";
        } else if (dir == Lesson01SimpleEnumDirection.WEST) {
            str = "west";
        } else if (dir == Lesson01SimpleEnumDirection.NORTH) {
            str = "north";
        } else if (dir == Lesson01SimpleEnumDirection.SOUTH) {
            str = "south";
        } else {
            str = "not valid";
        }
        System.out.println("Direction is: " + str);
    }
}

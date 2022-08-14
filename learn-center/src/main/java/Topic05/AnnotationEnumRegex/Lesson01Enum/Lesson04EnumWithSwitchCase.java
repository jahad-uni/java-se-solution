package Topic05.AnnotationEnumRegex.Lesson01Enum;

public class Lesson04EnumWithSwitchCase {

    Lesson01SimpleEnumDirection dir;

    public Lesson04EnumWithSwitchCase(Lesson01SimpleEnumDirection dir) {
        this.dir = dir;
    }

    public void getMyDirection() {
        switch (dir) {
            case EAST:
                System.out.println("In East Direction");
                break;

            case WEST:
                System.out.println("In West Direction");
                break;

            case NORTH:
                System.out.println("In North Direction");
                break;

            default:
                System.out.println("In South Direction");
                break;
        }
    }

    public static void main(String[] args) {
        Lesson04EnumWithSwitchCase obj1 = new Lesson04EnumWithSwitchCase(Lesson01SimpleEnumDirection.EAST);
        obj1.getMyDirection();
        Lesson04EnumWithSwitchCase obj2 = new Lesson04EnumWithSwitchCase(Lesson01SimpleEnumDirection.SOUTH);
        obj2.getMyDirection();
    }
}

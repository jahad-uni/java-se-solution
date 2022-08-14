package Topic05.AnnotationEnumRegex.Lesson01Enum;

public class Lesson06EnumFieldsAndMethods {

    enum Directions {
        EAST("E","east"),
        WEST("W", "west"),
        NORTH("N", "north"),
        SOUTH("S", "south");

        // Important Note: Must have semicolon at
        // the end when there is a enum field or method

        private final String shortCode;
        private final String shortValue;

        Directions(String code,String value) {
            this.shortCode = code;
            this.shortValue = value;
        }

        public String getDirectionCode() {
            return this.shortCode;
        }

        public String getDirectionValue() {
            return this.shortValue;
        }
    }

    public static void main(String[] args) {
        Directions dir1 = Directions.SOUTH;
        System.out.println(dir1.getDirectionCode());
        System.out.println(dir1.getDirectionValue());
        Directions dir2 = Directions.EAST;
        System.out.println(dir2.getDirectionCode());
        System.out.println(dir2.getDirectionValue());
    }
}

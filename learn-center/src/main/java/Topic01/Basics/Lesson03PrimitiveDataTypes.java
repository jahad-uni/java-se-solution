package Topic01.Basics;

public class Lesson03PrimitiveDataTypes {
}


class Byte {

    public static void main(String[] args) {
        //range is -128 and 127
        //Default size : 1 byte
        //Default value: 0
        byte num = 0;
        System.out.println(num);
        num = 113;
        System.out.println(num);
    }
}

class Short {

    public static void main(String[] args) {
        // range is -32,768 to 32767
        //Default size: 2 byte
        //Default value: 0
        short num = 0;
        System.out.println(num);
        num = 32000;
        System.out.println(num);
    }
}

class Int {

    public static void main(String[] args) {
        //range is -2,147,483,648 to 2,147,483,647
        //Default size: 4 byte
        //Default value: 0
        int num = 0;
        System.out.println(num);
        num = 2000000000;
        System.out.println(num);
    }
}

class Long {

    public static void main(String[] args) {
        //range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //Default size: 8 byte
        //Default value: 0
        long num = -12332252626L;
        System.out.println(num);
    }
}

class Float {

    public static void main(String[] args) {
        //Sufficient for holding 6 to 7 decimal digits
        //Default size: 4 byte
        float num = 19.98f;
        System.out.println(num);
    }
}

class Double {

    public static void main(String[] args) {
        //Sufficient for holding 15 decimal digits
        //Default size: 8 byte
        double num = -42937737.9d;
        System.out.println(num);
    }
}


class Boolean {

    public static void main(String[] args) {
        //holds either true of false
        //Default size: 1 bit
        boolean b = false;
        System.out.println(b);
    }
}

class Char {

    public static void main(String[] args) {
        //holds characters
        //Default size: 2 byte
        char ch = 'Z';
        System.out.println(ch);
    }
}









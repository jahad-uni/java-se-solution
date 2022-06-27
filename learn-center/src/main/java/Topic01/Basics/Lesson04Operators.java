package Topic01.Basics;

public class Lesson04Operators {
}

class ArithmeticOperator {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 20;

        System.out.println("num1 + num2: " + (num1 + num2) );
        System.out.println("num1 - num2: " + (num1 - num2) );
        System.out.println("num1 * num2: " + (num1 * num2) );
        System.out.println("num1 / num2: " + (num1 / num2) );
        System.out.println("num1 % num2: " + (num1 % num2) );
    }
}

class AssignmentOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        num2 = num1;
        System.out.println("= Output: "+num2);

        num2 += num1;
        System.out.println("+= Output: "+num2);

        num2 -= num1;
        System.out.println("-= Output: "+num2);

        num2 *= num1;
        System.out.println("*= Output: "+num2);

        num2 /= num1;
        System.out.println("/= Output: "+num2);

        num2 %= num1;
        System.out.println("%= Output: "+num2);
    }
}

class AutoOperator {
    public static void main(String[] args){
        int num1=100;
        int num2=200;
        num1++;
        num2--;
        System.out.println("num1++ is: "+num1);
        System.out.println("num2-- is: "+num2);
    }
}

class LogicalOperator {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1&&b2));
        System.out.println("b1 || b2: " + (b1||b2));
        System.out.println("!(b1 && b2): " + !(b1&&b2));
    }
}

class RelationalOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 50;
        if (num1==num2) {
            System.out.println("num1 and num2 are equal");
        }
        else{
            System.out.println("num1 and num2 are not equal");
        }

        if( num1 != num2 ){
            System.out.println("num1 and num2 are not equal");
        }
        else{
            System.out.println("num1 and num2 are equal");
        }

        if( num1 > num2 ){
            System.out.println("num1 is greater than num2");
        }
        else{
            System.out.println("num1 is not greater than num2");
        }

        if( num1 >= num2 ){
            System.out.println("num1 is greater than or equal to num2");
        }
        else{
            System.out.println("num1 is less than num2");
        }

        if( num1 < num2 ){
            System.out.println("num1 is less than num2");
        }
        else{
            System.out.println("num1 is not less than num2");
        }

        if( num1 <= num2){
            System.out.println("num1 is less than or equal to num2");
        }
        else{
            System.out.println("num1 is greater than num2");
        }
    }
}

class BitwiseOperator {
    public static void main(String[] args) {

        int num1 = 11;  /* 11 = 00001011 */
        int num2 = 22;  /* 22 = 00010110 */
        int result = 0;

        result = num1 & num2;
        System.out.println("num1 & num2: "+result);

        result = num1 | num2;
        System.out.println("num1 | num2: "+result);

        result = num1 ^ num2;
        System.out.println("num1 ^ num2: "+result);

        result = ~num1;
        System.out.println("~num1: "+result);

        result = num1 << 2;
        System.out.println("num1 << 2: "+result); result = num1 >> 2;
        System.out.println("num1 >> 2: "+result);
    }
}

class TernaryOperator {

    public static void main(String[] args) {
        int num1, num2;
        num1 = 25;
        /* num1 is not equal to 10 that's why
         * the second value after colon is assigned
         * to the variable num2
         */
        num2 = (num1 == 10) ? 100: 200;
        System.out.println( "num2: "+num2);

        /* num1 is equal to 25 that's why
         * the first value is assigned
         * to the variable num2
         */
        num2 = (num1 == 25) ? 100: 200;
        System.out.println( "num2: "+num2);
    }
}

package Topic02.OOP;

public class Lesson16AccessModifier {
}

//default

class DefaultAddition {
    /* Since we didn't mention any access modifier here, it would
     * be considered as default.
     */
    int addTwoNumbers(int a, int b){
        return a+b;
    }
}

class DefaultExample {
    public static void main(String args[]){
        DefaultAddition obj = new DefaultAddition();
        /* It will throw error because we are trying to access
         * the default method in another package
         */
        obj.addTwoNumbers(10, 21);
    }
}

// private
class ABC{
    private double num = 100;
    private int square(int a){
        return a*a;
    }
}
class PrivateExample{
    public static void main(String args[]){
        FinalMethodExample obj = new FinalMethodExample();
        // Compile error
//        System.out.println(obj.num);
//        System.out.println(obj.square(10));
    }
}

//protected
class Addition {

    protected int addTwoNumbers(int a, int b){
        return a+b;
    }
}

class ProtectedExample extends Addition{
    public static void main(String args[]){
        ProtectedExample obj = new ProtectedExample();
        System.out.println(obj.addTwoNumbers(11, 22));
    }
}

// public
class PublicAddition {

    public int addTwoNumbers(int a, int b){
        return a+b;
    }
}
class PublicExample{
    public static void main(String args[]){
        PublicAddition obj = new PublicAddition();
        System.out.println(obj.addTwoNumbers(100, 1));
    }
}


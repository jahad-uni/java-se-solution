package Topic10.PopularDesignPatterns.Lesson01Singleton;

public class Lesson06SingletonBillPugh {

    public String msg;

    private Lesson06SingletonBillPugh(){
        msg = "Hello I am a string part of Singleton class";
    }

    private static class SingletonHelper{
        private static final Lesson06SingletonBillPugh INSTANCE = new Lesson06SingletonBillPugh();
    }

    public static Lesson06SingletonBillPugh getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        // Instantiating Singleton class with variable x
        Lesson06SingletonBillPugh x = Lesson06SingletonBillPugh.getInstance();

        // Instantiating Singleton class with variable y
        Lesson06SingletonBillPugh y = Lesson06SingletonBillPugh.getInstance();

        // instantiating Singleton class with variable z
        Lesson06SingletonBillPugh z = Lesson06SingletonBillPugh.getInstance();

        // Now  changing variable of instance x
        // via toUpperCase() method
        x.msg = (x.msg).toUpperCase();

        // Print and display commands
        System.out.println("String from x is: " + x.msg);
        System.out.println("String from y is: " + y.msg);
        System.out.println("String from z is: " + z.msg);
        System.out.println("\n");

        // Now again changing variable of instance x
        z.msg = (z.msg).toLowerCase();

        System.out.println("String from x is: " + x.msg);
        System.out.println("String from y is: " + y.msg);
        System.out.println("String from z is: " + z.msg);
    }
}

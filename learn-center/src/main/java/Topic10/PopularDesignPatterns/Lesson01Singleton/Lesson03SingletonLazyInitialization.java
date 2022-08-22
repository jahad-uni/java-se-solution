package Topic10.PopularDesignPatterns.Lesson01Singleton;

public class Lesson03SingletonLazyInitialization {

    private static Lesson03SingletonLazyInitialization instance;

    public String msg;

    private Lesson03SingletonLazyInitialization(){
        msg = "Hello I am a string part of Singleton class";
    }

    public static Lesson03SingletonLazyInitialization getInstance(){
        if(instance == null){
            instance = new Lesson03SingletonLazyInitialization();
        }
        return instance;
    }

    public static void main(String[] args) {
        // Instantiating Singleton class with variable x
        Lesson03SingletonLazyInitialization x = Lesson03SingletonLazyInitialization.getInstance();

        // Instantiating Singleton class with variable y
        Lesson03SingletonLazyInitialization y = Lesson03SingletonLazyInitialization.getInstance();

        // instantiating Singleton class with variable z
        Lesson03SingletonLazyInitialization z = Lesson03SingletonLazyInitialization.getInstance();

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

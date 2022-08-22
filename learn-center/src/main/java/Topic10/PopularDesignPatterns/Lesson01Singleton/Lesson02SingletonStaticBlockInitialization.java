package Topic10.PopularDesignPatterns.Lesson01Singleton;

public class Lesson02SingletonStaticBlockInitialization {

    private static Lesson02SingletonStaticBlockInitialization instance;

    public String msg;

    private Lesson02SingletonStaticBlockInitialization(){
        msg = "Hello I am a string part of Singleton class";
    }

    //static block initialization for exception handling
    static{
        try{
            instance = new Lesson02SingletonStaticBlockInitialization();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Lesson02SingletonStaticBlockInitialization getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        // Instantiating Singleton class with variable x
        Lesson02SingletonStaticBlockInitialization x = Lesson02SingletonStaticBlockInitialization.getInstance();

        // Instantiating Singleton class with variable y
        Lesson02SingletonStaticBlockInitialization y = Lesson02SingletonStaticBlockInitialization.getInstance();

        // instantiating Singleton class with variable z
        Lesson02SingletonStaticBlockInitialization z = Lesson02SingletonStaticBlockInitialization.getInstance();

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

package Topic10.PopularDesignPatterns.Lesson01Singleton;

public class Lesson04SingletonThreadSafe {

    private static Lesson04SingletonThreadSafe instance;

    public String msg;

    private Lesson04SingletonThreadSafe(){
        msg = "Hello I am a string part of Singleton class";
    }

    public static synchronized Lesson04SingletonThreadSafe getInstance(){
        if(instance == null){
            instance = new Lesson04SingletonThreadSafe();
        }
        return instance;
    }

    public static Lesson04SingletonThreadSafe getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (Lesson04SingletonThreadSafe.class) {
                if(instance == null){
                    instance = new Lesson04SingletonThreadSafe();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        // Instantiating Singleton class with variable x
        Lesson04SingletonThreadSafe x = Lesson04SingletonThreadSafe.getInstance();

        // Instantiating Singleton class with variable y
        Lesson04SingletonThreadSafe y = Lesson04SingletonThreadSafe.getInstance();

        // instantiating Singleton class with variable z
        Lesson04SingletonThreadSafe z = Lesson04SingletonThreadSafe.getInstanceUsingDoubleLocking();

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

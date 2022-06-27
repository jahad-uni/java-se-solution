package Topic02.OOP;

public class Lesson10StaticAndDynamicBinding {
}

//Static Binding
class BaseHuman {
    public static void walk()
    {
        System.out.println("Base Human walks");
    }
}
class Man extends BaseHuman {
    public static void walk(){
        System.out.println("Boy walks");
    }
    public static void main(String[] args) {
        /* Reference is of BaseHuman type and object is
         * Man type
         */
        BaseHuman obj = new Man();
        /* Reference is of BaseHuman type and object is
         * of BaseHuman type.
         */
        BaseHuman obj2 = new BaseHuman();
        obj.walk();
        obj2.walk();
    }
}

//Dynamic Binding
class NewHuman{
    //Overridden Method
    public void walk()
    {
        System.out.println("New Human walks");
    }
}

class Woman extends NewHuman{
    //Overriding Method
    public void walk(){
        System.out.println("Woman walks");
    }
    public static void main(String[] args) {
        /* Reference is of NewHuman type and object is
         * Woman type
         */
        NewHuman obj = new Woman();
        /* Reference is of NewHuman type and object is
         * of NewHuman type.
         */
        NewHuman obj2 = new NewHuman();
        obj.walk();
        obj2.walk();
    }
}

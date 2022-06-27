package Topic01.Basics;

public class Lesson02Variables {

}

class StaticVariable {
    public static String myClassVar="class or static variable";

    public static void main(String args[]){
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();

        //All three will display "class or static variable"
        System.out.println("obj1: " + obj1.myClassVar);
        System.out.println("obj2: " + obj2.myClassVar);
        System.out.println("obj3: " + obj3.myClassVar);

        //changing the value of static variable using obj2
        obj2.myClassVar = "Changed Text";

        //All three will display "Changed Text"
        System.out.println("obj1: " + obj1.myClassVar);
        System.out.println("obj2: " + obj2.myClassVar);
        System.out.println("obj3: " + obj3.myClassVar);
    }
}

class InstanceVariable {
    String myInstanceVar="instance variable";

    public static void main(String args[]){
        InstanceVariable obj1 = new InstanceVariable();
        InstanceVariable obj2 = new InstanceVariable();
        InstanceVariable obj3 = new InstanceVariable();

        System.out.println("obj1: " + obj1.myInstanceVar);
        System.out.println("obj2: " + obj2.myInstanceVar);
        System.out.println("obj3: " + obj3.myInstanceVar);


        obj2.myInstanceVar = "Changed Text";


        System.out.println("obj1: " + obj1.myInstanceVar);
        System.out.println("obj2: " + obj2.myInstanceVar);
        System.out.println("obj3: " + obj3.myInstanceVar);
    }
}

class LocalWithInstanceVariable {
    // instance variable
    public String myVar="instance variable";

    public void myMethod(){
        // local variable
        String myVar = "Inside Method";
        System.out.println(myVar);
    }
    public static void main(String args[]){

        LocalWithInstanceVariable obj = new LocalWithInstanceVariable();

        System.out.println("Calling Method");
        obj.myMethod();
        System.out.println(obj.myVar);
    }
}

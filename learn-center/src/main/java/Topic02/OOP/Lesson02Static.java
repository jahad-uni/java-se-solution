package Topic02.OOP;

public class Lesson02Static {
}

class SingleStaticBlock {
    static int num;
    static String mystr;
    static{
        num = 97;
        mystr = "Static keyword in Java";
    }
    public static void main(String[] args)
    {
        System.out.println("Value of num: "+num);
        System.out.println("Value of mystr: "+mystr);
    }
}

// multiple static blocks execute in the given order
// which means the first static block executes before second static block
class MultipleStaticBlock {
    static int num;
    static String mystr;
    //First Static block
    static{
        System.out.println("Static Block 1");
        num = 68;
        mystr = "Block1";
    }
    //Second static block
    static{
        System.out.println("Static Block 2");
        num = 98;
        mystr = "Block2";
    }
    public static void main(String args[])
    {
        System.out.println("Value of num: "+num);
        System.out.println("Value of mystr: "+mystr);
    }
}

class StaticMethod {
    static int i = 10;
    static String s = "hello to all";
    //This is a static method
    public static void main(String args[])
    {
        // static method access to static variable
        System.out.println("i:"+i);
        System.out.println("s:"+s);
    }
}

class StaticMethodAccessedInStaticAndNonStaticMethods {
    static int i = 100;
    static String s = "Beginnersbook";
    //Static method
    static void display()
    {
        System.out.println("i:"+i);
        System.out.println("i:"+s);
    }

    //non-static method
    void funcn()
    {
        //Static method called in non-static method
        display();
    }
    //static method
    public static void main(String args[])
    {
        StaticMethodAccessedInStaticAndNonStaticMethods obj = new StaticMethodAccessedInStaticAndNonStaticMethods();
        //You need to have object to call this non-static method
        obj.funcn();

        //Static method called in another static method
        display();
    }
}

class StaticVarCallInStaticMethod {
    static int var1;
    static String var2;
    //This is a Static Method
    static void disp(){
        System.out.println("Var1 is: "+var1);
        System.out.println("Var2 is: "+var2);
    }
    public static void main(String args[])
    {
        disp();
    }
}

class StaticVarSharedBetweenAllInstancesOfClass {
    //Static integer variable
    static int var1=77;
    //non-static string variable
    String var2;

    public static void main(String[] args)
    {
        StaticVarSharedBetweenAllInstancesOfClass ob1 = new StaticVarSharedBetweenAllInstancesOfClass();
        StaticVarSharedBetweenAllInstancesOfClass ob2 = new StaticVarSharedBetweenAllInstancesOfClass();
        /* static variables can be accessed directly without
         * any instances. Just to demonstrate that static variables
         * are shared, I am accessing them using objects so that
         * we can check that the changes made to static variables
         * by one object, reflects when we access them using other
         * objects
         */
        //Assigning the value to static variable using object ob1
        ob1.var1=88;
        ob1.var2="I'm Object1";
        /* This will overwrite the value of var1 because var1 has a single
         * copy shared among both the objects.
         */
        ob2.var1=99;
        ob2.var2="I'm Object2";
        System.out.println("ob1 integer:"+ob1.var1);
        System.out.println("ob1 String:"+ob1.var2);
        System.out.println("ob2 integer:"+ob2.var1);
        System.out.println("ob2 String:"+ob2.var2);
    }
}

class StaticClass {
    private static String str = "Hello to All";

    //nested class can only be static class
    static class MyNestedClass{
        //non-static method
        public void disp() {

            /* If you make the str variable of outer class
             * non-static then you will get compilation error
             * because: a nested static class cannot access non-
             * static members of the outer class.
             */
            System.out.println(str);
        }

    }

    public static void main(String[] args)
    {
        /* To create instance of nested class we didn't need the outer
         * class instance but for a regular nested class you would need
         * to create an instance of outer class first
         */
        StaticClass.MyNestedClass obj = new StaticClass.MyNestedClass();
        obj.disp();
    }
}

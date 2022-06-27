package Topic02.OOP;

public class Lesson07MethodOverriding {
}

class Human{
    //Overridden method
    public void eat()
    {
        System.out.println("Human is eating");
    }
}
class Boy extends Human{
    //Overriding method
    @Override
    public void eat(){
        System.out.println("Boy is eating");
    }
    public static void main(String[] args) {
        Boy obj = new Boy();
        //This will call the child class version of eat()
        obj.eat();
    }
}

class ParentRefAccess {
    //Overridden method
    public void disp()
    {
        System.out.println("disp() method of parent class");
    }
}
class ChildRefAccess extends ParentRefAccess {
    //Overriding method

    public void disp(){
        System.out.println("disp() method of Child class");
    }
    public void newMethod(){
        System.out.println("new method of child class");
    }
    public static void main(String[] args) {
        /* When Parent class reference refers to the parent class object
         * then in this case overridden method (the method of parent class)
         *  is called.
         */
        ParentRefAccess obj = new ParentRefAccess();
        obj.disp();

        /* When parent class reference refers to the child class object
         * then the overriding method (method of child class) is called.
         * This is called dynamic method dispatch and runtime polymorphism
         */
        ParentRefAccess obj2 = new ChildRefAccess();
        obj2.disp();
    }
}

//Downward Access Modifier change in overriding methods Throw compile error
class MyBaseClass{
    public void disp()
    {
        System.out.println("Parent class method");
    }
}
class MyChildClass extends MyBaseClass{

    //bellow line throw compile error because of weaker privillage
//    protected void disp(){
//        System.out.println("Child class method");
//    }
    public static void main(String[] args) {
        MyChildClass obj = new MyChildClass();
        obj.disp();
    }
}


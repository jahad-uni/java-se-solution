package Topic02.OOP;

public class Lesson05Super {
}

// use super keyword to access the variables of parent class

class Superclass
{
    int num = 100;
}
//Child class or subclass or derived class
class SubclassWithoutSuperCall extends Superclass
{
    /* The same variable num is declared in the SubclassWithoutSuperCall
     * which is already present in the Superclass
     */
    int num = 110;
    void printNumber(){
        System.out.println(num);
    }
    public static void main(String[] args){
        SubclassWithoutSuperCall obj= new SubclassWithoutSuperCall();
        obj.printNumber();
    }
}

class SubclassWithSuperCall extends Superclass
{
    int num = 110;
    void printNumber(){
        /* Note that instead of writing num we are
         * writing super.num in the print statement
         * this refers to the num variable of Superclass
         */
        System.out.println(super.num);
    }
    public static void main(String args[]){
        SubclassWithSuperCall obj= new SubclassWithSuperCall();
        obj.printNumber();
    }
}

//Use of super keyword to invoke constructor of parent class
class ParentClass
{
    //no-arg constructor
    ParentClass(){
        System.out.println("no-arg constructor of parent class");
    }
    //arg or parameterized constructor
    ParentClass(String str){
        System.out.println("parameterized constructor of parent class");
    }
//    Overridden method
    void display(){
        System.out.println("Parent class method");
    }
}
class SubclassCallParentConstructorWithSuper extends ParentClass
{
    SubclassCallParentConstructorWithSuper(){
        /* super() must be added to the first statement of constructor
         * otherwise you will get a compilation error. Another important
         * point to note is that when we explicitly use super in constructor
         * the compiler doesn't invoke the parent constructor automatically.
         */
        super("Hahaha");
        System.out.println("Constructor of SubclassCallParentConstructorWithSuper class");

    }
    void display(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        SubclassCallParentConstructorWithSuper obj= new SubclassCallParentConstructorWithSuper();
        obj.display();
    }
}

// use super keyword in case of method overriding
class Subclass extends ParentClass
{
    //Overriding method
    void display(){
        System.out.println("Child class method");
    }
    void printMsg(){
        //This would call Overriding method
        display();
        //This would call Overridden method
        super.display();
    }
    public static void main(String args[]){
        Subclass obj= new Subclass();
        obj.printMsg();
    }
}

package Topic02.OOP;

public class Lesson11Abstract {
}

//abstract parent class
abstract class BaseAnimal {
    //abstract method
    public abstract void sound();
}
//Dog class extends BaseAnimal class
class Dog extends BaseAnimal {

    public void sound(){
        System.out.println("Woof");
    }
    public static void main(String[] args){
        BaseAnimal obj = new Dog();
        obj.sound();
    }
}

// Can not creat object from abstract class
abstract class AbstractDemo{
    public void myMethod(){
        System.out.println("Hello");
    }
    abstract public void anotherMethod();
}
class Demo extends AbstractDemo{

    public void anotherMethod() {
        System.out.print("Abstract method");
    }
    public static void main(String[] args)
    {
        //error: You can't create object of it
//        AbstractDemo obj = new AbstractDemo();
//        obj.anotherMethod();
    }
}


//abstract class
abstract class Summ{
    /* These two are abstract methods, the child class
     * must implement these methods
     */
    public abstract int sumOfTwo(int n1, int n2);
    public abstract int sumOfThree(int n1, int n2, int n3);

    //Regular method
    public void disp(){
        System.out.println("Method of class Sum");
    }
}
//Regular class extends abstract class
class SumDemo extends Summ{

    // If I don't provide the implementation of these two methods, the
     // program will throw compilation error.
    public int sumOfTwo(int num1, int num2){
        return num1+num2;
    }
    public int sumOfThree(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static void main(String[] args){
        Summ obj = new SumDemo();
        System.out.println(obj.sumOfTwo(3, 7));
        System.out.println(obj.sumOfThree(4, 3, 19));
        obj.disp();
    }
}

//Abstract in Interface
interface Multiply{
    //abstract methods
    public abstract int multiplyTwo(int n1, int n2);

    // We need not to mention public and abstract in interface
    // as all the methods in interface are
     // public and abstract by default so the compiler will
    // treat this as
    // public abstract multiplyThree(int n1, int n2, int n3);
    int multiplyThree(int n1, int n2, int n3);

     // Regular (or concrete) methods are not allowed in an interface
     // so if I uncomment this method, you will get compilation error
     // public void disp(){
     //    System.out.println("I will give error if u uncomment me");
     // }

}

class MultiplyDemo implements Multiply{
    public int multiplyTwo(int num1, int num2){
        return num1*num2;
    }
    public int multiplyThree(int num1, int num2, int num3){
        return num1*num2*num3;
    }
    public static void main(String[] args){
        Multiply obj = new MultiplyDemo();
        System.out.println(obj.multiplyTwo(3, 7));
        System.out.println(obj.multiplyThree(1, 9, 0));
    }
}


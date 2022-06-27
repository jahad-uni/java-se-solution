package Topic02.OOP;

public class Lesson09Polymorphism {
}
//Runtime Polymorphism OR Dynamic Polymorphism
class Animal{
    public void sound(){
        System.out.println("BaseAnimal is making a sound");
    }
}

class Horse extends BaseAnimal {
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    public static void main(String[] args){
        BaseAnimal obj = new Horse();
        obj.sound();
    }
}

class Cat extends BaseAnimal {
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    public static void main(String[] args){
        BaseAnimal obj = new Cat();
        obj.sound();
    }
}

//compile time Polymorphism OR Static Polymorphism
class Overload
{
    void demo (int a)
    {
        System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
        System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}
class MethodOverloading
{
    public static void main (String[] args)
    {
        Overload Obj = new Overload();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);
    }
}

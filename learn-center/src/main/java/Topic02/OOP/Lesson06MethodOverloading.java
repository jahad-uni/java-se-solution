package Topic02.OOP;

public class Lesson06MethodOverloading {
}

//Overloading is Static Polymorphism
class DisplayOverloadingWithDifferentNumberOfParameters
{
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(char c, int num)
    {
        System.out.println(c + " "+num);
    }

    public static void main(String[] args)
    {
        DisplayOverloadingWithDifferentNumberOfParameters obj = new DisplayOverloadingWithDifferentNumberOfParameters();
        obj.disp('a');
        obj.disp('a',10);
    }
}


class DisplayOverloadingWithDifferentDataTypes
{
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
        System.out.println(c );
    }
    public static void main(String[] args)
    {
        DisplayOverloadingWithDifferentDataTypes obj = new DisplayOverloadingWithDifferentDataTypes();
        obj.disp('a');
        obj.disp(5);
    }
}


class DisplayOverloadingWithDifferentSequenceOfDataTypes
{
    public void disp(char c, int num)
    {
        System.out.println("I’m the first definition of method disp");
    }
    public void disp(int num, char c)
    {
        System.out.println("I’m the second definition of method disp" );
    }

    public static void main(String[] args)
    {
        DisplayOverloadingWithDifferentSequenceOfDataTypes obj = new DisplayOverloadingWithDifferentSequenceOfDataTypes();
        obj.disp('x', 51 );
        obj.disp(52, 'y');
    }
}

class DisplayOverloadingWithTypePromotion {

    void disp(int a, double b){
        System.out.println("Method A");
    }
    void disp(int a, double b, double c){
        System.out.println("Method B");
    }
    public static void main(String args[]){
        DisplayOverloadingWithTypePromotion obj = new DisplayOverloadingWithTypePromotion();
        /* I am passing float value as a second argument but
         * it got promoted to the type double, because there
         * wasn't any method having arg list as (int, float)
         */
        obj.disp(100, 20.67f);
    }
}

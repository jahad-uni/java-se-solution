package Topic02.OOP;

public class Lesson08OverloadingVSOverriding {
}

// overloading
class Sum
{
    int add(int n1, int n2)
    {
        return n1+n2;
    }
    int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
    int add(int n1, int n2, int n3, int n4)
    {
        return n1+n2+n3+n4;
    }
    int add(int n1, int n2, int n3, int n4, int n5)
    {
        return n1+n2+n3+n4+n5;
    }
    public static void main(String args[])
    {
        Sum obj = new Sum();
        System.out.println("Sum of two numbers: "+obj.add(20, 21));
        System.out.println("Sum of three numbers: "+obj.add(20, 21, 22));
        System.out.println("Sum of four numbers: "+obj.add(20, 21, 22, 23));
        System.out.println("Sum of five numbers: "+obj.add(20, 21, 22, 23, 24));
    }
}

// overriding
class BaseCar {
    public int speedLimit()
    {
        return 100;
    }
}

class Ford extends BaseCar
{
    public int speedLimit()
    {
        return 150;
    }
    public static void main(String[] args)
    {
        BaseCar obj = new Ford();
        int num= obj.speedLimit();
        System.out.println("Speed Limit is: "+num);
    }
}

package Topic02.OOP;

public class Lesson12Interface {
}

interface Person
{
    public String name = "farhad";
    final String family = "noori";
    public static final int age=10;

//    int code; throw compile time error
}

class PersonImpl implements Person
{
    public static void main(String args[])
    {
        // age=20; compile time error
    }
}

//-----------------------------------------
interface A
{
    public void aaa();
}
interface B
{
    public void aaa();
}
class Central implements A,B
{
    public void aaa()
    {
        //Any Code here
    }
    public static void main(String[] args)
    {
        //Statements
    }
}

//-----------------------------------------

//interface AA
//{
//    public void aaa();
//}
//interface BB
//{
//    public int aaa();
//}
//
//class CentralImpl implements A,B
//{
//
//    public void aaa() // error
//    {
//    }
//    public int aaa() // error
//    {
//    }
//    public static void main(String[] args)
//    {
//
//    }
//}

//-----------------------------------------
interface AA
{
    int x=10;
}
interface BB
{
    int x=100;
}
class Hello implements AA,BB
{
    public static void main(String[] args)
    {
        /* reference to x is ambiguous both variables are x
         * so we are using interface name to resolve the
         * variable
         */
//        System.out.println(x);
        System.out.println(AA.x);
        System.out.println(BB.x);
    }
}

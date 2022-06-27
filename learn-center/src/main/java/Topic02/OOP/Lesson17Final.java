package Topic02.OOP;

public class Lesson17Final {
}
// final variable
class FinalVariable {

    final int MAX_VALUE=99;
    void myMethod(){
        //compile error
//        MAX_VALUE=101;
    }
    public static void main(String[] args){
        FinalVariable obj=new FinalVariable();
        obj.myMethod();
    }
}
//-----------------------------------------------------
// final blank variable
class FinalBlankVariable{
    //Blank final variable
    final int MAX_VALUE;

    FinalBlankVariable(){
        //It must be initialized in constructor
        MAX_VALUE=100;
    }
    void myMethod(){
        System.out.println(MAX_VALUE);
    }
    public static void main(String[] args){
        FinalVariable obj=new  FinalVariable();
        obj.myMethod();
    }
}

class StudentData{
    //Blank final variable
    final int ROLL_NO;

    StudentData(int rnum){
        //It must be initialized in constructor
        ROLL_NO=rnum;
    }
    void myMethod(){
        System.out.println("Roll no is:"+ROLL_NO);
    }
    public static void main(String args[]){
        StudentData obj=new  StudentData(1234);
        obj.myMethod();
    }
}

//-----------------------------------------------------
//Uninitialized static final variable
class UninitializedStaticfinalVariabl {
    //static blank final variable  
    static final int ROLL_NO;
    static{
        ROLL_NO=1230;
    }
    public static void main(String args[]){
        System.out.println(UninitializedStaticfinalVariabl.ROLL_NO);
    }
}
//-----------------------------------------------------
// final method  : cannot override
class FinalMethod {
    final void demo(){
        System.out.println("FinalMethod Class Method");
    }
}

class FinalMethodExample extends FinalMethod {
    //compile error
//    void demo(){
//        System.out.println("FinalMethodExample Class Method");
//    }

    public static void main(String[] args){
        FinalMethodExample obj= new FinalMethodExample();
        obj.demo();
    }
}

//-----------------------------------------------------

//final class : can not extend
final class FinalClass {
}
//compile error

//class FinalClassExample extends FinalClass {
//    void demo(){
//        System.out.println("My Method");
//    }
//    public static void main(String args[]){
//        FinalClassExample obj= new FinalClassExample();
//        obj.demo();
//    }
//}
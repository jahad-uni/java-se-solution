package Topic06.MiscellaneousJavaCore.Lesson04WrapperClass;

public class Lesson02WrapperClassEx2 {

    public static void main(String args[]){
        //Creating Wrapper class object
        Integer obj = new Integer(100);

        //Converting the wrapper object to primitive
        int num = obj.intValue();

        System.out.println(num+ " "+ obj);
    }
}

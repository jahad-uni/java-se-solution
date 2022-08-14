package Topic06.MiscellaneousJavaCore.Lesson04WrapperClass;

public class Lesson01WrapperClassEx1 {

    public static void main(String args[]){
        //Converting int primitive into Integer object
        int num=100;
        Integer obj=Integer.valueOf(num);

        System.out.println(num+ " "+ obj);
    }
}

// Tips about WrapperClasses
// 1 - one of the reason why we need wrapper is to use them in collections API. On the other hand the wrapper objects hold much more memory compared to primitive types. So use primitive types when you need efficiency and use wrapper class when you need objects instead of primitive types.
// 2 - The primitive data types are not objects so they do not belong to any class. While storing in data structures which support only objects, it is required to convert the primitive type to object first which we can do by using wrapper classes.
// 3 - Wrapper class objects allow null values while primitive data type doesn’t allow it.
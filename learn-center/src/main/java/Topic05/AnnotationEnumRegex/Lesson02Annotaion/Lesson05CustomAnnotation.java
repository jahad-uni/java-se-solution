package Topic05.AnnotationEnumRegex.Lesson02Annotaion;

import java.lang.annotation.*;
import java.lang.reflect.Method;

//Creating annotation
@Retention(RetentionPolicy.RUNTIME)  //SOURCE , CLASS, RUNTIME
@Target(ElementType.METHOD) // ANNOTATION_TYPE, CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE
@Inherited
@Documented
@interface MyAnnotation{
    int value() default 1;
}

//Applying annotation
public class Lesson05CustomAnnotation {

    @MyAnnotation()
    public void sayHello1(){
        System.out.println("hello annotation");
    }
    @MyAnnotation(value = 10)
    public void sayHello2(){
        System.out.println("hello annotation");
    }

    public static void main(String args[])throws Exception{

        //Accessing annotation
        Lesson05CustomAnnotation h=new Lesson05CustomAnnotation();

        Method sayHello1=h.getClass().getMethod("sayHello1");
        MyAnnotation myAnnotation1=sayHello1.getAnnotation(MyAnnotation.class);
        System.out.println("sayHello1 value is: " + myAnnotation1.value());

        Method sayHello2=h.getClass().getMethod("sayHello2");
        MyAnnotation myAnnotation2=sayHello2.getAnnotation(MyAnnotation.class);
        System.out.println("sayHello2 value is: " + myAnnotation2.value());

    }
}

class Child extends Lesson05CustomAnnotation {

    public static void main(String[] args) throws NoSuchMethodException {

        Child child = new Child();
        //Accessing annotation
        Method child_sayHello2=child.getClass().getMethod("sayHello2");
        MyAnnotation child_myAnnotation=child_sayHello2.getAnnotation(MyAnnotation.class);
        System.out.println("Child sayHello2 value is: " + child_myAnnotation.value());
    }
}



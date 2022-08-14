package Topic05.AnnotationEnumRegex.Lesson02Annotaion;

public class Dog extends Animal {

    @Override
    void eatSomething(){
        System.out.println("eating foods");
    }

    @Deprecated
    void eatOld(){
        System.out.println("eating food with old style");
    }

}

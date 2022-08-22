package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lesson10FindMethod {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,2,1);
        // findFirst()
        System.out.println("findFirst()...");
        Optional<Integer> firstElement = list.stream().findFirst();
        if(firstElement.isPresent())
            System.out.println(firstElement.get());
        else
            System.out.println("stream is empty");

        // findAny()
        System.out.println("findFirst()...");
        Optional<Integer> anyElement = list.stream().findAny();
        if(anyElement.isPresent())
            System.out.println(anyElement.get());
        else
            System.out.println("stream is empty");
    }
}

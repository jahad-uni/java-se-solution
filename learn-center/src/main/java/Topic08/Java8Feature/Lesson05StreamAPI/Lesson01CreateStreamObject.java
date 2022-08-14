package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Lesson01CreateStreamObject {

    public static void main(String[] args) {

        //create Stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);

        //Create Stream from sources
        Collection<String> collection = Arrays.asList("JAVA","J2EE","Spring","Hibernate");
        Stream<String> stream1 = collection.stream();
        stream1.forEach(System.out::println);
    }
}

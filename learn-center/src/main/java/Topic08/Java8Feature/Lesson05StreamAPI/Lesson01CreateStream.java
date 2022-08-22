package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class Lesson01CreateStream {

    public static void main(String[] args) {

        //How do on stream
        //Sources-->Filter-->Sort-->Map-->Collect

        //create Stream
        Stream<String> stream1 = Stream.of("a", "b", "c");
        stream1.forEach(System.out::println);

        //Create Stream from Collection sources
        Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        //Create Stream from List sources
        List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        //Create Stream from Set sources
        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);

        //Create Stream from Array sources
        String[] strArray = {"a", "b", "c"};
        Stream<String> stream5 = Arrays.stream(strArray);
        stream5.forEach(System.out::println);

    }
}

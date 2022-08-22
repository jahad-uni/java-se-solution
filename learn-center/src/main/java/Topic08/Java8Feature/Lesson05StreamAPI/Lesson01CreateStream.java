package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class Lesson01CreateStream {
/*
    Stream operations can either be executed sequentially or parallel.
    when performed parallelly, it is called a parallel stream.

    Based on the above points, a stream is :

    - Not a data structure
    - Designed for lambdas
    - Do not support indexed access
    - Can easily be aggregated as arrays or lists
    - Lazy access
    - supported Parallelizable
    */

//    ******************************
//How do on stream
//Sources-->Filter-->Sort-->Map-->Collect
/*
Working with Streams
  -Creating Streams
    + concat()
    + empty()
    + generate()
    + iterate()
    + of()
 -Intermediate Operations
    + filter()
    + map()
    + flatMap()
    + distinct()
    + sorted()
    + peek()
    + limit()
    + skip()
 -Terminal Operations
    + forEach()
    + forEachOrdered()
    + toArray()
    + reduce()
    + collect()
    + min()
    + max()
    + count()
    + anyMatch()
    + allMatch()
    + noneMatch()
    + findFirst()
    + findAny()
        */
    public static void main(String[] args) {

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

        // generate stream using generate method
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));

        randomNumbers.limit(20).forEach(System.out::println);

    }
}

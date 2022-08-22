package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.Comparator;
import java.util.stream.Stream;

public class Lesson11CountMinMaxMethod {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println("Count of Stream -> " + stream.count());

        Integer minVal = Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min Value of Stream -> " + minVal);

        Integer maxVal = Stream.of(1,2,3,4,5,6,7,8,9).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max Value of Stream -> " + maxVal);
    }
}

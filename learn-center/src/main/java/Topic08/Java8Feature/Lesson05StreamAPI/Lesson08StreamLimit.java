package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson08StreamLimit {
    public static void main(String[] args) {

        //remove all the integers excluding first three and print them.

        //Before java 8
        System.out.println("**** before java 8 ****");
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(4);
        numList.add(12);
        numList.add(7);
        numList.add(16);
        numList.add(17);
        numList.add(19);
        numList.add(20);
        numList.add(34);
        numList.add(56);

        int limit = 3;
        int count = 0;
        Iterator<Integer> iterate = numList.iterator();
        while (iterate.hasNext()) {
            iterate.next();
            count++;
            if (count > limit) {
                iterate.remove();
            }
        }
        for (Integer number : numList) {
            System.out.println(number);
        }

        //Using limit in java 8
        System.out.println("**** Using limit in java 8 ****");
        List<Integer> tempList = numList.stream().limit(3).collect(Collectors.toList());
        tempList.forEach(e -> System.out.println(e));

    }
}

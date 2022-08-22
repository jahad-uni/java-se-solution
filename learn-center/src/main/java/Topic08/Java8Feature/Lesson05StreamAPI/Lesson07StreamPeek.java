package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson07StreamPeek {


     // peek() used for debugging
    public static void main(String[] args) {

        // before java 8
        List<Integer> filterList = new ArrayList<>();
        List<Integer> numList = Arrays.asList(1,3,4,5,2,7,9);
        for(Integer num:numList){
            if(num >= 5){
                filterList.add(num);
                System.out.println("Filtered Value : "+num);
            }
        }

        List<Integer> finalList = new ArrayList<Integer>();
        for(Integer num:filterList){
            if(num < 9){
                finalList.add(num);
            }
        }
        System.out.println(finalList);

        // using peek() in java 8
        List<Integer> filterList1 = numList.stream().filter(e -> e >= 5)
                .peek(e -> System.out.println("Filtered value: " + e))
                .filter(e -> e < 9)
                .collect(Collectors.toList());
        System.out.println(filterList1);
    }
}

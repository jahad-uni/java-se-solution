package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson09StreamSkip {

    public static void main(String[] args) {

       //remove first three integers and print rest of them.

        //Before java 8
        System.out.println("**** before java 8 ****");
        List<Integer> numList = new ArrayList<>();
        numList.add(2); numList.add(4);
        numList.add(12); numList.add(7);
        numList.add(16); numList.add(17);
        numList.add(19); numList.add(20);
        numList.add(34); numList.add(56);

        int limit = 3;
        int count = 0;
        Iterator<Integer> iterate = numList.iterator();
        while(iterate.hasNext()){
            iterate.next();
            count++;
            if(count <= limit){
                iterate.remove();
            }
        }
        for(Integer number : numList){
            System.out.println(number);
        }
        //Using skip in java 8
        System.out.println("**** Using skip in java 8 ****");
        Integer[] num = new Integer[]{2,4,12,7,16,17,19,20,34,56};
        List<Integer> numList1 = Arrays.asList(num);
        List<Integer> tempList = numList1.stream().skip(3).collect(Collectors.toList());
        tempList.forEach(e -> System.out.println(e));
    }
}

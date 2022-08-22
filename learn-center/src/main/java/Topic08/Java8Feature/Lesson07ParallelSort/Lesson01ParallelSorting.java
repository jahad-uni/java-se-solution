package Topic08.Java8Feature.Lesson07ParallelSort;

import java.util.Arrays;

public class Lesson01ParallelSorting {

    public static void main(String[] args) {

        //**************  Sorting Primitive Data types with Parallel Sort ***************
        System.out.println("**************  Sorting Primitive Data types with Parallel Sort ***************");
        int[] numbers = {22, 89, 1, 32, 19, 5};
        //Parallel Sort method for sorting int array
        Arrays.parallelSort(numbers);
        //converting the array to stream and displaying using forEach
        Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
        System.out.println("");

        //**************  Parallel Sort by specifying the start and end index ***************
        System.out.println("**************  Parallel Sort by specifying the start and end index ***************");
        /* Specifying the start and end index. The start index is
         * 1 here and the end index is 5. which means the elements
         * starting from index 1 till index 5 would be sorted.
         */
        Arrays.parallelSort(new int[]{22, 89, 1, 32, 19, 5}, 1, 5);
        //converting the array to stream and displaying using forEach
        Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
    }
}

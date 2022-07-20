package Topic04.Collections.Lesson12PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Lesson01PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue =
                new PriorityQueue<>(15, new MyComparator());
        queue.add("Hello");
        queue.add("Hello To All");
        queue.add("Hello To");
        queue.add("Hello To All of You, My Friends");
        queue.add("Hello To All of You");

        /*
         * What I am doing here is removing the highest
         * priority element from Queue and displaying it.
         * The priority I have set is based on the string
         * length. The logic for it is written in Comparator
         */
        while (queue.size() != 0)
            System.out.println(queue.poll());

    }
}

class MyComparator implements Comparator<String> {
    @Override
    public int compare(String x, String y) {
        return x.length() - y.length();
    }
}

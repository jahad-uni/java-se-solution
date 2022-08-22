package Topic08.Java8Feature.Lesson06Foreach;

import java.util.HashMap;
import java.util.Map;

public class MapForeach {

    public static void main(String[] args) {

        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person("farhad", 37));
        personMap.put(2, new Person("mehrdad", 36));

        // for before java 8
        System.out.println("using simple for loop");
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getName());
        }

        // forEach + lambda
        System.out.println("using forEach + lambda");
        personMap.forEach((k, v) -> {
                    System.out.println(k);
                    System.out.println(v.getName());

                }
        );
    }
}

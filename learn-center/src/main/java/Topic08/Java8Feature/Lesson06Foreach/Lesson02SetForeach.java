package Topic08.Java8Feature.Lesson06Foreach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lesson02SetForeach {
    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("farhad", 37));
        personSet.add(new Person("mehrdad", 36));
        personSet.add(new Person("ali", 63));
        personSet.add(new Person("ramin", 32));


        // before java 8
        for(Person person : personSet){
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }

        // use forEach + lambda
        personSet.forEach(person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

        // use stream + foreach
        personSet.stream().forEach(person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });
    }
}


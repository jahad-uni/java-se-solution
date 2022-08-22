package Topic08.Java8Feature.Lesson06Foreach;

import java.util.ArrayList;
import java.util.List;

public class Lesson01ListForeach {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("farhad", 37));
        personList.add(new Person("mehrdad", 36));
        personList.add(new Person("ali", 63));
        personList.add(new Person("ramin", 32));

        // before java 8
        for (Person person : personList) {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }

        // forEach on list
        personList.forEach(person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

        // forEach on stream
        personList.stream().forEach(person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });
    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

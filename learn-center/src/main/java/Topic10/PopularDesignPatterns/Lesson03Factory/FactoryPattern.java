package Topic10.PopularDesignPatterns.Lesson03Factory;

public class FactoryPattern {
    public static void main(String[] args) {

        //Factory by animal
        Animal dog = (Animal) FactoryProvider.getFactory("animal").create("dog");
        System.out.println(dog.getAnimal());
        System.out.println(dog.makeSound());

        //Factory by color
        Animal duck = (Animal) FactoryProvider.getFactory("color").create("white");
        System.out.println(duck.getAnimal());
        System.out.println(duck.makeSound());

    }
}

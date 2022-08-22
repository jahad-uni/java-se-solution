package Topic10.PopularDesignPatterns.Lesson03Factory;

public class Duck implements Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Queck Queck";
    }
}
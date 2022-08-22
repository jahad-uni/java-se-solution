package Topic10.PopularDesignPatterns.Lesson03Factory;

public class Dog implements Animal{
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Hop Hop";
    }
}

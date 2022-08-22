package Topic10.PopularDesignPatterns.Lesson03Factory;

public class Cat implements Animal{
    @Override
    public String getAnimal() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Mio Mio";
    }
}

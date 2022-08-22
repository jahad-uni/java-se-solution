package Topic10.PopularDesignPatterns.Lesson03Factory;

public class AnimalFactory implements AbstractFactory<Animal>{

    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }else if("Cat".equalsIgnoreCase(animalType))
            return new Cat();
        return null;
    }
}

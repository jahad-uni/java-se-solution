package Topic10.PopularDesignPatterns.Lesson03Factory;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}

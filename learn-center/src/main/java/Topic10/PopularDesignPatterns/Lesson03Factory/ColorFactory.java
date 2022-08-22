package Topic10.PopularDesignPatterns.Lesson03Factory;

public class ColorFactory implements AbstractFactory<Animal>{
    @Override
    public Animal create(String color) {
        if ("Brown".equalsIgnoreCase(color)) {
            return new Dog();
        } else if ("White".equalsIgnoreCase(color)) {
            return new Duck();
        }else if("Black".equalsIgnoreCase(color))
            return new Cat();
        return null;
    }
}

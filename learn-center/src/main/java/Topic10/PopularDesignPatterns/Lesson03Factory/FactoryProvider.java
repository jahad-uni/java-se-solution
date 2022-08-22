package Topic10.PopularDesignPatterns.Lesson03Factory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {

        if ("Animal".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }

        return null;
    }
}

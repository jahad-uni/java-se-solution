package Topic08.Java8Feature.Lesson01LambdaExpressionsAndFunctionalInterface;

@FunctionalInterface
interface Shape {
    void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle Class : draw() method");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square Class : draw() method");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle Class : draw() method");
    }
}

public class Lesson01LambdaExample {

    public static void main(String[] args) {

        Shape rectangle = () -> {
            System.out.println("Rectangle Class : draw() method");
        };
        rectangle.draw();

        Shape square = () -> System.out.println("Square Class : draw() method");
        square.draw();

        Shape circle = () -> System.out.println("Circle Class : draw() method");
        circle.draw();

        // Send lambda as method parameters
        System.out.println("*****************Send lambda as method parameters****************");
        print(rectangle);
        print(square);
        print(circle);
        // or this way
        print(() -> System.out.println("Rectangle Class : draw() method"));
        print(() -> System.out.println("Square Class : draw() method"));
        print(() -> System.out.println("Circle Class : draw() method"));

    }

    public static void print(Shape shape){
        shape.draw();
    }
}

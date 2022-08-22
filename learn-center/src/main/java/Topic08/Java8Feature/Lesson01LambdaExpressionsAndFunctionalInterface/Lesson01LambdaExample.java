package Topic08.Java8Feature.Lesson01LambdaExpressionsAndFunctionalInterface;

@FunctionalInterface
interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle Class : draw() method in Traditional way");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square Class : draw() method in Traditional way");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle Class : draw() method in Traditional way");
    }
}

public class Lesson01LambdaExample {

    public static void main(String[] args) {

        // Using traditional way before java 8
        Shape rect = new Rectangle();
        rect.draw();

        Shape cir = new Circle();
        cir.draw();

        Shape squ = new Square();
        squ.draw();

        // Using Lambda Expression
        Shape rectangle = () -> {
            System.out.println("Rectangle Class : draw() method in lambda");
        };
        rectangle.draw();

        Shape square = () -> System.out.println("Square Class : draw() method in lambda");
        square.draw();

        Shape circle = () -> System.out.println("Circle Class : draw() method in lambda");
        circle.draw();

        // Send lambda as method parameters
        System.out.println("*****************Send lambda as method parameters****************");
        print(rectangle);
        print(square);
        print(circle);
        // or this way
        print(() -> System.out.println("Rectangle Class : draw() method in lambda as method parameter"));
        print(() -> System.out.println("Square Class : draw() method in lambda as method parameter"));
        print(() -> System.out.println("Circle Class : draw() method in lambda as method parameter"));

    }

    public static void print(Shape shape) {
        shape.draw();
    }
}

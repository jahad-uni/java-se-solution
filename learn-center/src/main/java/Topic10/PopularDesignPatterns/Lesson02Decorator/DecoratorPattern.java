package Topic10.PopularDesignPatterns.Lesson02Decorator;


/*
Glancing at the decorator design pattern one can conclude out that this is often
a decent choice in the following cases where :

  + When we wish to add, enhance or perhaps remove the behavior or state of objects.
  + When we just want to modify the functionality of a single object of the class
  and leave others unchanged.
*/


public class DecoratorPattern {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle
                = new RedShapeDecorator(new Circle());

        Shape redRectangle
                = new RedShapeDecorator(new Rectangle());

        // Display message
        System.out.println("Circle with normal border");

        // Calling the draw method over the
        // object calls as created in
        // above classes

        // Call 1
        circle.draw();

        // Display message
        System.out.println("\nCircle of red border");

        // Call 2
        redCircle.draw();

        // Display message
        System.out.println("\nRectangle of red border");

        // Call 3
        redRectangle.draw();
    }
}

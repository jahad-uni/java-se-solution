package Topic08.Java8Feature.Lesson01LambdaExpressionsAndFunctionalInterface;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run method called using traditional way...");
    }
}
public class Lesson03RunnableLambda {
    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadDemo());
        thread.start();
        // or using lambda
        Runnable runnable = () -> {
            System.out.println("run method called using lambda...");
        };
        Thread threadLambda = new Thread(runnable);
        threadLambda.start();
        //or with smaller signature
        Thread threadLambdas = new Thread(()->  System.out.println("run method called using lambda..."));
        threadLambdas.start();
    }
}

package Topic06.MiscellaneousJavaCore.Lesson02MultiThread;

public class Lesson02ExtendingExample {

    public static void main(String args[])
    {
        Lesson01CountWithExtendThred cnt = new Lesson01CountWithExtendThred();
        try
        {
            while(cnt.isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over" );
    }
}

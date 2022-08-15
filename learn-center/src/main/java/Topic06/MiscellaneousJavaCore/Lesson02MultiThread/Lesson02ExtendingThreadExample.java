package Topic06.MiscellaneousJavaCore.Lesson02MultiThread;

public class Lesson02ExtendingThreadExample {

    public static void main(String args[])
    {
        Lesson01CountWithExtendThread cnt = new Lesson01CountWithExtendThread();
        try
        {
            while(cnt.isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over" );
    }
}

package ClassWork;

public class RunnableExample implements Runnable{


    @Override
    public void run() {
        System.out.println("runnable " + Thread.currentThread().getName());
    }
}

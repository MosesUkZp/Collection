package ClassWork;

import java.util.List;
import java.util.Map;

public class Main {

    private static int x = 0;

    public static void main(String[] args) throws InterruptedException {

//        MultiList<Integer, String> multiList = new MultiList<>();
//        multiList.add(1, "one");
//        multiList.add(1, "two");
//        List<String> list = multiList.get(1);
//        System.out.println(list);

/////////////////////////////////////////////////////////////////// создаем поток
//        System.out.println("Start in thread" + Thread.currentThread().getName());
//        for (int i = 0; i < 10; i++) {
//        final MyThread myThread = new MyThread();
//    myThread.start();
//        }
//        RuntimeException runtimeException = new RuntimeException();
//        Thread thread = new Thread(() -> System.out.println("runnable "
//                + Thread.currentThread().getName()));
//        thread.start();


        ConcurrentExample concurrentExample = new ConcurrentExample();
        for (int j = 0; j < 20; j++) {
            Thread thread1 = new Thread(() -> {
                System.out.println("thread started");
                for (int i = 0; i < 1000000; i++) {
                    x++;
                }
            });
            thread1.start();
        }


        System.out.println("Start and sleep");
        Thread.sleep(1000);
        System.out.println(x);

    }
}

package thread.day01;

public class MultiThreading01 {

    public static void main(String[] args) {
        long appNoThreadStarted = System.currentTimeMillis();
        System.out.println("Application without thread is started ....... ");

        MyTask1 myTask1 = new MyTask1();
        myTask1.executeTask();

        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 2 is working " + i);
        }
        System.out.println("Application without thread is finished ....... ");
        long appNoThreadEnd = System.currentTimeMillis();
        System.out.println("Total execution time is without Thread "+(appNoThreadEnd-appNoThreadStarted));
        //Total execution time is without Thread 1841
        long appWithThreadStarted = System.currentTimeMillis();

        System.out.println("Application with thread is started ....... ");
        //task1
        MyTaskWithThread1 myTaskWithThread1 = new MyTaskWithThread1();
        myTaskWithThread1.start();
        try {
            myTaskWithThread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //task2
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 4 is working " + i);
        }
        //join() method waits to die/terminate task1 should be finished task2 should be start


        long appWithThreadEnd = System.currentTimeMillis();
        System.out.println("Application with thread is finished ....... ");
        System.out.println("Total execution time is with Thread "+(appWithThreadEnd-appWithThreadStarted));
        //Total execution time is with Thread 916




    }

}

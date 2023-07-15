package thread.day03;

import java.util.concurrent.CountDownLatch;
/*
    A synchronization aid that allows one or more threads to wait
    until a set of operations being performed in other threads completes.
 */
public class CountDownLatch01 {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4);

        AssignTaskThread first = new AssignTaskThread(1000,latch,"Team 1");
        AssignTaskThread second = new AssignTaskThread(2000,latch,"Team 2");
        AssignTaskThread third = new AssignTaskThread(3000,latch,"Team 3");
        AssignTaskThread fourth = new AssignTaskThread(4000,latch,"Team 4");

        first.start();
        second.start();
        third.start();
        fourth.start();

        try {
            latch.await();// it waits until all the latches are finished
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //these codes on my main thread
        System.out.println(Thread.currentThread().getName()+" has running...");
        System.out.println("QA can start...");
    }

}

class AssignTaskThread extends  Thread{
    //to sleep time
    private int delay;
    private CountDownLatch latch;
    //constructor


    public AssignTaskThread(int delay, CountDownLatch latch, String name) {
        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" started");
            Thread.sleep(delay);
            System.out.println(Thread.currentThread().getName()+" finished");
            latch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

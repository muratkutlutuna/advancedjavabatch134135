package thread;

public class MyTaskWithThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 3 is working " + i);
        }
    }
}

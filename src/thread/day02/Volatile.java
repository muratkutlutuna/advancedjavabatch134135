package thread.day02;

public class Volatile {


    public volatile static int counter = 0;
    public static void main(String[] args) {

        //the volatile keyword is used to read data from main method, not from the cache memory

        Thread thread1 = new Thread(()->{

            int localCounter = counter;
            while(localCounter<10){
                if (localCounter!=counter){
                    System.out.println("[T1] local counter is changed....");
                    localCounter = counter;
                }
            }

        });
        Thread thread2 = new Thread(()->{
           int localCounter = counter;
           while(localCounter<10){
               System.out.println("[T2] incremented counter to "+(localCounter+1));
               counter=++localCounter;
               try {
                   Thread.sleep(50);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        thread1.start();
        thread2.start();


    }

}

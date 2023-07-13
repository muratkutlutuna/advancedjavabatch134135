package thread.day02;

public class MultiThreading04 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Brackets1 brackets = new Brackets1();
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 7; i++) {
                    brackets.generateBrackets();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 7; i++) {
                    brackets.generateBrackets();
                }
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //These lines will wait util the thread die or terminated
        long endTime = System.currentTimeMillis();
        System.out.println("time: "+(startTime-endTime));
    }

}
class Brackets1{
    //[[[[[ ]]]]]

    public void generateBrackets(){

        //thus --> the thread which calls this method
                    //block/locks the mwthod block
        //when the thread finishes its task, the block will be released for other threads


        synchronized(this){
            for (int i = 0; i < 10; i++) {
                if (i < 5) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println("");
        }


        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

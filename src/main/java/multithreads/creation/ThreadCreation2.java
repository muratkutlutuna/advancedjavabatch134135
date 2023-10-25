package main.java.multithreads.creation;

public class ThreadCreation2 {
    /*
        Task2: Create a CounterB class which implements the Runable interface
        then, create two threads which prints the alphabet from A to Z.
     */
    public static void main(String[] args) {

        CounterB thread1 = new CounterB("RadRunner");
        CounterB thread2 = new CounterB("SpeedyGonzales");

        thread1.run();
        thread2.run();


    }


}

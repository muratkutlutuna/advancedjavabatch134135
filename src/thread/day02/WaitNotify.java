package thread.day02;

import java.sql.SQLOutput;

public class WaitNotify {

    static public int balance = 0;

    public static void main(String[] args) {

        WaitNotify waitnotify = new WaitNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitnotify.withdraw(1000);
            }
        });
        thread1.setName("Student");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);//to see what hapenning we just delay deposit for 3 seconds
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                waitnotify.deposit(200);
            }
        });
        thread2.setName("Parents");
        thread2.start();




    }

    //method to withdrow

    public synchronized void withdraw(int amount){
        if(balance<=0||balance<amount){
            System.out.println("Insufficient balance: "+balance);
            System.out.println("Waiting for the balance to be updated...");
            try {
                wait(); // we are making the thread to wait until someone deposit
                //sufficient money
                //wait and notify should be in the same object
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //if balance becomes sufficient
            if (balance >= amount) {
                balance = balance - amount;
                System.out.println("Amount has been withdrown succesfully. Current balance is: " + balance);
            } else {
                System.out.println("Insufficient amount : "+balance);
                System.out.println("Ask your parents to deposit more");
            }


        }
    }

    //Method to deposit
    public synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+ " want to deposit amount");
        balance = balance+amount;
        System.out.println("The amount is deposited. The current balance is "+ balance);
        notify();
        //notifyAll(); if there are more than one method that are waiting
    }




}

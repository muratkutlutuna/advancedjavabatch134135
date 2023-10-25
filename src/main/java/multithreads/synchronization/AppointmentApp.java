package main.java.multithreads.synchronization;

import java.util.concurrent.CountDownLatch;
/*
                create a simple appointment application
                The application has to give a new appointment one day after another
 */

public class AppointmentApp {
    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(3);
        String[] users = {"Tolstoy", "C.Dickens", "V.Hugo","Buffon","Beckham","Rick Grimes"};
        AppointmentCenter appointmentCenter = new AppointmentCenter();
        for(String user:users){
            Thread thread1 = new Thread(new Runnable(){

                @Override
                public void run() {
                    Thread.currentThread().setName(user);
                    String name = Thread.currentThread().getName();
                    System.out.println("Dear "+name+", your appointment day is: "+appointmentCenter.getAppointmentDay());
                }
            });
            thread1.start();
        }
    }
}

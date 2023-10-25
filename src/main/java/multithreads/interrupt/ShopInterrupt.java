package main.java.multithreads.interrupt;

public class ShopInterrupt {
    public static volatile int stock = 0;

    public static void main(String[] args) {

    }

    private synchronized void consumeProduct(int amount){
        if (amount > stock) {
            System.out.println(Thread.currentThread().getName() + " would like to buy a product");
            System.out.println("There's not enough product. Current stock: "+stock);
            System.out.println("Waiting for producer to restock.");
            try {
                wait();
            } catch (InterruptedException e) {
                if (amount <= stock) {
                    System.out.println(Thread.currentThread().getName() + " would like to buy a product");
                    System.out.println("Product bought. Decreasing the amount from stock.");
                    stock -= amount;
                    System.out.println("updated Stock: " + stock);
                } else {
                    System.out.println(Thread.currentThread().getName() + " would like to buy a product");
                    System.out.println("There is not enough product check us later!");

                }
            }
        }
    }

    private synchronized void produceProduct(int amount) {
        System.out.println(Thread.currentThread().getName() + " Would like to add a product");
        stock+=amount;
        System.out.println("New products has been added. Updated stock: "+stock);
    }

}

package thread;

public class MyThread extends Thread{
    Printer printer;

    @Override
    public void run() {
        printer.printDocuments(10,"Fathi Acar Documents");
    }

    public MyThread(Printer printer) {
        this.printer = printer;
    }
}

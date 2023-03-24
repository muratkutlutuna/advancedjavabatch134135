package thread;

public class YourThread extends Thread{
    Printer printer;

    public YourThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        printer.printDocuments(10,"Aykut Documnets");
    }
}

package thread.day01;

public class YourThread extends Thread{
    Printer printer;

    public YourThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printDocuments(10,"Aykut Documnets");
    }
}

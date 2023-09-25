package generics.classes;

public class PrinterRunner {
    public static void main(String[] args) {
        Print<Integer> print = new Print<Integer>();
        print.setThingToPrinted(56);
        print.print();

        Print<Double> db = new Print<>();
        db.setThingToPrinted(65.7);
        db.print();

        Print<String> str = new Print<>();
        str.setThingToPrinted("Hello Generics");
        str.print();
    }
}

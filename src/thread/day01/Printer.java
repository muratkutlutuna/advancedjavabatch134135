package thread.day01;

public class Printer {
    void printDocuments(int numOfCopies, String docName) {


        for (int i = 0; i < numOfCopies; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(">> Print "+docName+" "+i);
        }
    }
}

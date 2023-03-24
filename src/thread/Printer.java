package thread;

public class Printer {
    void printDocuments(int numOfCopies, String docName) {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < numOfCopies; i++) {
            System.out.println(">> Print "+docName+" "+i);
        }
    }
}

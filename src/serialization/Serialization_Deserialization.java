package serialization;

import java.io.*;

public class Serialization_Deserialization {

    public static void main(String[] args) {

//        writeObject();
        readObject();
    }

    //method to write user obj into our local storage

    public static void writeObject() {

        System.out.println("User objects are beeing created");
        User user1 = new User(1L, "Cigdem", "81544632413514");
        User user2 = new User(2L, "Marian", "5644632413514");
        User user3 = new User(3L, "Yusuf", "6515432413514");
        User user4 = new User(4L, "Fatma", "4315446413514");

        try {
            FileOutputStream fos = new FileOutputStream("user.txt");
            ObjectOutputStream output = new ObjectOutputStream(fos);
            output.writeObject(user1);
            output.writeObject(user2);
            output.writeObject(user3);
            output.writeObject(user4);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //method to read user obj
    public static void readObject() {

        try {
            FileInputStream fis = new FileInputStream("user.txt");
            ObjectInputStream input = new ObjectInputStream(fis);
            User user1 = (User)input.readObject();
            User user2 = (User)input.readObject();
            User user3 = (User)input.readObject();
            User user4 = (User)input.readObject();

            System.out.println(user1);
            System.out.println(user2);
            System.out.println(user3);
            System.out.println(user4);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}

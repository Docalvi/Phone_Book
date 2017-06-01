
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by emilioalvarado on 5/25/17.
 */
public class Directory {
    Scanner input = new Scanner(System.in);
    String menu;


    String directory = "phone-book";
    String fileName = "contacts.txt";

    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, fileName); // 'phone-book/contacts.txt'
    List<String> data;


    public void fileCreator() throws IOException {

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }
        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        data = Files.readAllLines(dataFile);
    }


    public void addContact(String name, String number) throws IOException {
        data.add(name + " " + number);
        Files.write(dataFile, data);
    }

    public String menu() {
        return "1. View Contacts \n" +
                "2. Add A new Contact\n" +
                "3. Search a contact by name \n" +
                "4. Delete an existing contact\n" +
                "5. Exit \n" +
                "Enter options (1, 2, 3, 4, or 5)";
    }

    public int getIntOpiton() {
        return input.nextInt();
    }

    public String getStringOption() {
        return input.next();
    }

    public String getName() {
        System.out.println("Enter Name");
        String name = input.next();
        return name;
    }

    public String getNumber() {
        System.out.println("Enter Number");
        return input.next();
    }


    public void showContacts() throws IOException {
        data = Files.readAllLines(dataFile);
        for (String contact : data) {
            String[] info = contact.split(" ");
            System.out.println(info[0] + " | " + info[1]);
        }
    }

    public void search() throws IOException {
        String name = getName();
        data = Files.readAllLines(dataFile);
        for (String contact : data) {
            if (contact.contains(name)) {
                System.out.println(contact);
                return;
            }
        }
        System.out.println("not valid contact");
    }

    public void remove() throws IOException {
        String name = getName();
        data = Files.readAllLines(dataFile);
        for (String contact : data) {
            if (contact.contains(name)) {
                data.remove(contact);
                Files.write(
                        dataFile,
                        data
                );
                return;
            }
        }
        System.out.println("not valid contact");
    }
}

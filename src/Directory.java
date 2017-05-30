
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


    String directory = "Phone Book";
    String fileName = "contacts.txt";

    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, fileName);
    List<String> data;



    public void fileCreator() throws IOException {

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }
        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
        try{
            data = Files.readAllLines(dataFile);

        }catch(Exception e){
            System.out.println("file does not exist.");
        }
    }


    public void addContact(String name, String number) {
        data.add(name + " " + number);
        try {
            Files.write(
                    dataFile,
                    data
            );
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public String directory() {
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


}

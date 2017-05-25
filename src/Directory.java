import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by emilioalvarado on 5/25/17.
 */
public class Directory {
    Scanner input = new Scanner(System.in);
    String menu;


//    String directory = "phone-book";
//    String fileName = "contacts";
//
//    Path dataDirectory = Paths.get(directory);
//    Path dataFile = Paths.get(directory, fileName);
//
//    if(Files.notExists())

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


}

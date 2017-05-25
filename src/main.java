import java.io.IOException;

/**
 * Created by emilioalvarado on 5/25/17.
 */
public class main {

    public static void main(String[] args) throws IOException {

        Directory direct = new Directory();


        String backToMenu;

        direct.fileCreator();

        do {
            System.out.println(direct.directory());
            int menuOption = direct.getIntOpiton();

            switch (menuOption) {
                case 1:
                    System.out.println("Name  |  Phone NUmber\n"+
                                       "-----------------------");
                    System.out.println("Back to menu? [y/n]");
                    backToMenu = direct.getStringOption();
                    break;
                case 2:
                    direct.getName();
                    direct.getNumber();
                    System.out.println("Back to menu? [y/n]");
                    backToMenu = direct.getStringOption();
                    break;
                case 3:
                    System.out.println("3, ok");
                    System.out.println("Back to menu? [y/n]");
                    backToMenu = direct.getStringOption();
                    break;
                case 4:
                    System.out.println("4, ok");
                    System.out.println("Back to menu? [y/n]");
                    backToMenu = direct.getStringOption();
                    break;
                case 5:
                    backToMenu = "end";
                    break;
                default:
                    System.out.println("not an option");
                    System.out.println("Back to menu? [y/n]");
                    backToMenu = direct.getStringOption();
            }
        }while (backToMenu.equalsIgnoreCase("y"));
        System.out.println("later");

    }


}

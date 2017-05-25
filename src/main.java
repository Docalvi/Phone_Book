/**
 * Created by emilioalvarado on 5/25/17.
 */
public class main {

    public static void main(String[] args) {

        Directory direct = new Directory();
        System.out.println(direct.directory());

        String backToMenu;



        do {
            int menuOption = direct.getIntOpiton();

            switch (menuOption) {
                case 1:
                    System.out.println("1, ok");
                    System.out.println("Back to menu? [y/n]");
                    backToMenu = direct.getStringOption();
                    break;
                case 2:
                    System.out.println("2, ok");
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
                    System.out.println("5, ok");
                    System.out.println("Back to menu? [y/n]");
                    backToMenu = direct.getStringOption();
                    break;
                default:
                    System.out.println("not an option");
                    System.out.println("Back to menu? [y/n]");
                    backToMenu = direct.getStringOption();
            }
        }while (backToMenu.equalsIgnoreCase("y"));

    }


}

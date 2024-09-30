package gameSelling;

import java.util.Scanner;

public class DigitalcomProcess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User user = new User();
        GameService gameService = new GameService();

        while (1>0) {
            System.out.println("===== Welcome to DigitalCom =====");
            System.out.println("Press 1 to Register User");
            System.out.println("Press 2 to View Games");
            System.out.println("Press 3 to Search By Name");
            System.out.println("Press 4 to Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    String userid = in.nextLine();
                    System.out.print("Enter Password: ");
                    String password = in.nextLine();
                    user.addUser(userid, password);
                    break;
                case 2:
                    System.out.println("Available Games:");
                    for (Game game : gameService.viewAll()) {
                        System.out.println(game);
                    }
                    break;
                case 3:
                    System.out.print("Enter Author Name: ");
                    String author = in.nextLine();
                    String gameName = gameService.authorSearch(author);
                    System.out.println("Result: " + gameName);
                    break;
                case 4:
                    System.out.println("You selected exit");
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("You have to enter only 1,2,3 or 4. TRY AGAIN!");
            }
        }
    }
}

package utility;
import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);
    public static final String BLUE = "\u001B[1;34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    public static void enter() {
        System.out.print("Press Enter to continue...");
        scanner.nextLine();
    }

    public static void updateConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // clear console using os command
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush(); 
            }
            // program header
            System.out.println(BLUE + "==========" + UserInterface.RESET + " Daisuke Clinic " + BLUE + "==========\n" + UserInterface.RESET);
        } catch (Exception e) {
            System.out.println("Error clearing console.");
        }
    }
}

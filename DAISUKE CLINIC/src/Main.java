import java.util.Scanner;

import utility.UserInterface;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inProgram = true;

        while (inProgram) {
            UserInterface.updateConsole();
            String[] choices = {
                "Patient Menu",
                "Doctor Menu",
                "Appointment Menu\n",
                "Exit program"
            };

            for (int i = 1; i <= choices.length; i++) {
                int option = i;
                if (i == choices.length) option = 0; 
                System.out.println(UserInterface.YELLOW + "[" + option + "] " + UserInterface.RESET + choices[i - 1]);
            }

            System.out.print("\nEnter choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1": // patient menu
                    break;
                case "2": // doctor menu
                    break;
                case "3": // appointment menu
                    break;
                case "0": // exit program
                    inProgram = false; 
                    break;
                default:
                    System.out.println("\nInvalid choice!");
                    UserInterface.enter();
            }
        }

        scanner.close();
    }
}
package github_projects.project15;

import java.util.Scanner;
public class UserResponseProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your response (a, b, or c): ");
        char response = scanner.next().charAt(0);

        switch (response) {
            case 'a':
                System.out.println("Your request is being processed.");
                break;
            case 'b':
                System.out.println("Thank you for your interest anyway.");
                break;
            case 'c':
                System.out.println("Sorry, there is currently no assistance available.");
                break;
            default:
                System.out.println("Invalid input, please try again!");
                break;
        }
        scanner.close();
    }
}

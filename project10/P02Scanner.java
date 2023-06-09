package github_projects.project10;

import java.util.Scanner;

public class P02Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your first and last name:");
        String firstNameLastName = scan.nextLine().toUpperCase();

        char firstNameFirstLetter = firstNameLastName.charAt(0);

        char lastNameFirstLetter = firstNameLastName.charAt(firstNameLastName.indexOf(" ") + 1);

        System.out.println("" + firstNameFirstLetter + lastNameFirstLetter);
    }
}

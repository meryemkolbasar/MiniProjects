package github_projects.project11;

import java.util.Scanner;

public class P01IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = scan.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scan.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than the second number.");
        } else {
            System.out.println("The first number is not greater than the second number.");
        }
    }
}

package github_projects.project14;

import java.util.Scanner;

public class AdditionProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        long number1 = scan.nextLong();

        System.out.print("Please enter the second number: ");
        long number2 = scan.nextLong();

        long sum = number1 + number2;

        if (sum >= 0) {
            System.out.print("Sum of the entered values: " + sum);
        } else if (sum > 999999999) {
            System.out.print("Overflow");
        }
    }
}

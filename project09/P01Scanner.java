package github_projects.project09;

import java.util.Scanner;

public class P01Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstName = scan.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = scan.nextLine();

        System.out.println("Please enter your age:");
        int age = scan.nextInt();

        System.out.println("Please enter your height in cm:");
        int height = scan.nextInt();

        System.out.println("Please enter your weight in kg:");
        int weight = scan.nextInt();

        System.out.println("First Name:" + firstName + "\n" + "Last Name:" + lastName + "\n" + "Age:" + age + "\n" +
                "Height:" + height + "cm" + "\n" + "Weight:" + weight + "kg");
        }
    }




package github_projects.project06;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of side 'a' of the rectangle:");
        int a = scan.nextInt();

        System.out.println("Enter side b of the rectangle");
        int b = scan.nextInt();

        System.out.println("Perimeter of the rectangle:"+ ((a+b)*2));

    }
}

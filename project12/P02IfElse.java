package github_projects.project12;

import java.util.Scanner;

public class P02IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your years of service:");
        int yearsOfService = scan.nextInt();

        System.out.println("Enter your salary:");
        int salary = scan.nextInt();

        if (yearsOfService >= 5){
            System.out.println("Increased salary:" + salary + (salary*10/100));
        } else{
            System.out.println("You need to work " + (5-yearsOfService) + " more years to get a raise.");
        }
    }
}

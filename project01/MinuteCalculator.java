package github_projects.project01;

import java.util.Scanner;

public class MinuteCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of minutes:");
        int minutes = scan.nextInt();

        int years = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int days = remainingMinutes / 1440;
        System.out.println(minutes + " minutes is approximately " + years +" years and " + days + " days.");
    }
}

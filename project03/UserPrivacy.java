package github_projects.project03;

import java.util.Scanner;

public class UserPrivacy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();


        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);


        System.out.print("Enter your credit card number: ");
        String cardNo = scan.nextLine();

        String hiddenCardNo = "**** **** **** " + cardNo.substring(cardNo.length()-4);

        name = name.charAt(0) + name.substring(1).replaceAll(".", "*");
        lastName = lastName.charAt(0) + lastName.substring(1).replaceAll(".", "*");

        System.out.print("\nName :" + name + " " + lastName);
        System.out.print("\n"+"\nCCN : " + hiddenCardNo);
    }
}

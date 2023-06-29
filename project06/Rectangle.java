package github_projects.project06;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Dikdortgenin a kenarini giriniz");
        int a = scan.nextInt();

        System.out.println("Dikdortgenin b kenarini giriniz");
        int b = scan.nextInt();

        System.out.println("Dikdortgenin cevresi:"+ ((a+b)*2));

    }
}

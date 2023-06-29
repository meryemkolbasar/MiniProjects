package github_projects.project05;

import java.util.Scanner;
public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a three-digit number: ");
        int number = scan.nextInt();

        System.out.println("The number whose digits you want to add up is: " + number);

        int num1 = number % 10;
        int num2 = (number / 10) % 10;
        int num3 = (number / 100);

        int digitSum = num1 + num2 + num3;
        System.out.println("Please enter the sum of the digits: ");
        int userResult = scan.nextInt();
        boolean isCorrect = (digitSum == userResult);
        if(isCorrect){
            System.out.println("Congratulations! Your answer is correct :) ");
        }else{
            System.out.println("Sorry, your answer is incorrect! \nCorrect answer: " + digitSum);
            }
        }
    }


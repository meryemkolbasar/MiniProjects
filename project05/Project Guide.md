[![MasterHead](https://visme.co/blog/wp-content/uploads/powerpoint-animation-how-to-add-animation-to-powerpoint.gif)](https://meryemkolbasar.io)

**1 - Create a new Java project and create a class called "DigitSumCalculator".**

`package github_projects.project05;
import java.util.Scanner;
public class DigitSumCalculator {
    public static void main(String[] args) {
        // Code goes here
    }
} `

**2 - Import the "java.util.Scanner" package to be able to use the Scanner class.**

`import java.util.Scanner;`

**3 - Create a Scanner object to obtain input from the user.**

`Scanner scan = new Scanner(System.in);`

**4 - Ask the user to enter a three-digit number.**

`System.out.println("Please enter a three-digit number: ");
int number = scan.nextInt();`

**5 - Print a message to confirm the number whose digits the user wants to add up.**

`System.out.println("The number whose digits you want to add up is: " + number);`

**6 - Extract the individual digits of the number by performing modulo and division operations.**

`int num1 = number % 10;
int num2 = (number / 10) % 10;
int num3 = (number / 100);`

**7 - Calculate the sum of the digits.**

`int digitSum = num1 + num2 + num3;`

**8 - Ask the user to enter the sum of the digits.**

`System.out.println("Please enter the sum of the digits: ");
int userResult = scan.nextInt();`

**9 - Compare the user's input with the calculated sum and determine if it is correct.**

`boolean isCorrect = (digitSum == userResult);`

**10 - Print the appropriate message based on whether the user's input is correct or not.**

`if (isCorrect) {
    System.out.println("Congratulations! Your answer is correct :)");
} else {
    System.out.println("Sorry, your answer is incorrect! \nCorrect answer: " + digitSum);
}`

### Language I use:

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

***

**That's it! You have successfully created a Java program that calculates the sum of the digits in a three-digit number and verifies the user's input. 
The program prompts the user to enter a three-digit number, calculates the sum of its digits, and compares it with the user's input. 
It then provides feedback to the user whether their answer is correct or incorrect. Feel free to customize and enhance the code according to your requirements.**

<img align="center" alt="Coding" width="1000" src="https://cdn.kibrispdr.org/data/1796/the-end-gif-7.gif">

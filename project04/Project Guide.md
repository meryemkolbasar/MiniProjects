[![MasterHead](https://visme.co/blog/wp-content/uploads/2019/09/interactive-presentation-header-wide.gif)](https://meryemkolbasar.io)

1 - Create a new Java project and create a class called "BmiCalculation".

2 - Import the "java.util.Scanner" package to be able to use the Scanner class.

3 - Define the main function with the following signature: "public static void main(String[] args)".

4 - Create a Scanner object and use it to obtain input from the user:

`Scanner scan = new Scanner(System.in);`

5 - Ask the user to enter their current weight and height:

`System.out.print("Please enter your current weight: ");
double weight = scan.nextDouble();`

`System.out.print("Please enter your current height (in cm): ");
double height = scan.nextDouble() / 100;`

6 - Use the weight and height values to calculate the BMI using the formula:

`double bmi = weight / (height * height);`

7 - Print the appropriate message based on the BMI value using a series of conditional statements:

`if (bmi < 18.5) {
    System.out.println("\nWeight: " + weight + "\nHeight: " + height + "\nBMI: " + bmi + "\n- You are underweight.");
} else if (bmi >= 18.5 && bmi < 25) {
    System.out.println("\nWeight: " + weight + "\nHeight: " + height + "\nBMI: " + bmi + "\n- You are at a healthy weight.");
} else if (bmi >= 25 && bmi < 30) {
    System.out.println("\nWeight: " + weight + "\nHeight: " + height + "\nBMI: " + bmi + "\n- You are overweight.");
} else if (bmi >= 30) {
    System.out.println("\nWeight: " + weight + "\nHeight: " + height + "\nBMI: " + bmi + "\n- You are obese.");
}`

8 - Compile and run the project. The user will be prompted to enter their weight and height, and then a message displaying the BMI value and the corresponding condition will be printed on the screen.

### Language I use:

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

***

**Great job! You have successfully created the BmiCalculation program. 
It prompts the user to enter their current weight and height, calculates their BMI (Body Mass Index), 
and provides a corresponding message based on the calculated value.**

<img align="center" alt="Coding" width="1000" src="https://cdn.kibrispdr.org/data/1796/the-end-gif-7.gif">



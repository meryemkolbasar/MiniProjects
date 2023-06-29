[![MasterHead](https://visme.co/blog/wp-content/uploads/2020/03/animation-software-header-wide.gif)](https://meryemkolbasar.io)

1 - Create a new Java project in your preferred IDE (Integrated Development Environment).

2 - Inside the project, create a new package named "github_projects.project02" to organize your code.

3 - Within the package, create a new Java class called "OverflowControlledAdditionProgram."

4 - Inside the class, import the necessary classes by adding the following line at the beginning:

`import java.util.Scanner;`

5 - Define the main method as follows:

` public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      // Rest of the code goes here } `
      
6 - Prompt the user to enter the first number by printing the following message:

`System.out.print("Please enter the first number: ");`

7 - Use the `scan.nextLong()` method to read the user's input as a long value and assign it to the `number1` variable:

`long number1 = scan.nextLong();`

8 - Prompt the user to enter the second number by printing the following message:

`System.out.print("Please enter the second number: ");`

9 - Use the `scan.nextLong()` method again to read the user's input as a long value and assign it to the `number2` variable:

`long number2 = scan.nextLong();`

10 - Calculate the sum of the two numbers and store it in the `sum` variable:

`long sum = number1 + number2;`

11 - Check if the sum is within the desired range of 0 to 999999999. Use an `if` statement to perform this check:

`if (sum >= 0 && sum < 999999999) {
    // Print the sum if it's within the range
    System.out.print("Sum of the entered values: " + sum);
} else {
    // Print "Overflow" if the sum exceeds the range
    System.out.print("Overflow");
} `

12 - Save the file and compile and run the program.

### Language I use:

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

***

**That's it! You have successfully created the OverflowControlledAdditionProgram. It will take two numbers as input from the user, calculate their sum, and check if the sum is within the specified range, printing the result or indicating an overflow.**

<img align="center" alt="Coding" width="1000" src="https://cdn.kibrispdr.org/data/1796/the-end-gif-7.gif">
      

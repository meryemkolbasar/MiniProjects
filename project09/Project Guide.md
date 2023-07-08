[![MasterHead](https://repository-images.githubusercontent.com/588181932/e36ec678-7984-4cdd-8e4c-a3932772ff8e)](https://meryemkolbasar.io)


**1 - Creating the Project and Package**

* _Open your Java IDE (Eclipse, IntelliJ IDEA, NetBeans, etc.)._
* _Create a new Java project._
* _Specify the package name as "github_projects.project09"._

**2 - Importing the Required Package**

* _Add the following import statement at the beginning of your code:_
  
  `import java.util.Scanner;`

  _This import statement allows you to use the `Scanner` class for user input._

**3 - Creating the Class and Writing the Code**

* _Within the project, create a Java class named "P01Scanner"._
* _Write the following code inside the class:_
  
  `package github_projects.project09;
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
        System.out.println("First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Age: " + age + "\n" +
                "Height: " + height + "cm" + "\n" + "Weight: " + weight + "kg");
    } } `

  _This code uses the `Scanner` class to get user input. First, a `Scanner` object named `scan` is created using `new Scanner(System.in)`._
  _Then, `System.out.println` statements are used to prompt the user for their first name, last name, age, height, and weight, followed by `scan.nextLine()` or `scan.nextInt()` statements to capture the input.
  Finally, the entered information is displayed on the console._
  
**4 - Running the Code**

* _Save the file and run the program._
* _The program will prompt the user to enter their first name, last name, age, height, and weight._
* _After the user provides the input, the program will display the entered information._
 _By following these steps, you will have created the project as described, allowing users to enter their personal information and displaying it back to them._

### Language I use:

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

***
**That's it! You have successfully created a Java program that prompts the user for their personal information and displays it back to them. 
This program demonstrates the usage of the `Scanner` class to capture user input. 
Feel free to customize and enhance the code according to your requirements. 
Happy coding!**

<img align="center" alt="Coding" width="1000" src="https://cdn.kibrispdr.org/data/1796/the-end-gif-7.gif">










  

[![MasterHead](https://engineering.coviam.com/wp-content/uploads/2017/10/gif-banner-messaging-strat.gif)](https://meryemkolbasar.io)

1 - **Creating the Project and Package**

* _Open your Java IDE (Eclipse, IntelliJ IDEA, NetBeans, etc.)._
*  _Create a new Java project._
*  _Specify the package name as "github_projects.project10"._
 
2 - **Importing the Required Package**

* _Add the following import statement at the beginning of your code:_

`import java.util.Scanner;`

_This import statement allows you to use the `Scanner` class for user input._

3 - **Creating the Class and Writing the Code**

* _Within the project, create a Java class named "P02Scanner"._
* _Write the following code inside the class:_

`package github_projects.project10;
import java.util.Scanner;
public class P02Scanner {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name:");
        String firstNameLastName = scan.nextLine().toUpperCase();
        char firstNameFirstLetter = firstNameLastName.charAt(0);
        char lastNameFirstLetter = firstNameLastName.charAt(firstNameLastName.indexOf(" ") + 1);
        System.out.println("" + firstNameFirstLetter + lastNameFirstLetter);
    }
} `

_This code prompts the user to enter their first and last name, 
and then it converts the input to uppercase. 
It extracts the first letter of the first name and the first letter of the last name using the charAt() 
method and the `indexOf()` method, respectively. 
Finally, it concatenates these letters and prints the result._

4 - **Running the Code**

* _Save the file and run the program._
* _The program will prompt the user to enter their first and last name._
*  _After the user provides the input, 
  the program will display the concatenated first letters of their first and last names._

### Language I use:

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

***

**Congratulations! You have successfully completed the P02Scanner project.
You can use this program to extract and display the first letters of your first and last names. 
Thank you for your effort during the project completion process. We wish you continued success!**

<img align="center" alt="Coding" width="1000" src="https://cdn.kibrispdr.org/data/1796/the-end-gif-7.gif">

[![MasterHead](https://institute.careerguide.com/wp-content/uploads/2020/09/Blog-Post-Graphic-How-to-design-the-perfect-MMS_gif.gif)](https://meryemkolbasar.io)

**1 - Create a new Java project in your preferred Integrated Development Environment (IDE).**

**2 - Create a new package named `github_projects.project12` within your project.**

**3 - Inside the package, create a new Java class named `P02IfElse`.**

**4 - Add the necessary import statement at the beginning of the class to import the `Scanner` class:**

`import java.util.Scanner;`

**5 -  Define the main method within the `P02IfElse` class:**

`public static void main(String[] args) {
// Your code will go here
}`

**6 -  Create a new `Scanner` object to read input from the user:**

`Scanner scan = new Scanner(System.in);`

**7 - Prompt the user to enter their years of service:**

`System.out.println("Enter your years of service:");
int yearsOfService = scan.nextInt();`

**8 -  Prompt the user to enter their salary:**

`System.out.println("Enter your salary:");
int salary = scan.nextInt();`

**9 - Use an `if-else` statement to check the years of service and print the appropriate message:**

`if (yearsOfService >= 5) {
System.out.println("Increased salary: " + (salary + (salary * 10 / 100)));
} else {
System.out.println("You need to work " + (5 - yearsOfService) + " more years to get a raise.");
}`

### Language I use:

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

***

**Congratulations on successfully completing the project! 
You've implemented a program that calculates the increased salary based on years of service. 
Well done on creating a useful and functional piece of code! 
Keep up the great work and continue to explore and enhance your programming skills. 
Happy coding!**

<img align="center" alt="Coding" width="1000" src="https://cdn.kibrispdr.org/data/1796/the-end-gif-7.gif">


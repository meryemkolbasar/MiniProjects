 [![MasterHead](https://mir-s3-cdn-cf.behance.net/project_modules/1400/e87a6c63590071.5abbfb634deca.gif)](https://meryemkolbasar.io)

**1- Set up the project structure**

* Create a new package named `github_projects.project14`.
* Inside the package, create a new Java class named `AdditionProgram`.

**2-  Import necessary dependencies**

* Import the `java.util.Scanner` class at the top of your `AdditionProgram` class.

**3- Create the main method**

* Add the following code inside the `AdditionProgram` class to define the `main` method:
 
  `public static void main(String[] args) {
  // Code will go here
  }`

**4- Create a Scanner object**

* Inside the `main` method, create a new `Scanner` object to read user input:

    `Scanner scan = new Scanner(System.in);`

**5- Prompt for the first number**

* Print a message asking the user to enter the first number:

    `System.out.print("Please enter the first number: ");`

**6- Read the first number**

* Read the first number entered by the user using the `nextLong() `method of the `Scanner` class:

    `long number1 = scan.nextLong();`

**7-  Prompt for the second number**

* Print a message asking the user to enter the second number:

    `System.out.print("Please enter the second number: ");`

**8- Read the second number**

* Read the second number entered by the user using the `nextLong()` method of the `Scanner` class:

    `long number2 = scan.nextLong();`

**9- Calculate the sum**

* Calculate the sum of the two numbers and store it in a variable named `sum`:

    `long sum = number1 + number2;`

**10- Check for overflow**

* Check if the sum is greater than or equal to zero:

    `if (sum >= 0) {
    System.out.print("Sum of the entered values: " + sum);
    } else if (sum > 999999999) {
    System.out.print("Overflow");
    }`
### Language I use:

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

***

**Congratulations! You have successfully created the AdditionProgram project. 
You can now run the program and test it by entering different numbers.**

**Note: Make sure to format your code properly for better readability and maintainability.**

**If you have any further questions, feel free to ask. Good luck with your project!**

<img align="center" alt="Coding" width="1000" src="https://cdn.kibrispdr.org/data/1796/the-end-gif-7.gif">



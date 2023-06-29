[![MasterHead](https://cutewallpaper.org/24/picture-animations/7-best-animated-presentation-software-you-should-know-about.gif)](https://meryemkolbasar.io)

1 - First, import the Scanner class by adding the following line:

``import java.util.Scanner;``

2 - At the beginning of the `main` method, create a `Scanner` object:

``Scanner scan = new Scanner(System.in);``

3 - Identify the location where you want to prompt the user to enter their name:

``System.out.print("Enter your name: ");
String name = scan.nextLine();``

4 - Identify the location where you want to prompt the user to enter their last name:

``System.out.print("Enter your last name: ");
String lastName = scan.nextLine();``

5 - Identify the location where you want to prompt the user to enter their credit card number:

``System.out.print("Enter your credit card number: ");
String cardNo = scan.nextLine();``

6 - Use the following code to capitalize the first letter of the name:

``name = name.substring(0, 1).toUpperCase() + name.substring(1);``

7 - Use the following code to capitalize the first letter of the last name:

``lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);``

8 - Use the following code to hide all but the last four digits of the credit card number:

``String hiddenCardNo = "**** **** **** " + cardNo.substring(cardNo.length() - 4);``

9 - Use the following code to replace all characters in the name and last name, except the first letter, with asterisks:

``name = name.charAt(0) + name.substring(1).replaceAll(".", "*");
lastName = lastName.charAt(0) + lastName.substring(1).replaceAll(".", "*");``

10 - Finally, print the modified name, last name, and hidden credit card number:

``System.out.print("\nName: " + name + " " + lastName);
System.out.print("\n\nCCN: " + hiddenCardNo);``

### Language I use:

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

***

**That's it! You have successfully created the UserPrivacy program. 
It prompts the user to enter their name, last name, and credit card number. 
It then formats and hides sensitive information, such as displaying the first letter of the name and last name capitalized, 
replacing the remaining characters with asterisks, and hiding most of the credit card number, 
except for the last four digits. This helps protect user privacy and sensitive information. 
Congratulations on completing the program!**

<img align="center" alt="Coding" width="1000" src="https://cdn.kibrispdr.org/data/1796/the-end-gif-7.gif">
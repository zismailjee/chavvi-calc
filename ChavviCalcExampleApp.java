package com.chavviCalcExample;

import java.util.*;

/*
 * chavvi calc calculator
 */
public class ChavviCalcExampleApp {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Character command = '_';

    // loop until user quits
    while (command != 'q') {
      printMenu();
      System.out.print("Enter a command: ");
      command = menuGetCommand(scan);

      executeCommand(scan, command);
    }

    scan.close();
  }
// public class mainFunction() { -- unnecessary


  //
  // menu functions
  //
  private static void printMenuLine() {
    System.out.println(
      "----------------------------------------------------------"
    );
  }

  private static void printMenuCommand(Character command, String desc) {
    System.out.printf("%s\t%s\n", command, desc);
  }

  public static void printMenu() {

    // present the menu
    System.out.println("Enter a value for A");
    System.out.println("Enter a value for b");
    System.out.println("[+] Add");
    System.out.println("[-] Subtract");
    System.out.println("[*] Multiple");
    System.out.println("[/] Divide");
    System.out.println("[c]lear");
    System.out.println();
    System.out.println("[q]uit");
    System.out.println("-----------------");
    System.out.println();

}



  private static Character menuGetCommand(Scanner scan) {
    Character command = '_';

    String rawInput = scan.nextLine();

    if (rawInput.length() > 0) {
      rawInput = rawInput.toLowerCase();
      command = rawInput.charAt(0);
    }

    return command;
  }

 
  // calculator functions
  private static Boolean executeCommand(Scanner scan, Character command) {


    Boolean success = true;
    char operator;
      Double number1, number2, result;
      number1 = 0.00;
      number2 = 0.00;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
      number1 = input.nextDouble();

    System.out.println("Enter second number");
      number2 = input.nextDouble();

      // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
      operator = input.next().charAt(0);
  
      // ask users to enter numbers
    // System.out.println("Enter first number");
    //   number1 = input.nextDouble();
      
  
      // System.out.println("Enter second number");
      // number2 = input.nextDouble();
    switch (command) {
       case 'a':
         System.out.println("Enter first number");
         number1 = input.nextDouble();
         break;
       case 'b':
         System.out.println("Enter second number");
         number2 = input.nextDouble();
         break;
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        if (number2 == 0)
          System.out.println("Cannot divide by zero!"); 
        break;

      case 'q':
        System.out.println("Thank you for using Chavvi Calc");
        break;

      case 'c':
        System.out.println(number1 == 0);
        System.out.println(number2 == 0);
        System.out.println("A and B have been cleared ;)");
        break;
      default:
        System.out.println("ERROR: Unknown commmand");
        success = false;
    }
  
    return success;
  }
  
}












// public class menu {

// }

/* private static void handleUserSelection(String input) {

// do something based on input
switch(input) {

    case "a":
        System.out.println("Enter a value for A");
        break;

    case "b":
        System.out.println("Enter a value for b");
        break;

    case "+":
        System.out.println("[+] Add");
        break;

    case "-":
        System.out.println("[-] Subtract");
        break;

    case "*":
        System.out.println("[*] Multiply");
        break;

    case "/":
        System.out.println("[/] Divide");
        break;

    case "c":
        System.out.println("[c]lear");
        break;

    case "q":
        System.out.println("[q]uit");
        break;

    default:
        break;
  }

} */
/* public static void mainFunction() {
  
  char operator;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

      // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
      operator = input.next().charAt(0);
  
      // ask users to enter numbers
    System.out.println("Enter first number");
      number1 = input.nextDouble();
  
      System.out.println("Enter second number");
      number2 = input.nextDouble();
  
} */
  // 9/28 -- Moving over operators to below example; commenting out 
    //   switch (operator) {
  
    //     // performs addition between numbers
    //     case '+':
    //       result = number1 + number2;
    //       System.out.println(number1 + " + " + number2 + " = " + result);
    //       break;
  
    //     // performs subtraction between numbers
    //     case '-':
    //       result = number1 - number2;
    //       System.out.println(number1 + " - " + number2 + " = " + result);
    //       break;
  
    //     // performs multiplication between numbers
    //     case '*':
    //       result = number1 * number2;
    //       System.out.println(number1 + " * " + number2 + " = " + result);
    //       break;
  
    //     // performs division between numbers
    //     case '/':
    //       result = number1 / number2;
    //       System.out.println(number1 + " / " + number2 + " = " + result);
    //       break;
  
    //     default:
    //       System.out.println("Invalid operator!");
    //       break;
    //   }
  
    //   input.close();
    // }


  
  
          /*   // prints the menu
          9/25 - Commenting out this part to add in section from menu.java
            public static void printMenu() {
              printMenuLine();
              System.out.println("ChavviCalc");
              printMenuLine();

              printMenuCommand('q', "Quit");

              printMenuLine();
            }
          */
            // get first character from input


import java.util.*;

// declares a class
public class ChavviCalcExampleApp {

    //
    // Func: menu
    // Desc: prints the menu
    //
    public static void printMenu() {

        // present the menu
        System.out.println("---- Enter a value for A ----");
        System.out.println("Enter a value for b");
        System.out.println("Add");
        System.out.println("Subtract");
        System.out.println("Multiple");
        System.out.println("Divide");
        System.out.println("[c]lear");
        System.out.println();
        System.out.println("[q]uit");
        System.out.println("-----------------");
        System.out.println();

    }


public class menu {
    
}

public static void handleUserSelection(String input) {

    // do something based on input
    switch(input) {

        case "a":
            System.out.println("---- Enter a value for A ----");
            break;

        case "b":
            System.out.println("Enter a value for b");
            break;

        case "+":
            System.out.println("Add"));
            break;

        case "-":
            System.out.println("Subtract");
            break;

        case "*":
            System.out.println("Multiply");
            break;

        case "/":
            System.out.println("Divide");
            break;

        case "c":
            System.out.println("clear");
            break;

        case "q":
            System.out.println("quit");
            break;

        default:
            break;
      }

    }
}

import java.util.*;
/**
 * Write a description of class Homework_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Homework_3
{public static void main(String[]args)
    {int price1 = 0;
        System.out.println("Welcome to Zadkiel's Coffee palace!");
        System.out.println("Here is the menu.");
        System.out.println("Order when you're ready!");
        System.out.println("And don't forget to type exit when you are done!");
        while (true){
        System.out.println("Menu");
        System.out.println("=====");
        System.out.println("1. Tea.....$2");
        System.out.println("2. Coffee.....$3");
        System.out.println("2. Cookie.....$1");
        Scanner menuScanner = new Scanner(System.in);
        System.out.println("What would you like?");
        String input = menuScanner.nextLine();
        if(input.equals("tea")||input.equals("Tea")){
        price1 = price1 + 2;
        System.out.println("Here is your "+ input);
        }
        else if (input.equals("coffee")||input.equals("Coffee")){
        price1 = price1 + 3;
        System.out.println("Here is your "+ input);
        }
        else if (input.equals("cookie")||input.equals("Cookie")){
        price1 = price1 + 1;
        System.out.println("Here is your "+ input);
        }
        else if (input.equals("exit")){
            System.out.println("Your Total is... $ "+ price1);
            break;
        }
        
    }
    System.out.println("Goodbye!");
        
        
    }
    
    }
        
        
        



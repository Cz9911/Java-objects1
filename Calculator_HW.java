import java.util.Scanner;
/**
 * Zadkiel's math palace is an online calculator.
 *
 * @ Cesar Zadkiel Mendez-Padilla
 * @ Version 1.3.1
 */
public class Calculator_HW
{public static void main (String args[])throws InterruptedException{
    double answer1 = 0; 
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter your first number below.");
    int num1 = scanner.nextInt();
    System.out.println("Enter your second number below.");
    int num2 = scanner.nextInt();
    System.out.println("Do you want to add, subtract, multiply or divide?");
    System.out.println("Enter what you need below.");
    String input = scanner.next();
    if (input.equals("ADD")||input.equals("add")||input.equals("Add")||input.equals("+")){
         answer1 = add(num1,num2);
    }
    else if (input.equals("SUBTRACT")||input.equals("subtract")||input.equals("Subtract")||input.equals("-")){
         answer1 = subtract(num1,num2);
    }
    else if (input.equals("MULTIPLY")||input.equals("multiply")||input.equals("Multiply")||input.equals("*")){
         answer1 = multiply(num1,num2);
    }
    else if (input.equals("DIVIDE")||input.equals("divide")||input.equals("Divide")||input.equals("/")){
         answer1 = divide(num1,num2);
    }
    System.out.println(answer1);
}
public static int add(int num1, int num2){
    return num1 + num2; 
}
public static int subtract(int num1, int num2){
    return num1 - num2; 
}
public static int multiply(int num1, int num2){
    return num1 * num2; 
}
public static double divide(int num1, int num2){
    return 1.0 * num1 / num2; 
    //return (double)num1 / num2;
}
}

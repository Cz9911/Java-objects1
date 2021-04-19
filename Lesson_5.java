
/**
 * Write a description of class Lesson_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lesson_5
    {public static void main (String args[]){
        sayHello("Zadkiel",11);
        int product1 = multiply(11, 68);
        int product2 = multiply(89, 47);
        int product3 = multiply(product1, product2);
    }
    public static void sayHello(String name, int age){
         System.out.println("Hello World. My name is " + name + " I am "+ age);
    } 
    public static int multiply(int num1, int num2){
        int result = num1 * num2;
        System.out.println(result);   
        return result;
    }
}

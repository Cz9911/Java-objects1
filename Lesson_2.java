import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Lesson_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lesson_2
{public static void main(String[] args){
    Random Rand1 = new Random();
    int randomInt1 = Rand1.nextInt(10);
    System.out.println("Random integers:"+randomInt1);
    //Generate random doubles.
    //lesson part 2
    double randDouble = Rand1.nextDouble();
    System.out.println("Random Double:"+randDouble);
    //Using if statments
    //Lesson part 3
    Scanner myScannerI = new Scanner(System.in); 
    System.out.println("Enter your age.");
    double age = myScannerI.nextDouble();
    if(age>=18){
    System.out.println("You are eligible to vote.");
    }
    else{
    System.out.println("You are not eligible to vote.");
    }
    myScannerI.close();
    
     
      
      
    
    


}



}
    
   


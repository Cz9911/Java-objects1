import java.util.Scanner;
/**
 * Write a description of class Hobby_countdown here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hobby_countdown
    {public static void main(String[]args) throws InterruptedException
 {
    System.out.println("T- Ten seconds to launch");  
 int count = 5;
 System.out.println("5,");
 Thread.sleep(1000);
 count= count-1;
 System.out.println("4,");
Thread.sleep(1000);
 count= count-1;
 System.out.println("3,");
Thread.sleep(1000);
 count= count-1;
 System.out.println("2,");
 Thread.sleep(1000);
 count= count-1;
 System.out.println("1,");
 Thread.sleep(1000);
 System.out.println("BEGIN IGNITION");
 Thread.sleep(5000);
 System.out.println("WE ARE LEAVING THE ATMOSPHERE.");
 Thread.sleep(4500);
 System.out.println("TAKEOFF SUCCESFUL.");
 System.out.println("WE ARE IN ORBIT");


}   
}

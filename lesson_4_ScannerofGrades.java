import java.util.Scanner;
import java.util.*;

/**
 * Write a description of class lesson_4_ScannerofGrades here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lesson_4_ScannerofGrades
{public static void main(String[]args)
    {
    Scanner gradeScanner = new Scanner(System.in);
    double quiz;
    double midterm;
    double finals;
    System.out.println("Enter the quiz score to see average score.");
    quiz = gradeScanner.nextDouble();
    System.out.println("Enter the mid-term score.");
    midterm = gradeScanner.nextDouble();
    System.out.println("Enter Finals test score.");
    finals = gradeScanner.nextDouble();
    double averageScore = (quiz + midterm + finals) /3;
    double score = (quiz + midterm + finals) /3;
    
    if (averageScore >= 90){
        System.out.println("Your grade is A");
        System.out.println("Your final Score is: " + score);
    }
    else if (averageScore < 90 && averageScore >= 70){
        System.out.println("Your grade is B");
        System.out.println("Your final Score is: " + score);
    }
    else if (averageScore < 70 && averageScore >= 50){
    System.out.println("Your grade is C");
    System.out.println("Your final Score is: " + score);
    }
    else {
    System.out.println("FAIL");
    System.out.println("Your final Score is: " +score);
    }
    //close the scanner
    gradeScanner.close();
    
    
    
        
        
        
        
    }
    
    
}

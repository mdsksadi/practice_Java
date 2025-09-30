/**
 * Assignment 8: Logical AND (&&) Operator
 * @author Shekh Sadi
 * Date: 30-09-2025
 * Create a class called Assignment8
 * Check eligible candidate
 * Step 1: Ask teh candidate, have you completed your masters? y/n
 * Step 2: Ask the candidate are you fluent in English? y/n
 * Step 3: If the candidate has passed masters and also have fluent english skill then print you are eligible  for the job interview
 * Step 4: Else print Sorryy you are not eligible  for the job interview
 */
public class Assignment8
{
    public static void main(String[] args)
    {
        char question1;
        char question2;
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Have you completed your masters? y/n: ");
        question1 = input.next().charAt(0);
        
        System.out.print("Are you fluent in English? y/n: ");
        question2 = input.next().charAt(0);
        
        if (question1 == 'y' && question2 == 'y')
        {
            System.out.println("You are eligible  for the job interview");
        }
        else
        {
            System.out.println("Sorry, you are not eligible  for the job interview");
        }
        
        input.close();
    }
}
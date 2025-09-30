/**
 * Assignment 7: Logical OR (||)
 * @author Shekh Sadi
 * Date: 30-09-2025
 * Create a class called Assignment6
 * Print "Do you love Java?"
 * Take user input: y / Y / n / N
 * if user input y / Y, print you are a java lover
 * if user input n / N, print your are not a java lover
 */
public class Assignment6
{
    public static void main(String[] args)
    {
        char ch;
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("Do you love java?");
        System.out.print("Please input y/Y or n/N: ");
        ch = input.next().charAt(0);
        
        if (ch == 'y' || ch == 'Y')
        {
            System.out.println("You are a java lover");
        }
        else if (ch == 'n' || ch == 'N')
        {
            System.out.println("You are not a java lover");
        }
        else
        {
            System.out.println("Please give a valid input");
        }
        
        input.close();
    }
}
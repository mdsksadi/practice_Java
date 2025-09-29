/**
 * Even Odd number finding
 * @author Shekh Sadi
 * @Date 29-09-2025
 * This program will find the even and odd number from the user's input
 */
 
public class EvenOddNumberFinding
{
    public static void main(String[] args)
    {
        int number;
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Please enter your number: ");
        number = input.nextInt();
        
        if (number%2 == 0)
        {
            System.out.println("This is an even number");
        }
        else
        {
            System.out.println("This is an odd number");
        }
        
        input.close();
    }
}
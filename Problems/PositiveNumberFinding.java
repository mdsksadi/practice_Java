/**
 * Positive number finding
 * @author Shekh Sadi
 * @Date 29-09-2025
 * Here, I will see how control statement works.
 * First control statement: if, else
 */
public class PositiveNumberFinding
{
    public static void main(String[] args)
    {
        float number;
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Please enter your number: ");
        number = input.nextFloat();
        
        if (number > 0)
        {
            System.out.println("Your number is positive");
        } else if (number == 0)
        {
            System.out.println("Your number not positive and not negative: 0");
        }
        else
        {
            System.out.println("Your number is negative");
        }
        
        input.close();
    }
}
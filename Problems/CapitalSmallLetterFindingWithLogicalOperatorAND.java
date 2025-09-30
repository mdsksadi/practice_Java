/**
 * Capital Small letter finding with logical operator AND (&&)
 * @author Shekh Sadi
 * @Date 30-09-2025
 * Here this program will detect capital and small
 * The user needs to give input a letter
 * Based on the user input he should see is it capital or small letter
 */
 
public class CapitalSmallLetterFindingWithLogicalOperatorAND
{
    public static void main(String[] args)
    {
        char letter;
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Please enter a letter: ");
        letter = input.next().charAt(0);
        
        if (letter >= 'a' && letter <= 'z')
        {
            System.out.println("This is small letter");
        }
        else if (letter >= 'A' && letter <= 'Z')
        {
            System.out.println("This is capital letter");
        }
        else
        {
            System.out.println("This is not a letter");
        }
        
        input.close();
    }
}
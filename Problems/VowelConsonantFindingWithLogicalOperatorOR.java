/**
 * Vowel Consonant Finding With Logical Operator OR
 * @author Shekh Sadi
 * @Date 30-09-2025
 * Here this program will detect vowel and consonent
 * The user needs to give input a letter
 * Based on the user input he should the output vowel or consonent
 */
 
public class VowelConsonantFindingWithLogicalOperatorOR
{
    public static void main(String[] args)
    {
        char letter;
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Please enter a letter: ");
        letter = input.next().charAt(0);
        
        if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U')
        {
            System.out.println("This is vowel");
        }
        else
        {
            System.out.println("This is consonent");
        }
        
        input.close();
    }
}

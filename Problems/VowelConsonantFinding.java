/**
 * Vowel Consonant Finding
 * @author Shekh Sadi
 * @Date 30-09-2025
 * Here this program will detect vowel and consonent
 * The user needs to give input a letter
 * Based on the user input he should the output vowel or consonent
 */
 
public class VowelConsonantFinding
{
    public static void main(String[] args)
    {
        char letter;
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Please enter a letter: ");
        letter = input.next().charAt(0);
        
        if (letter == 'a')
        {
            System.out.println("This is vowel");
        }
        else if (letter == 'e')
        {
            System.out.println("This is vowel");
        }
        else if (letter == 'i')
        {
            System.out.println("This is vowel");
        }
        else if (letter == 'o')
        {
            System.out.println("This is vowel");
        }
        else if (letter == 'u')
        {
            System.out.println("This is vowel");
        }
        else if (letter == 'A')
        {
            System.out.println("This is vowel");
        }
        else if (letter == 'E')
        {
            System.out.println("This is vowel");
        }
        else if (letter == 'I')
        {
            System.out.println("This is vowel");
        }
        else if (letter == 'O')
        {
            System.out.println("This is vowel");
        }
        else if (letter == 'U')
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

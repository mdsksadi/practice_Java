/**
 * Digit Spelling by using switch case
 * @author Shekh Sadi
 * @Date 01-10-2025
 * Here the program will spelling the digit entered by user
 * Ask for a digit between 0-9
 * Check the digit and print it by spelling e.g., if user input is 0, print zero
 * If the digt is not among 0-9, print invalid digit
 */

public class DigitSpelling
{
	public static void main(String[] args)
	{
		int digit;
		
		java.util.Scanner digitInput = new java.util.Scanner(System.in);
		
		System.out.print("Please enter a digit between 0-9: ");
		digit = digitInput.nextInt();
		
		switch (digit){
			case 0:
				System.out.println("Zero");
				break;
			case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid digit");
                break;
        }

        digitInput.close();
    }
}
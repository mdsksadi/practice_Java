/**
 * Arithmatic Operator
 * @author Shekh Sadi
 * Date: 26-09_2025
 * Use all the possible arithmatic operators
 * Also write the expected outcome
 */

public class Arithmetic
{
	public static void main(String[] args)
	{
		int number1;
		int number2;
		
		java.util.Scanner takeInput = new java.util.Scanner(System.in);	// Using java.util.Sacanner to save some memory
		System.out.print("Please enter the first number: ");
		number1 = takeInput.nextInt();
		System.out.print("Please enter the second number: ");
		number2 = takeInput.nextInt();
		
		System.out.println("The sum is: "+(number1+number2));
		
		System.out.println("The subtraction is: "+(number1-number2));
		
		System.out.println("The multiplication is: "+number1*number2);	// We can also avoid parenthesis. But it is not a good practice.
		
		System.out.println("The division is: "+(float)number1/number2);
		
		System.out.println("The mod is: "+(number1%number2));
		
		takeInput.close();
	}
}
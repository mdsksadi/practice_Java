/**
 * Assignment Operator
 * @author Shekh Sadi
 * @date 26-09-2025
 * Here, I will use all the possible assignment operators.
 * Also I will take one input from the user to be sure that the user can give his own input.
 */

public class Assignment
{
	public static void main(String[] args)
	{
		float x;
		int y = 3;	// This is the basic example of assignment operator (=)
		
		java.util.Scanner input;
		input = new java.util.Scanner(System.in);
		
		System.out.print("Please enter the value of x: ");
		x = input.nextFloat();
		
		x += y;	// x = x+y
		System.out.println("Now, x = "+x);
		
		x -= y; // x = x-y
		System.out.println("Now, x = "+x);
		
		x *= y;	// x = x+y
		System.out.println("Now, x = "+x);
		
		x /= y; // x = x/y
		System.out.println("Now, x = "+x);
		
		x %= y;	// x = x%y
		System.out.println("Now, x = "+x);
		
		input.close();
	}
}
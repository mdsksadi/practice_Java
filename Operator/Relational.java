/**
 * Relational Operator
 * @author Shekh Sadi
 * @Data 27-09-2025
 * Here, I will use all the possible relational operators
 */

public class Relational
{
	public static void main(String[] args)
	{
		int number1;
		int number2;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Please enter first number: ");
		number1 = input.nextInt();
		
		System.out.print("Please enter second number: ");
		number2 = input.nextInt();
		
		// Relational operator: >
		System.out.println("First number is greater than second number: " + (number1 > number2));
		
		// Relational operator: >=
		System.out.println("First number is greater or equal to second number: "+ (number1 >= number2));
		
		// Relational operator: <
		System.out.println("First number is less than second number: "+ (number1 < number2));
		
		// Relational operator: <=
		System.out.println("First number is leass or equal to second number: "+ (number1 <= number2));
		
		// Relational operator: ==
		System.out.println("First and second number are equal: "+ (number1 == number2));
		
		// Relational operator: !=
		System.out.println("First number is not second number: "+ (number1 != number2));
		
		input.close();
	}
}
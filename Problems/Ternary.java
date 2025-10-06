public class Ternary
{
	public static void main(String[] args)
	{
		float number1;
		float number2;
		float larger_number;
		
		
		java.util.Scanner numberInput = new java.util.Scanner(System.in);
		
		System.out.print("Please enter your first number: ");
		number1 = numberInput.nextFloat();
		
		System.out.print("Please enter your second number: ");
		number2 = numberInput.nextFloat();
		
		larger_number = (number1 > number2) ? number1 : number2;
		
		System.out.println("Larger number is: " + larger_number);
		
		numberInput.close();
	}
}
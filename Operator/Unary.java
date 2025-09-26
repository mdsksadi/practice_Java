/**
 * Unary Oparator use case
 * @author Shekh Sadi
 * @Date 26-09_2025
 */
 
public class Unary
{
	public static void main(String[] args)
	{
		int var1;
		int value = 5;
		
		/**
		 * "+" unary operator multiply with the existing one
		 */
		var1 = +value;
		System.out.println("Unary plus output is: "+var1);
		
		/**
		 * "-" unary operator multiply with the existing one
		 */
		var1 = -value;
		System.out.println("Unary minus output is: "+var1);
		
		/**
		 * "++x" unary operator increment and show
		 */
		System.out.println("The result is: "+ ++value);

		/**
		 * "x++" unary operator increment after finishing the line
		 */
		System.out.println("The result is: "+ value++);
		System.out.println("The result is: "+ value);	// We will see the increment here
		
		/**
		 * "--x" unary operator decrement and show
		 */
		System.out.println("The result is: "+ --value);
		
		/**
		 * "x--" unary operator decrement after finishing the line
		 */
		System.out.println("The result is: "+ value--);
		System.out.println("The result is: "+ value);	// We will see the decrement here
	}
}
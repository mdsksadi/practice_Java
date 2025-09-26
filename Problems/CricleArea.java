/**
 * Circle area calculation
 * @author Shekh Sadi
 * @Date 26-09-2025
 * Here the program will calculate the area of a circle
 * The user needs to give the radious
 */

public class TriangleArea
{
	public static void main(String[] args)
	{
		float radious;
		float area;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Please enter the radious of the circle: ");
		radious = input.nextFloat();
		
		area = 3.1416f *radious*radious; // Area of a circle formula -> pi*r^2
		System.out.println("The area is: "+area);
		
		input.close();
	}
}
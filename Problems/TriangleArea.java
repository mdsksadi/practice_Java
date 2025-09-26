public class TriangleArea
{
	public static void main(String[] args)
	{
		float base;
		float height;
		float area;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Please enter the base of the triangle: ");
		base = input.nextFloat();
		
		System.out.print("Please enter the height of the triangle: ");
		height = input.nextFloat();
		
		area = ((base*height)/2); // Area of a triangle formula
		System.out.println("The area is: "+area);
		
		input.close();
	}
}
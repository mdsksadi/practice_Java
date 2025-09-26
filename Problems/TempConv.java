/**
 * Temperature Converter
 * @author Shekh Sadi
 * @Date 27-09-2025
 * Here this program will convert temperature from celsious to farenheit.
 * By using another formal we can also convert from farenheit to celsious.
 * User nees to give the temperature in celsious.
 */

public class TempConv
{
	public static void main(String[] args)
	{
		float tempCelsious;
		float tempFarenheit;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Enter your temperature in celsious: ");
		tempCelsious = input.nextFloat();
		
		tempFarenheit = (1.8f*tempCelsious)+32;
		System.out.println("Temperature in farenheit: "+tempFarenheit+" F");
		
		input.close();
	}
}
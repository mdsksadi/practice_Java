/**
 * Assignment 8: Switchcase -> Call center
 * @author Shekh Sadi
 * Date: 05-10-2025
 * Create a class called Assignment9
 * If user select option 1, set language Bengali
 * If user select option 2, set language Hindi
 * If user select option 3, set language Urdu
 * If user select other option, set language English
 */
 
public class Assignment9
{
	public static void main(String[] args)
	{
		int language;
		
		java.util.Scanner language_input = new java.util.Scanner(System.in);
		
		System.out.print("Please select 1 for Bengali, 2 for Hindi, 3 for Urdu and, other for English: ");
		language = language_input.nextInt();
		
		switch (language)
		{
			case 1:
				System.out.println("Language set to Bengali");
				break;
			case 2:
				System.out.println("Language set to Hindi");
				break;
			case 3:
				System.out.println("Language set to Urdu");
				break;
			default:
				System.out.println("Language set to English");
				break;
		}
		
		language_input.close();
	}
}
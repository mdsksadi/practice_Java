/**
 * Assignment5: Valid voter finding using if, else
 * @author Shekh Sadi
 * Date: 29-09-2025
 * Create a class called Assignment5
 * Ask for a person age
 * if age is equal or more than 18 then print valid voter
 * else print not valid (invalid) voter
 */
public class Assignment5
{
    public static void main(String[] args)
    {
        int age;
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        
        if (age >= 18)
        {
            System.out.println("You are valid voter");
        }
        else
        {
            System.out.println("You are not valid voter");
        }
        
        input.close();
        
    }
}
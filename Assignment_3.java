/**
 * Assignment 3: Take input from user
 * @author Shekh Sadi
 * Date: 25-09-2025
 * Create a class called Assignment_3
 * Create a main method
 * Declare variables: id, title, price, description, category
 * Get user input for the following data
 * Print the data
 */

import java.util.Scanner;

public class Assignment_3
{
    public static void main(String[] args)
    {
        int id;
        String title;
        float price;
        String description;
        String category;

        Scanner input = new Scanner(System.in);
        //java.util.Scanner scanner = new java.util.Scanner(System.in); // We can also use this if we don't want to import Scanner class

        System.out.print("Enter id: ");
        id = input.nextInt();

        System.out.print("Enter title: ");
        title = input.next();   // Use next() to capture a single word for the title

        System.out.print("Enter price: ");
        price = input.nextFloat();
        input.nextLine(); // Consume the newline character left by nextFloat()

        System.out.print("Enter description: ");
        description = input.nextLine(); // Use nextLine() to capture the full line including spaces

        System.out.print("Enter category: ");
        category = input.nextLine(); // Use next() to capture a single word for the category

        System.out.println("\n--- Product Details ---");
        System.out.println("id: " + id);
        System.out.println("title: " + title);
        System.out.println("price: " + price + " euros");
        System.out.println("description: " + description);
        System.out.println("category: " + category);

        input.close(); // Close the scanner to prevent resource leaks
    }
}

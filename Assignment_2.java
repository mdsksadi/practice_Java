/**
 * Assignment 2
 * @author Shekh Sadi    
 * Date: 25-09-2025
 * 1. Create a class called Assignment_2
 * 2. Create a main method
 * 3. Declare variables: id, title, price, description, category
 * 4. Assign the following data in main method
 * 101, iphone15, 1895 euros, perfect product with best image quality, phone
 * Print the data
 */

public class Assignment_2
{
    public static void main(String[] args)
    {
        int id;
        String title;
        int price;
        String description;
        String category;
        
        id = 101;
        title = "iphone15";
        price = 1895;
        description = "perfect product with best image quality";
        category = "phone";
        
        System.out.println("id: "+id);
        System.out.println("title: "+title);
        System.out.println("price: "+price+" euros");
        System.out.println("description: "+description);
        System.out.println("category: "+category);
        
    }
}
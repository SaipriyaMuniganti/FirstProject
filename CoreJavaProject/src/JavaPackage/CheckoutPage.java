package JavaPackage;
import java.util.Scanner;

public class CheckoutPage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter the number of items: ");
        int numItems = input.nextInt();
        
        // Create an array to store the item names and prices
        String[] itemNames = new String[numItems];
        double[] itemPrices = new double[numItems];
        
        // Get the item names and prices from the user
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter the name of item " + (i + 1) + ": ");
            itemNames[i] = input.next();
            
            System.out.print("Enter the price of item " + (i + 1) + ": ");
            itemPrices[i] = input.nextDouble();
        }
        
        // Print the checkout page
        System.out.println("\nCheckout Page");
        System.out.println("-------------");
        
        double total = 0;
        
        for (int i = 0; i < numItems; i++) {
            System.out.println(itemNames[i] + ": $" + itemPrices[i]);
            total += itemPrices[i];
        }
        
        System.out.println("-------------");
        System.out.println("Total: $" + total);
        
        input.close();
    }
}


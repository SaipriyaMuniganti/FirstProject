package JavaPackage;

import java.util.Scanner;

public class HomePage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Welcome to Food Delivery App!");
            System.out.println("1. Browse Restaurants");
            System.out.println("2. Search for Food");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                  
                    break;
                case 2:
                  
                    break;
                case 3:
                   
                    break;
                case 4:
                   
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}


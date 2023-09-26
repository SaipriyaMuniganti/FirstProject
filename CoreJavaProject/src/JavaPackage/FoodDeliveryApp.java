package JavaPackage;

	import java.util.ArrayList;
	import java.util.List;
	
	class Food {
	    private String name;
	    private double price;
	    
	    public Food(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public double getPrice() {
	        return price;
	    }
	}
	class Restaurant {
	    private String name;
	    private List<Food> menu;
	    
	    public Restaurant(String name) {
	        this.name = name;
	        menu = new ArrayList<>();
	    }
	    
	    public void addFoodToMenu(Food food) {
	        menu.add(food);
	    }
	    
	    public List<Food> getMenu() {
	        return menu;
	    }
	    
	    public void displayMenu() {
	        System.out.println("Menu for " + name + ":");
	        for(Food food : menu) {
	            System.out.println(" - " + food.getName() + " ($" + food.getPrice() + ")");
	        }
	    }
	}
	class Customer {
	    private String name;
	    private List<Food> cart;
	    
	    public Customer(String name) {
	        this.name = name;
	        cart = new ArrayList<>();
	    }
	    
	    public void addToCart(Food food) {
	        cart.add(food);
	    }
	    
	    public void viewCart() {
	        System.out.println("Cart for " + name + ":");
	        double totalPrice = 0.0;
	        for(Food food : cart) {
	            System.out.println(" - " + food.getName() + " ($" + food.getPrice() + ")");
	            totalPrice += food.getPrice();
	        }
	        System.out.println("Total: $" + totalPrice);
	    }
	}
	public class FoodDeliveryApp {
	    public static void main(String[] args) {
	       
	        Restaurant restaurant1 = new Restaurant("Bawarchi");
	        restaurant1.addFoodToMenu(new Food("Biryani", 10.99));
	        restaurant1.addFoodToMenu(new Food("Naan", 6.99));
	        
	        Restaurant restaurant2 = new Restaurant("Wok The Way");
	        restaurant2.addFoodToMenu(new Food("Sushi", 12.99));
	        restaurant2.addFoodToMenu(new Food("Ramen", 8.99));
	        
	        
	        Customer customer = new Customer("Saipriya");
	        
	        restaurant1.displayMenu();
	        restaurant2.displayMenu();
	        
	      
	        customer.addToCart(restaurant1.getMenu().get(0));
	        customer.addToCart(restaurant1.getMenu().get(1));
	        
	        
	        customer.viewCart();
	    }



		}




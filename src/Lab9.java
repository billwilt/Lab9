import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * @ author Bill Wilt
 * 
 */

public class Lab9 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String yesNoContinue = "";
		
		
		List<String> items = new ArrayList<>();
		items.add("Applesauce");
		items.add("Banana");
		items.add("Cauliflower");
		items.add("Dragonfruit");
		items.add("Elderberry");
		items.add("Peppers");
		items.add("Grapefruit");
		items.add("Honeydew");

		List<Double> prices = new ArrayList<>();
		prices.add(0.99);
		prices.add(0.59);
		prices.add(1.59);
		prices.add(2.19);
		prices.add(1.79);
		prices.add(2.09);
		prices.add(1.99);
		prices.add(3.49);
		
		List<Integer> itemNumbers = new ArrayList<>();
		itemNumbers.add(1);
		itemNumbers.add(2);
		itemNumbers.add(3);
		itemNumbers.add(4);
		itemNumbers.add(5);
		itemNumbers.add(6);
		itemNumbers.add(7);
		itemNumbers.add(8);
		
		Map<String,Double> menu = new HashMap<>();
		menu.put("Applesauce", 0.99);
		menu.put("Banana", 0.59);
		menu.put("Cauliflower", 1.59);
		menu.put("Dragonfruit", 2.19);
		menu.put("Elderberry", 1.79);
		menu.put("Peppers", 2.09);
		menu.put("Grapefruit", 1.99);
		menu.put("Honeydew", 3.49);
		
		List<String> cartItems = new ArrayList<>();
		
		//if userInput.equals("banana")) {
		// cartItems.add("banana");
		// cartPrices.add(0.59);
		
		List<Double> cartPrices = new ArrayList<>();
		
		do {
		System.out.println("==============================");	
		System.out.println("Welcome to Guenther's Market!");
		System.out.println("============================== \n");
		System.out.println("Item\t\t\tPrice");
		System.out.println("------------------------------");
		int i = 0;
		for (String s : menu.keySet()) {
			System.out.println(++i + " " + s + "\t\t" + menu.get(s));
		}
		System.out.println("------------------------------");
			
			System.out.print("Please type the items name you would like to order? ");
			//keyboard.nextLine();
		String userInput = keyboard.next();
		
		if (userInput.toLowerCase().equals("banana")) {
			System.out.println("Adding " + userInput + " to cart at $0.59");
			cartItems.add("banana");
			cartPrices.add(0.59);
			System.out.print("Would you like to order anything else (yes/no)? ");
			yesNoContinue = keyboard.next();
			yesNoContinue(yesNoContinue);
		} else if (userInput.toLowerCase().equals("honeydew")) {
			System.out.println("Adding " + userInput + " to cart at $3.49");
			cartItems.add("honeydew");
			cartPrices.add(3.49);
			System.out.print("Would you like to order anything else (yes/no)? ");
			yesNoContinue = keyboard.next();
			yesNoContinue(yesNoContinue);
		} else if (userInput.toLowerCase().equals("cauliflower")) {
			System.out.println("Adding " + userInput + " to cart at $1.59");
			cartItems.add("cauliflower");
			cartPrices.add(1.59);
			System.out.print("Would you like to order anything else (yes/no)? ");
			yesNoContinue = keyboard.next();
			yesNoContinue(yesNoContinue);
		} else if (userInput.toLowerCase().equals("grapefruit")) {
			System.out.println("Adding " + userInput + " to cart at $1.99");
			cartItems.add("grapefruit");
			cartPrices.add(1.99);
			System.out.print("Would you like to order anything else (yes/no)? ");
			yesNoContinue = keyboard.next();
			yesNoContinue(yesNoContinue);
		} else if (userInput.toLowerCase().equals("applesauce")) {
			System.out.println("Adding " + userInput + " to cart at $0.99");
			cartItems.add("applesauce");
			cartPrices.add(0.99);
			System.out.print("Would you like to order anything else (yes/no)? ");
			yesNoContinue = keyboard.next();
			yesNoContinue(yesNoContinue);
		} else if (userInput.toLowerCase().equals("peppers")) {
			System.out.println("Adding " + userInput + " to cart at $2.09");
			cartItems.add("peppers");
			cartPrices.add(2.09);
			System.out.print("Would you like to order anything else (yes/no)? ");
			yesNoContinue = keyboard.next();
			yesNoContinue(yesNoContinue);
		} else if (userInput.toLowerCase().equals("dragonfruit")) {
			System.out.println("Adding " + userInput + " to cart at $2.19");
			cartItems.add("dragonfruit");
			cartPrices.add(2.19);
			System.out.print("Would you like to order anything else (yes/no)? ");
			yesNoContinue = keyboard.next();
			yesNoContinue(yesNoContinue);
		} else if (userInput.toLowerCase().equals("elderberry")) {
			System.out.println("Adding " + userInput + " to cart at $1.79");
			cartItems.add("elderberry");
			cartPrices.add(1.79);
			System.out.print("Would you like to order anything else (yes/no)? ");
			yesNoContinue = keyboard.next();
			yesNoContinue(yesNoContinue);
		} else {
			System.out.println("Sorry, we don't have those.  Please try again.");
		}
		} while (yesNoContinue(yesNoContinue) == true);
		
		
		System.out.println("Thanks for your order!");
		System.out.println("Here's what you got:");
		System.out.println(cartItems);
		System.out.println(cartPrices);
//		int i = 0;
//		for (String t : cartItems.keySet()) {
//			System.out.println(++i + " " + t + "\t\t" + menu.get(t));
//		}
//		int i = 0;
//		for (String s : menu.keySet()) {
//			System.out.println(++i + " " + s + "\t\t" + menu.get(s));
//		}
		
		double sum = 0;
		for(int k = 0; k < cartPrices.size(); k++)
		    sum += cartPrices.get(k);
		double averagePrice = (sum / (cartPrices.size()));
		System.out.println("Your total price is: $" + sum);
		System.out.println("Your average price per item in order is: $" + averagePrice);
		
		System.out.println("Goodbye");
		
		
		
		keyboard.close();
	}
	public static boolean yesNoContinue(String yesNoContinue) {
		boolean continueMore;
		if (yesNoContinue.toLowerCase().equals("yes")) {
			continueMore = true;
			return continueMore;
		} else {
			continueMore = false;
			return continueMore;
		}
	}
}

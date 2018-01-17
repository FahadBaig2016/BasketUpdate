package com.fdmgroup.basket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Basket {

	static String item; // This variable is the item selection.
	static String answer; // Answer 'yes or no' for prompted question after item
							// selection.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#0.00");
		List<Fruit> availableFruits = new ArrayList<Fruit>();
		List<Fruit> basket = new ArrayList<Fruit>();

		boolean selection = false;

		double sum = 0;
		

		Fruit apple = new Fruit("Apple", 0.25);
		Fruit banana = new Fruit("Banana", 0.15);
		Fruit orange = new Fruit("Orange", 0.30);
		Fruit lemon = new Fruit("Lemon", 0.40);
		Fruit peach = new Fruit("Peach", 0.35);

		
		availableFruits.add(apple);
		availableFruits.add(banana);
		availableFruits.add(orange);
		availableFruits.add(lemon);
		availableFruits.add(peach);

		System.out.println("Please select from the following:");
		for (Fruit fruit : availableFruits) {
			System.out.println(fruit.getName() + " £" + f.format(fruit.getPrice()));
		}
		System.out.println(" ");
		System.out.println("Enter: ");
		System.out.println(" ");
		for (Fruit fruit : availableFruits) {
			System.out.print(fruit.getName().charAt(0) + ",");
		}

		System.out.println();

		do {
			item = scanner.next();
			for (Fruit fruit : availableFruits) {
				String firstChar = Character.toString(fruit.getName().charAt(0));
			
				if (item.equalsIgnoreCase(firstChar)) {
					System.out.println(fruit.getName() + " selected");
					selection = true;
					basket.add(fruit);
				} 
			}
			
		} while (selection != true);

		if (selection = true) {
			System.out.println(" ");
			System.out.println("Have you finished. Enter Y/N");
			answer = scanner.next();

			if (answer.equalsIgnoreCase("y")) {
				for (Fruit fruit : basket) {
					System.out.println("Item: " + fruit.getName() + " £" + f.format(fruit.getPrice()));
					sum += fruit.getPrice();

				}
				System.out.println("Number of items in basket: " + basket.size());
				System.out.println("Your total is : £" + f.format(sum));

			}
			if (!"y".equalsIgnoreCase(answer) && !"n".equalsIgnoreCase(answer)) {
				do {
					System.out.println(" ");
					System.out.println("Please Enter Y/N");
					answer = scanner.next();
				} while (!"y".equalsIgnoreCase(answer) && !"n".equalsIgnoreCase(answer));
			}

			if (answer.equalsIgnoreCase("n")) {
				do {
					System.out.println("Select next item please.");
					do {
						item = scanner.next();

						for (Fruit fruit : availableFruits) {
							String firstCh = Character.toString(fruit.getName().charAt(0));
							if (item.equalsIgnoreCase(firstCh)) {
								System.out.println(fruit.getName() + " selected");
								selection = true;
								basket.add(fruit);
							} 
						}
						
					} while (selection != true);

					System.out.println(" ");
					System.out.println("Have you finished. Enter Y/N");
					answer = scanner.next();

					if (!"y".equalsIgnoreCase(answer) && !"n".equalsIgnoreCase(answer)) {
						do {
							System.out.println(" ");
							System.out.println("Have you finished. Enter Y/N");
							answer = scanner.next();
						} while (!"y".equalsIgnoreCase(answer) && !"n".equalsIgnoreCase(answer));
					}
				} while (answer.equalsIgnoreCase("n"));
			}

			if (answer.equalsIgnoreCase("y")) {
				for (Fruit fruit : basket) {
					System.out.println("Item: " + fruit.getName() + " £" + f.format(fruit.getPrice()));
					sum += fruit.getPrice();

				}
				System.out.println("Number of items in basket: " + basket.size());
				System.out.println("Your total is : £" + f.format(sum));

			} else
				System.out.println("You must enter Y or N.");
		}

	}
}

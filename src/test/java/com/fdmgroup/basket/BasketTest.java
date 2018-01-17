package com.fdmgroup.basket;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class BasketTest {

	private Fruit fruit;
	
	@Before
	public void setup(){
		fruit = new Fruit();
	}

	@Test
	public void Test_AddOneAppleToBasket() {

		// Arrange
		List<Fruit> fruits = new ArrayList<Fruit>();
		double sum = 0;

		// Act
		Fruit apple = new Fruit("Apple", 0.25);

		fruits.add(apple);

		for (Fruit fruit : fruits) {
			sum += fruit.getPrice();
		}
		// Assert

		assertEquals(0.25, sum, 0.0);
	}

	@Test
	public void Test_AddOneAppleAndOneBananaToBasket() {

		// Arrange
		List<Fruit> fruits = new ArrayList<Fruit>();
		double sum = 0;

		// Act
		Fruit apple = new Fruit("Apple", 0.25);
		Fruit banana = new Fruit("Banana", 0.15);

		fruits.add(apple);
		fruits.add(banana);

		for (Fruit fruit : fruits) {
			sum += fruit.getPrice();
		}
		// Assert
		assertEquals(0.40, sum, 0.0);
	}

	@Test
	public void Test_AddAppleAndBananaAndOrangeToBasket() {

		// Arrange
		List<Fruit> fruits = new ArrayList<Fruit>();
		double sum = 0;

		// Act
		Fruit apple = new Fruit("Apple", 0.25);
		Fruit banana = new Fruit("Banana", 0.15);
		Fruit orange = new Fruit("Orange", 0.30);

		fruits.add(apple);
		fruits.add(banana);
		fruits.add(orange);

		for (Fruit fruit : fruits) {
			sum += fruit.getPrice();
		}

		// Assert
		assertEquals(0.70, sum, 0.0);
	}

	@Test
	public void Test_AddTwoLemonsToBasket() {

		// Arrange
		List<Fruit> fruits = new ArrayList<Fruit>();
		double sum = 0;

		// Act
		Fruit lemon = new Fruit("Lemon", 0.40);

		fruits.add(lemon);
		fruits.add(lemon);

		for (Fruit fruit : fruits) {
			sum += fruit.getPrice();
		}

		// Assert
		assertEquals(0.80, sum, 0.0);
	}
	
	
	@Test
	public void Test_RetrieveMangoPrice(){
		
		Fruit mango = new Fruit("Mango", 0.55);
		
		
		assertEquals(0.55, mango.getPrice(), 0);
	}

	@Test
	public void Test_RetrieveFruitName(){
		
		
		String fruitName = "Berry";
		fruit.setName(fruitName);
		
		assertEquals("Berry", fruit.getName());
	}
	@Test
	public void Test_NumberOfItemsInBasket(){
		List<Fruit> fruits = new ArrayList<Fruit>();
		
		Fruit pear = new Fruit();
		Fruit kiwi = new Fruit("Kiwi", 0.30);
		Fruit mango = new Fruit("Mango", 0.55);
		Fruit lemon = new Fruit("Lemon", 0.40);
		
		fruits.add(pear);
		fruits.add(kiwi);
		fruits.add(mango);
		fruits.add(lemon);
		
		assertEquals(4, fruits.size());
	}

}
package com.zookeeper.gorilla;

public class Gorilla extends Mammal {
	
	final private String animal = "Gorilla";
	
	
	public void throwSomething() {
		this.energyLoss(5);
		System.out.println("The " + animal + " has thrown something!");
	}
	public void eatBananas() {
		this.energyGain(10);
		System.out.println("The " + animal + " ate some bananas and is satisfied!");
	}
	public void climb() {
		this.energyLoss(10);
		System.out.println("The " + animal + " has climbed a tree!");
	}
}

package com.zookeeper.gorilla;

public class Gorilla extends Mammal {
	public void throwSomething() {
		this.energyLoss(5);
		System.out.println("The gorilla has thrown something!");
	}
	public void eatBananas() {
		this.energyGain(10);
		System.out.println("The gorilla ate some bananas and is satisfied!");
	}
	public void climb() {
		this.energyLoss(10);
		System.out.println("The gorilla has climbed a tree!");
	}
}

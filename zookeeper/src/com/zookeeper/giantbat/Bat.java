package com.zookeeper.giantbat;

import com.zookeeper.gorilla.Mammal;

public class Bat extends Mammal {
	
	final private String animal = "Bat";
	
	public Bat() {
		this.energyGain(200);
	}
	public void fly() {
		this.energyLoss(50);
		System.out.println("The " + animal + " flew!");
	}
	public void eatHumans() {
		this.energyGain(25);
		System.out.println("The " + animal + " ate a human!");
	}
	public void attackTown() {
		this.energyLoss(100);
		System.out.println("The " + animal + " attacked a town!");
	}
}
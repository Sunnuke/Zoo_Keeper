package com.zookeeper.gorilla;

public class Mammal {
//	Member Variables
	private int energyLevel = 100;
	
//	Member Methods
	public void displayEnergy() {
		System.out.println("The gorilla's energy level is at " + this.energyLevel + "%!");
	}
	public void energyLoss(int num) {
		this.energyLevel -= num;
	}
	public void energyGain(int num) {
		this.energyLevel += num;
	}
}

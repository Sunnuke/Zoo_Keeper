package com.zookeeper.gorilla;

public class Mammal {
//	Member Variables
	private int energyLevel = 100;
	
//	Member Methods
	public int displayEnergy() {
		return this.energyLevel;
	}
	public void energyLoss(int num) {
		this.energyLevel -= num;
	}
	public void energyGain(int num) {
		this.energyLevel += num;
	}
}

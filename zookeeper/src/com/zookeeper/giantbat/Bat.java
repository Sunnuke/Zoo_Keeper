package com.zookeeper.giantbat;

import com.zookeeper.gorilla.Mammal;

public class Bat extends Mammal {
	public Bat() {
		this.energyGain(200);
	}
	public void fly() {
		this.energyLoss(50);
		System.out.println("The Bat flew!");
	}
	public void eatHumans() {
		this.energyGain(25);
		System.out.println("The Bat ate a human!");
	}
	public void attackTown() {
		this.energyLoss(100);
		System.out.println("The Bat attacked a town!");
	}
}

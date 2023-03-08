package com.jessicapetrey.zookeeper;

public class Bat extends Mammal {
	private int fly, eat, attack;

	public Bat() {
		super(300);
		this.fly = -50;
		this.eat = 25;
		this.attack = -100;
	}
	
	//super displayEnergy
	public int displayEnergy() {
		return super.displayEnergy();
	}
	
	// attack methods
	public void fly() {
		System.out.println("\nGiant bat wing flaps");
		super.setEnergyLevel(super.getEnergyLevel()+this.getFly());
		super.displayEnergy();
	}

	public void eatHumans() {
		System.out.println("\nGiant bat snacks on your friend");
		super.setEnergyLevel(super.getEnergyLevel()+this.getEat());
		super.displayEnergy();
	}

	public void attackTown() {
		System.out.println("\n*Cacaphony of sirens and screams of terror*");
		super.setEnergyLevel(super.getEnergyLevel()+this.getAttack());
		super.displayEnergy();
	}

	
	
	
	//getters and setters
	public int getFly() {
		return fly;
	}

	public int getEat() {
		return eat;
	}

	public int getAttack() {
		return attack;
	}

}

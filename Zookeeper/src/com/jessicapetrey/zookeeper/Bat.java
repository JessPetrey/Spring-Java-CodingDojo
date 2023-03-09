package com.jessicapetrey.zookeeper;

public class Bat extends Mammal {
	private int fly, eat, attack;

	//constructor
	public Bat() {
		super(300);  //set energy to 300
		this.fly = -50;
		this.eat = 25;
		this.attack = -100;
	}
	


	// action methods
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

	
	
	//getters
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

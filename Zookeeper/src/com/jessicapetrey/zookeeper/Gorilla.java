package com.jessicapetrey.zookeeper;

public class Gorilla extends Mammal {
	private int throwItem, eat, climb;

	//constructor
	public Gorilla() {
		super(100);
		this.throwItem = -5;
		this.eat = 10;
		this.climb = -10;
	}
	
	//super displayEnergy method
	public int displayEnergy() {
		return super.displayEnergy();
	}
	
	// action methods
	public void throwSomething() {
		System.out.println("\nGorilla throws a banana!");
		super.setEnergyLevel(super.getEnergyLevel()+this.getThrowitem());
		super.displayEnergy();
	}

	public void eatBananas() {
		System.out.println("\nGorilla eats a banana");
		super.setEnergyLevel(super.getEnergyLevel()+this.getEat());
		super.displayEnergy();
	}

	public void climb() {
		System.out.println("\nGorilla climbs a tree!");
		super.setEnergyLevel(super.getEnergyLevel()+this.getClimb());
		super.displayEnergy();
	}

	
//	getters

	public int getThrowitem() {
		return throwItem;
	}

	public int getEat() {
		return eat;
	}

	public int getClimb() {
		return climb;
	}




	
	

	
	

	
}

package com.jessicapetrey.zookeeper;

public class Mammal {
	private int energyLevel;
	
	//constructor
	public Mammal(int energy) {
		this.energyLevel = energy;
	}
	
	
	//display method available to all
	public int displayEnergy() {
		System.out.printf("This animal has %d energy \n", this.getEnergyLevel());
		return this.getEnergyLevel();
	}
	
	
	//getter and setter
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}


	
}

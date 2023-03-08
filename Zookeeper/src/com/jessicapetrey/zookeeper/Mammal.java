package com.jessicapetrey.zookeeper;

public class Mammal {
	private int energyLevel;
	private int throwItem;
	private int eat;
	private int movement;
	
	
	public Mammal(int energy) {
		this.energyLevel = energy;
	}
	
	
	
	public int displayEnergy() {
		System.out.printf("This animal has %d energy \n", this.getEnergyLevel());
		return this.getEnergyLevel();
	}
	
	
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}


	
}

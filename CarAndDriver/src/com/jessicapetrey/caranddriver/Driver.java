package com.jessicapetrey.caranddriver;

public class Driver  extends Car {
	private int drive;
	private int booster;
	private int refuel;
	
	
	public Driver() {
		this.drive = 1;
		this.booster = 3;
		this.refuel = 2;
	}
	
	public void goForADrive() {
		System.out.println("You drive the car.");
		this.setGas(this.getGas()-this.drive);
		System.out.printf("Gas remaining: %d/10 \n", this.getGas());
	}
	
	public void useBooster() {
		if(this.getGas() >= 3) {
			System.out.println("Zoom! Booster initiated");
			this.setGas(this.getGas()-this.getBooster());			
		} else {
			System.out.println("Not enough gas to use a booster!");
		}
	}
	
	public void pitStop() {
		System.out.println("Getting more gas...");
		if(this.getGas() < 8) {
			this.setGas(this.getGas()+this.getRefuel());
			System.out.printf("Tank level: %d/10 \n", this.getGas());
		} else {
			System.out.println("Tank is too full for that!");
		}
	}
	
	
	
	public int getDrive() {
		return drive;
	}

	public int getBooster() {
		return booster;
	}
	public void setBooster(int booster) {
		this.booster = booster;
	}
	public int getRefuel() {
		return refuel;
	}
	public void setRefuel(int refuel) {
		this.refuel = refuel;
	}

	
}

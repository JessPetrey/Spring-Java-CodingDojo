package com.jessicapetrey.caranddriver;

public class Car {
	private int gas;
	private String status;
	
	public Car() {
		this.gas = 10;
	}
	
	public int displayGasLevel() {
		return getGas();
	}
	
	

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}


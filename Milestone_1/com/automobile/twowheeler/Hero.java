package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

	int speed;
	public Hero(int speed)
	{
		this.speed = speed;
	}
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Hero";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "TN1234";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Bhagyashri";
	}
	public int getSpeed()
	{
		return speed;
	}
	public void radio()
	{
		System.out.println("Provides facility to control radio device");
	}
	
	

}

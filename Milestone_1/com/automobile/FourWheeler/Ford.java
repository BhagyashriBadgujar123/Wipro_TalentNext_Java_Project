package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle{

	int speed;
	public Ford(int speed)
	{
		this.speed = speed;
	}
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Ford";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "FD2002";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Vidya";
	}
	public int speed()
	{
		return speed;
	}
	public int tempControl()
	{
		System.out.println("Provides facility to control air conditioning device which is available in the car");
		return 2;
	}

}

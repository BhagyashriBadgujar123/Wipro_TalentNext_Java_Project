package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle{

	int speed;
	public Logan(int speed)
	{
		this.speed = speed;
	}
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Logan";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "LG1234";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Sunil Badgujar";
	}
	public int speed()
	{
		return speed;
	}
	public int gps()
	{
		System.out.println("Provides facility to control the gps device");
		return 1 ;
	}

}

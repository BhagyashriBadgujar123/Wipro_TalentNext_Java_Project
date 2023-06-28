package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle{
	int speed;
	public Honda(int speed)
	{
		this.speed = speed;
		
	}
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Honda";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "TNH1234";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Gaurav";
	}
	public int getSpeed()
	{
		return speed;
	}
	public void cdPlayer()
	{
		System.out.println("Provides facility to control the cdplayer device which is available in the car");
		
	}

}

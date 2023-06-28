package com.automobile;

import com.automobile.FourWheeler.Ford;
import com.automobile.FourWheeler.Logan;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1 = new Hero(50);
		System.out.println("Model Name : "+h1.getModelName());
		System.out.println("Registration Number : "+h1.getRegistrationNumber());
		System.out.println("Owner Name : "+h1.getOwnerName());
		System.out.println("Speed of Hero : "+h1.getSpeed());
		//System.out.println("Provides Facility In Hero : "+h1.radio(););
		h1.radio();
		
		Honda h2 = new Honda(70);
		System.out.println("Model Name : "+h2.getModelName());
		System.out.println("Registration Number : "+h2.getRegistrationNumber());
		System.out.println("Owner Name : "+h2.getOwnerName());
		System.out.println("Speed of Honda : "+h2.getSpeed());
		h2.cdPlayer();
		
		Logan l1 = new Logan(110);
		System.out.println("Model Name : "+l1.getModelName());
		System.out.println("Registration Number : "+l1.getRegistrationNumber());
		System.out.println("Owner Name : "+l1.getOwnerName());
		System.out.println("Speed of Logan : "+l1.speed());
		System.out.println("GPS Facility : "+l1.gps());
		
		Ford f1 = new Ford(130);
		System.out.println("Model Name : "+f1.getModelName());
		System.out.println("Registration Number : "+f1.getRegistrationNumber());
		System.out.println("Owner Name : "+f1.getOwnerName());
		System.out.println("Speed of Ford : "+f1.speed());
		System.out.println("Temperature Control Facility : "+f1.tempControl());
		
		
	}

}

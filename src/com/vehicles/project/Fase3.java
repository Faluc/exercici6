package com.vehicles.project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fase3 {

	public static void main(String[] args) {
		System.out.println("Do you want to create a Car or a Bike?");
		Scanner sc = new Scanner(System.in);
		String vehicle_type = sc.nextLine();
		if (vehicle_type.equalsIgnoreCase("car")) {
			  Car.createCar();
			  Car.addCarWheels();
			 
		}else if (vehicle_type.equalsIgnoreCase("bike")){
			  Bike.createBike();
			  Bike.addBikeWheels();
			  
		} else {
			System.out.println("Wrong vehicle type.");
		}
		
	}
}

		


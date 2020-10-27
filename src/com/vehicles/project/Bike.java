package com.vehicles.project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	public static void createBike() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, introduce bike's plate numbers:");
		String matricula = sc.nextLine();
		matricula = matricula.toUpperCase();
		Matcher m = Pattern.compile("^[0-9]{4}[A-Z]{2,3}$").matcher(matricula);
        if (m.find()) {
            System.out.println(matricula + " is a valid number plate");
        } else {
            System.out.println(matricula + " is not a valid number plate");
        }
		System.out.println("Please, introduce bike's brand:");
		String marca = sc.nextLine();
		System.out.println("Please, introduce bike's color:");
		String color = sc.nextLine();
		Bike moto = new Bike(matricula, marca, color);
		System.out.println("The bike has the following characteristics:");
		System.out.println("Bike's plate: " + moto.plate);
		System.out.println("Bike's brand: " + moto.brand);
		System.out.println("Bike's color: " + moto.color);
	}
	public static void addBikeWheels() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, introduce bike's back tire brand:");
		String neumatico_tras = sc.nextLine();
		System.out.println("Please, introduce back tire size (between 0.4-4):");
		double medida_tras = sc.nextDouble();
		if (medida_tras < 0.4 || medida_tras > 4) {
			System.out.println("The diameter IS NOT correct!");
		} else {
			System.out.println("The diameter is correct!");
		}
		ArrayList<Wheel> backWheel = new ArrayList<Wheel>();
		backWheel.add(new Wheel(neumatico_tras, medida_tras));
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please, introduce bike's back tire brand");
		String neumatico_del = sc2.nextLine();
		System.out.println("Please, introduce back tire size (between 0.4-4):");
		double medida_del = sc2.nextDouble();
		if (medida_del < 0.4 || medida_del > 4) {
			System.out.println("The diameter IS NOT correct!");
		} else {
			System.out.println("The diameter is correct!");
		}
		ArrayList<Wheel> frontWheel = new ArrayList<Wheel>();
		frontWheel.add(new Wheel(neumatico_del, medida_del));
		System.out.println("Bike's back wheel characteristics:");
		System.out.println("Tyre brand: " + neumatico_tras);
		System.out.println("Tyre diameter: " + medida_tras);
		System.out.println("Bike's front wheel characteristics:");
		System.out.println("Tyre brand: " + neumatico_del);
		System.out.println("Tyre diameter: " + medida_del);
		
	}
}

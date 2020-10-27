package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
	public static void createCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, introduce plate numbers:");
		String matricula = sc.nextLine();
		matricula = matricula.toUpperCase();
		Matcher m = Pattern.compile("^[0-9]{4}[A-Z]{2,3}$").matcher(matricula);
        if (m.find()) {
            System.out.println(matricula + " is a valid number plate");
        } else {
            System.out.println(matricula + " is not a valid number plate");
        }
		System.out.println("Please, introduce car's brand:");
		String marca = sc.nextLine();
		System.out.println("Please, introduce car's color:");
		String color = sc.nextLine();
		Car coche = new Car(matricula, marca, color);
		System.out.println("The car has the following characteristics:");
		System.out.println("Car's plate: " + coche.plate);
		System.out.println("Car's brand: " + coche.brand);
		System.out.println("Car's color: " + coche.color);
	}
	
	public static void addCarWheels() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, introduce car's back tires brand");
		String neumatico_tras = sc.nextLine();
		System.out.println("Please, introduce back tires size (between 0.4-4):");
		double medida_tras = sc.nextDouble();
		if (medida_tras < 0.4 || medida_tras > 4) {
			System.out.println("The diameter IS NOT correct!");
		} else {
			System.out.println("The diameter is correct!");
		}
		ArrayList<Wheel> backWheels = new ArrayList<Wheel>();
		backWheels.add(new Wheel(neumatico_tras, medida_tras));
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please, introduce car's back tires brand");
		String neumatico_del = sc2.nextLine();
		System.out.println("Please, introduce back tires size (between 0.4-4):");
		double medida_del = sc2.nextDouble();
		if (medida_del < 0.4 || medida_del > 4) {
			System.out.println("The diameter IS NOT correct!");
		} else {
			System.out.println("The diameter is correct!");
		}
		ArrayList<Wheel> frontWheels = new ArrayList<Wheel>();
		frontWheels.add(new Wheel(neumatico_del, medida_del));
		System.out.println("Car's back wheels characteristics:");
		System.out.println("Tyre brand: " + neumatico_tras);
		System.out.println("Tyre diameter: " + medida_tras);
		System.out.println("Car's Front wheels characteristics:");
		System.out.println("Tyre brand: " + neumatico_del);
		System.out.println("Tyre diameter: " + medida_del);
		
	}
	
}

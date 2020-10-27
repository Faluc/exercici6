package com.vehicles.project;
import com.vehicles.project.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Fase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, introduce plate numbers:");
		String matricula = sc.nextLine();
		System.out.println("Please, introduce car's brand:");
		String marca = sc.nextLine();
		System.out.println("Please, introduce car's color:");
		String color = sc.nextLine();
		Car coche = new Car(matricula, marca, color);
		
		System.out.println("Please, introduce back tires brand");
		String neumatico_tras = sc.nextLine();
		System.out.println("Please, introduce front tires brand");
		String neumatico_del = sc.nextLine();
		System.out.println("Please, introduce back tires size (between 0.4-4):");
		double medida_tras = sc.nextDouble();
		System.out.println("Please, introduce front tires size (between 0.4-4):");
		double medida_del = sc.nextDouble();
		
		ArrayList<Wheel> frontWheels = new ArrayList<Wheel>();
        ArrayList<Wheel> backWheels = new ArrayList<Wheel>();
        frontWheels.add(new Wheel(neumatico_del, medida_del));
        backWheels.add(new Wheel(neumatico_tras, medida_tras));
        
        System.out.println("The car has the following characteristics:");
        System.out.println("Plate: " + coche.plate);
		System.out.println("Brand: " + coche.brand);
		System.out.println("Color: " + coche.color);
		System.out.println("Back wheel tires brand and diameter: " + neumatico_tras + ", " + medida_tras);
		System.out.println("Front wheel tires brand and diameter: " + neumatico_del+ ", " + medida_del);
		
	}
}

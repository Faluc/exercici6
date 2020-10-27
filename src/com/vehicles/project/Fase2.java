package com.vehicles.project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, introduce plate numbers:");
		String matricula = sc.nextLine();
		matricula = matricula.toUpperCase();
		int long_matricula = matricula.length();
        if (long_matricula < 6 || long_matricula > 7)
        {
            System.out.println("License plate numbers have 6 o 7 charachters");
        }
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
		
		boolean medida_tras_correct = false;
		
		System.out.println("Please, introduce back tires brand");
		String neumatico_tras = sc.nextLine();
		System.out.println("Please, introduce front tires brand");
		String neumatico_del = sc.nextLine();
		System.out.println("Please, introduce back tires size (between 0.4-4):");
		double medida_tras = sc.nextDouble();
		if (medida_tras < 0.4 || medida_tras > 4) {
			System.out.println("The diameter seems to be incorrect!");
		} else {
			System.out.println("The diameter is correct!");
		}
		System.out.println("Please, introduce front tires size (between 0.4-4):");
		double medida_del = sc.nextDouble();
		if (medida_del < 0.4 || medida_del > 4) {
			System.out.println("The diameter seems to be incorrect!");
		} else {
			System.out.println("The diameter is correct!");
		}
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

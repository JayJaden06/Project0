/*
 * Author: Jaden Fong
 * Filename: Assignment1
 * Specification: Showing conversions of measurement for Javelin Throws
 * For: CS 1400 - Assignment #1
 * Time Spent: 1hr
 */

 //first commit

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		//declaring variables
		Scanner input = new Scanner(System.in);
		String name;
		double throw1, throw2, throw3;
		double yd1, yd2, yd3;
		double ft1, ft2, ft3;
		double in1, in2, in3;
		double cm1, cm2, cm3;
		
		
		//asking name
		System.out.println("Enter the competitor's name: ");
		name = input.nextLine();
		
		//title
		System.out.println("\nOlympic Javelin Throws");
		System.out.println("Enter the distances, in meters, for " + name);
		
		//asking throw distances
		System.out.println("\nPlease enter the distance for throw 1: ");
		throw1 = input.nextDouble();
		System.out.println("Please enter the distance for throw 2: ");
		throw2 = input.nextDouble();
		System.out.println("Please enter the distance for throw 3: ");
		throw3 = input.nextDouble();
		
		//throw 1 calculations
		yd1 = throw1 * 1.093; // converting to yards
		ft1 = yd1 * 3;		//converting to feet
		in1 = ft1 * 12;		//converting to inches
		cm1 = throw1 * 100;	//converting to cm
		//throw 2 calculations
		yd2 = throw2 * 1.093;
		ft2 = yd2 * 3;
		in2 = ft2 * 12;
		cm2 = throw2 * 100;
		//throw 3 calculations
		yd3 = throw3 * 1.093;
		ft3 = yd3 * 3;
		in3 = ft3 * 12;
		cm3 = throw3 * 100;
		
		//output
		System.out.println("");
		System.out.print("Yards");
		System.out.print("\tFeet");
		System.out.print("\tInches");
		System.out.println("\tCm");
		
		System.out.printf("%-10.2f", yd1);
		System.out.printf("%-10.2f", ft1);
		System.out.printf("%-10.2f", in1);
		System.out.printf("%-10.2f", cm1);
		System.out.println("");
		
		System.out.printf("%-10.2f", yd2);
		System.out.printf("%-10.2f", ft2);
		System.out.printf("%-10.2f", in2);
		System.out.printf("%-10.2f", cm2);
		System.out.println("");
		
		System.out.printf("%-10.2f", yd3);
		System.out.printf("%-10.2f", ft3);
		System.out.printf("%-10.2f", in3);
		System.out.printf("%-10.2f", cm3);
		System.out.println("");
		
		
		input.close();
	}
}



import java.util.Scanner;

public class couto_p2_BMI {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String typeSystem;
		float weightInPounds,weightInKilograms,heightInInches,heightInMeters,BMI;
		
		System.out.println("Which system would you like to use, Imperial or Metric");
		typeSystem = scnr.next();
		
		if(typeSystem.equals("Metric")) {
			System.out.print("What is your height?");
			heightInMeters = scnr.nextInt();
			System.out.print("What is your weight?");
			weightInKilograms = scnr.nextInt();
			
			BMI = weightInKilograms / (heightInMeters * heightInMeters);
			System.out.println("Your BMI is " + BMI);
			System.out.println("BMI Categories: ");
	        System.out.println("Underweight = <18.5");
	        System.out.println("Normal weight = 18.5–24.9");
	        System.out.println("Overweight = 25–29.9");
	        System.out.println("Obesity = BMI of 30 or greater");
			
			
			
			
	}
		else if(typeSystem.equals("Imperial")) {
			System.out.print("What is your height?");
			heightInInches = scnr.nextInt();
			System.out.print("What is your weight?");
			weightInPounds = scnr.nextInt();
			
			BMI = (weightInPounds * 703) / (heightInInches * heightInInches);
			System.out.println("Your BMI is " + BMI);
			System.out.println("BMI Categories: ");
	        System.out.println("Underweight = <18.5");
	        System.out.println("Normal weight = 18.5–24.9");
	        System.out.println("Overweight = 25–29.9");
	        System.out.println("Obesity = BMI of 30 or greater");
		}
		
		else {
			System.out.print("Invalid System type");	
		}
		
		
	}
}

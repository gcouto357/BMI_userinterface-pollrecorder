

import java.util.Scanner;

public class couto_p1_encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userPassword;
		char num1,num2,num3,num4;
		int val1,val2,val3,val4,tempOdd,tempEven;
		
		System.out.println("What is your password");
		userPassword = scnr.next();
		
		num1 = userPassword.charAt(0);
		num2 = userPassword.charAt(1);
		num3 = userPassword.charAt(2);
		num4 = userPassword.charAt(3);
		
		val1 = Character.getNumericValue(num1);
		val2 = Character.getNumericValue(num2);
		val3 = Character.getNumericValue(num3);
		val4 = Character.getNumericValue(num4);
		
		val1 = ((val1 + 7) % 10);
		val2 = ((val2 + 7) % 10);
		val3 = ((val3 + 7) % 10);
		val4 = ((val4 + 7) % 10);
	
		tempEven = val2;
		val2 = val4;
		val4 = tempEven;
		
		tempOdd = val1;
		val1 = val3;
		val3 = tempOdd;
		
		System.out.print(val1);
		System.out.print(val2);
		System.out.print(val3);
		System.out.print(val4);

	}

}

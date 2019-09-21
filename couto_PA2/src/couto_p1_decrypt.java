
import java.util.Scanner;

class couto_p1_decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userPassword;
		char num1,num2,num3,num4;
		int val1,val2,val3,val4,tempOdd,tempEven;
		
		System.out.println("What is your encrypted password");
		userPassword = scnr.next();
		
		num1 = userPassword.charAt(0);
		num2 = userPassword.charAt(1);
		num3 = userPassword.charAt(2);
		num4 = userPassword.charAt(3);
		
		val1 = Character.getNumericValue(num1);
		val2 = Character.getNumericValue(num2);
		val3 = Character.getNumericValue(num3);
		val4 = Character.getNumericValue(num4);
		
		tempEven = val2;
		val2 = val4;
		val4 = tempEven;
		
		tempOdd = val1;
		val1 = val3;
		val3 = tempOdd;
		
		if((val1-7) < 0) {
			System.out.print((val1 - 7) + 10);
		}
		else {
			System.out.print(val1 - 7);
		}
		
		if((val2-7) < 0) {
			System.out.print((val2 - 7) + 10);
		}
		else {
			System.out.print(val2 - 7);
		}

		if((val3-7) < 0) {
			System.out.print((val3 - 7) + 10);
		}
		else {
			System.out.print(val3 - 7);
		}
		
		if((val4-7) < 0) {
			System.out.print((val4 - 7) + 10);
		}
		else {
			System.out.print(val4 - 7);
		}

	}

}

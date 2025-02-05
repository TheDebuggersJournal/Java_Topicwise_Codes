package wipropart1day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zerodivision {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
			System.out.printf("%d/%d=%d\n",num1,num2,(num1/num2));
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Number is not divisible by 0");
		}
		
		catch(InputMismatchException ime) {
			System.out.println("Given input is not of correct type");
		}
	}

}

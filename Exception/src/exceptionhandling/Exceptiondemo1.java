package exceptionhandling;

import java.util.Scanner;

public class Exceptiondemo1 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int no1=s.nextInt();
		int no2=s.nextInt();
		try {
		int result=no1/no2;
		System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Please check the input values");
		}
		finally {
			System.out.println("j");
		}

	}

}

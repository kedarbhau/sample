package javaproject.test;

import java.util.Scanner;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double firstNumber = in.nextDouble();
		
		System.out.println("Enter the second number");
		double secondNumber = in.nextDouble();
		
		double sum = 0;
		
		sum = firstNumber + secondNumber;
		
		System.out.println("Sum of 2 numbers is " + sum );
	}

}

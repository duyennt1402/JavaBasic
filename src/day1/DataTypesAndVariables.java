package day1;

import java.util.*;

public class DataTypesAndVariables {
	// Exe 1
	public void printHelloWord() {
		System.out.println("Hello world");
	}

	// Exe 2
	public void printString() {
		System.out.println("++++++\n" + "\r" + "@@@@@@\r" + "\r\n" + "******\r" + "\r\n" + "######\r" + "");

	}

	// Exe 3
	public void printNumber() {
		byte a = 10;
		float b = 20.3f;
		double c = 3.14785;
		System.out.println(a + " " + b + " " + c);
	}

	/*
	 * Execise 4 Write a Java program to declare a Boolean variable with initial
	 * value of “true” and later change it to “false” before printing it.
	 */
	public void changeNegative() {
		boolean a = true;
		System.out.println(!a);
		// return a;

	}

	/*
	 * Execise 6. Write a Java program to convert temperature from Fahrenheit to
	 * Celsius degree. Test Data Input a degree in Fahrenheit: 212 Expected Output :
	 * 212.0 degree Fahrenheit is equal to 100.0 in Celsius
	 */
	public void convertTemp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number- ");
		int n = sc.nextInt();
		float m = (n * 100) / 212;
		sc.close();
		System.out.println(m);
		System.out.println(n + "F degree" + "= " + n * 100 / 212);

	}

	/*
	 * 7. Write a Java program that reads a number in inches, converts it to meters.
	 * Note: One inch is 0.0254 meter. Test Data Input a value for inch: 1000
	 * Expected Output : 1000.0 inch is 25.4 meters
	 */
	public void convertMeter() {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input inches: ");
			float l = sc.nextFloat();
			// System.out.println(l);
			float k = (float) (l * 0.0254);
			System.out.println(l + " inches = " + k + "meters");
		}

	}

	/*
	 * input string
	 */
	public void inputString() {
		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();

		// Write your code here.

//		double d = scan.nextDouble();

		System.out.println("input a sentence: ");
		String s = scan.nextLine();
		System.out.println(s);
//		System.out.println("String: " + s);
//		System.out.println("Double: " + d);
//		System.out.println("Int: " + i);
		scan.close();
	}

}

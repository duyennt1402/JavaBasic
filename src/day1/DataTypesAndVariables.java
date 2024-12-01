package day1;

import java.util.Scanner;

public class DataTypesAndVariables {
	// Exe1
	public void printHelloWorld() {
		System.out.println("Hello world");
	}

	// Exe2
	public void printString() {
		System.out.println("++++\r" + "test");
	}

	// Exe3
	public void printNumber() {
		byte a = 10;
		float b = (float) 20.3;
		double c = 3.145785;
		System.out.println(a + "\n" + b + "\r" + c);

	}

	/*
	 * Exe4 Write a Java program to declare a Bloolean variable with initial value
	 * of "true" and later change it to "false" before printing it
	 */
	public void changeNegative() {
		boolean a = true;
		System.out.println(!a);
		// return a;
	}

	/*
	 * Exe 6 Write a Java program to convert temperature from F to C. Test data =
	 * 212 , expected output. 212 f = 100 C
	 */
	public void convertTemp() {
		// input from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first nubmer-");
		int n = sc.nextInt();
		float m = (n * 100) / 212;
		sc.close();
		System.out.println(m);
		System.out.println(n + " F degree" + " =" + m + "- C degree");
	}

	/*
	 * Exe 7 Write a Java program that reads a number in inches, converts it to
	 * meters. Note: One inch iss 0.0254 meter. Test data input a value for inch:
	 * 1000. Expected output: 25.4 m
	 */
	public void convertDistance() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Input Inches:");
		float l = sc2.nextFloat();
		float k = (float) (1 * 0.0254);
		sc2.close();
		System.out.println(l + " Inches = " + k + " meters");
	}

	/*
	 * Exe 8 Input string
	 */
	public void inputString() {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Input a sentence:");
		String s = sc3.nextLine();
		System.out.println(s);
		sc3.close();
	}

}

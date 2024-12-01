package day3;

import java.util.Scanner;

public class DecisionMaking {
	/*
	 * Exe1: tinh tong
	 */
	public void sum(int n) {
		String n_as_string = Integer.toString(n);
		int sum = 0;
		for (int i = 0; i < n_as_string.length(); i++) {
			char x = n_as_string.charAt(i);
			int convertx = Character.getNumericValue(x);
			sum = sum + convertx;
		}
		System.out.println(sum);
	}

	/*
	 * Ex1 - Redo write a java program that reads an integer between 0 and 1000 and
	 * add all the digits in the integer. Convert the integer to string using
	 * Integer.toString(); using for to get each character of this string convert
	 * each character to integer using Character.getNambericValue(); Sum all
	 * character after convert to integer.
	 */
	public void sumInteger(int n) {
		Scanner inputInt = new Scanner(System.in);
		System.out.println("Input n11: \n");
		int n1 = inputInt.nextInt();
		inputInt.close();
		String n1_as_String = Integer.toString(n1);
		int sum = 0;
		for (int i = 0; i < n1_as_String.length(); i++) {
			// get character i of string n1
			char x = n1_as_String.charAt(i);
			// convert lai int
			int convert_X = Character.getNumericValue(x);
			sum = sum + convert_X;

		}
		System.out.println(sum);
	}

}

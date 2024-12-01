package week1;

import java.util.Scanner;

public class Printer {
	// 2.1 Hello world
	public void printHelloWorld() {
		System.out.println("Hello World");

	}

	// 2.2 Write a program that input 2 number and print sum of 2 numbers.
	public void printSumOfTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: \n");
		int a = sc.nextInt();
		System.out.println("Input second number:\n");
		int b = sc.nextInt();
		sc.close();
		int sum = a + b;
		System.out.println("Sum of the 2 numbers:" + sum);

	}

	// 2.3 Write a program that input 2 numbers and print bigger numbers.
	public void printBiggerNumber() {
		Scanner sc23 = new Scanner(System.in);
		System.out.println("Input first number:\n");
		int num1 = sc23.nextInt();
		System.out.println("Input second number: \n");
		int num2 = sc23.nextInt();
		sc23.close();
		if (num1 == num2) {
			System.out.println("First nubmer= second number = :" + num1);
		} else {
			if (num1 > num2) {
				System.out.println("Bigger number is:" + num1);
			} else {
				System.out.println("Bigger number is: " + num2);
			}
		}
	}
	// 2.3 Write a program that input 2 numbers and print bigger numbers.-way2
	public void printBiggerNubmer(int a, int b) {
		int max=a;
		if(max<a) {
			max=a;
		}
		System.out.println("The bigger number is:"+ max);
		
	}

	// 2.4 Write a program that input 3 numbers and print the biggest number
	public void printBiggestNumber(int a, int b, int c) {
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		System.out.println("Biggest number is:" + max);
	}

	// 2.5 Write a program that input number from 1 to 12 and print the name of
	// month in English.
	public void printMonthOfYear() {
		Scanner inputMonth = new Scanner(System.in);
		System.out.println("Input number from 1 to 12:");
		int m = inputMonth.nextInt();

		inputMonth.close();
		switch (m) {
		case 1:
			System.out.println("This is January");
			break;
		case 2:
			System.out.println("This is February");
			break;
		case 3:
			System.out.println("This is March");
			break;
		case 4:
			System.out.println("This is April");
			break;
		case 5:
			System.out.println("This is May");
			break;
		case 6:
			System.out.println("This is June");
			break;
		case 7:
			System.out.println("This is July");
			break;
		case 8:
			System.out.println("This is August");
			break;
		case 9:
			System.out.println("This is September");
			break;
		case 10:
			System.out.println("This is October");
			break;
		case 11:
			System.out.println("This is November");
			break;
		case 12:
			System.out.println("This is December");
			break;
		default:
			System.out.println("Please reinput n in [1-12]");
		}
	}

}

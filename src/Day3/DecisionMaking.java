package Day3;

import java.util.Scanner;

public class DecisionMaking {
	/*
	 * Ex1-way1
	 */
	public void tinhTong(int n) {
		// int n = 565;
		String n_as_string = Integer.toString(n);
		int sum = 0;
		// int i;
		for (int i = 0; i < n_as_string.length(); i++) {
			char x = n_as_string.charAt(i);
			int convertx = Character.getNumericValue(x);
			sum = sum + convertx;

		}
		System.out.println(sum);
	}

	/*
	 * Ex1 - redo Write a Java program that reads an integer between 0 and 1000 and
	 * adds all the digits in the integer. convert the integer to string using
	 * Integer.toString(); using for to get each charater of this string covert each
	 * charater to integer using Character.getNumbericValue(); Sum all character
	 * after convert to integer
	 */
	public void sumInteger(int n) {
		Scanner inputInt = new Scanner(System.in);
		System.out.println("Enter integer: ");
		int n1 = inputInt.nextInt();
		inputInt.close();
		String n1_as_String = Integer.toString(n1);
		int sum = 0;
		for (int i = 0; i < n1_as_String.length(); i++) {
			// get character i of string n1
			char x = n1_as_String.charAt(i);
			// convert lại int
			int convert_X = Character.getNumericValue(x);
			sum = sum + convert_X;
		}
		System.out.println(sum);
	}

	/*
	 * Ex2 Write a Java program to convert minutes into a number of years and days
	 */
	public void convertMinuteToYeDa() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of minutes: ");
		int minutes = input.nextInt();
		input.close();
		int year = minutes / 525600;
		int remainMinutes = minutes - (year * 525600);
		int day = remainMinutes / 1440;
		System.out.println(minutes + " minutes = " + year + " years " + day + " days");
	}

	/*
	 * Given an integer, , print its first multiples. Each multiple (where ) should
	 * be printed on a new line in the form: N x i = result.
	 */
	public void printMulti() {

		Scanner inputN = new Scanner(System.in);
		System.out.println("Input N: ");
		int n = inputN.nextInt();
		inputN.close();
		int multi = 0;
		for (int i = 1; i < 11; i++) {
			multi = n * i;
			System.out.println(n + "*" + i + "=" + multi + "\n");
		}
		/*
		 * write a program input n from keyboard and print a day of week ( using Switch)
		 */

	}

	public void PrintDayofWeek(int n) {
		Scanner inputDay = new Scanner(System.in);
		System.out.println("Input day in week:");
		int d = inputDay.nextInt();
		inputDay.close();
		switch (d) {
		case 2:
			System.out.println("This is Monday");
			break;
		case 3:
			System.out.println("This is Tueday");
			break;

		case 4:
			System.out.println("This is Wed");
			break;
		case 5:
			System.out.println("This is Thurs");
			break;
		case 6:
			System.out.println("This is Fri");
			break;
		case 7:
			System.out.println("This is Sat");
			break;
		case 8:
			System.out.println("This is Sunday");
			break;
		default:
			System.out.println("Please reinput n in [2-8]");
		}

	}
	/*
	 * 
	 */
//	public by getLocator (String locatorType, String locatorValue){
//		switch(locatorType){
//			case "id": 
//			{result = By.id(locatorValue);
//			break;}
//
//		}
//
//		return result;
//		}
	/*
	 * 2. Write a program called SumAndAverage to produce the sum of 1, 2, 3, ...,
	 * to 100. Also compute and display the average. The output shall look like: The
	 * sum is 5050 The average is 50.5
	 * 
	 */
	

}

package week2;

import java.util.Scanner;

public class RectangeUsdk {
	// 1. write a program that input length and width the draw the filled rectange
	// with character
	public void rectangeFull() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input length, width for rectange:");
		int length = sc.nextInt();
		// System.out.println("Input width for rectange:");
		int width = sc.nextInt();
		sc.close();
		for (int i = 1; i <= length; i++) {

			{
				for (int j = 1; j <= width; j++) {
					System.out.print("*  ");
				}
				System.out.println();
			}
		}

	}

	// 2. Write a program that input number n is length and width the draw bordered
	// rectange with character *
	public void rectangeBodder() {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input length, width for rectange:");
		int length = sc1.nextInt();
		// System.out.println("Input width for rectange:");
		int width = sc1.nextInt();
		sc1.close();
		for (int i = 1; i <= length; i++) {

			{
				for (int j = 1; j <= width; j++) {
					if (i == 1 || i == length || j == 1 || j == width) {
						System.out.print("*  ");

					} else {
						System.out.print("   ");
					}

				}
				System.out.println();

			}

		}

	}

////	3. Write a program that input number n is length of array. then input n numbers element in arrary.
//	Print the first nubmer >10, if no number > 10 print "No number"
////	
	public void printArray() {
		int n;
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Input n:");
		n = sc3.nextInt();
		int a[] = new int[n];
		System.out.println("Input the elements of the array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc3.nextInt();
		}
		sc3.close();

		if (n < 10) {
			System.out.println("No number");
		} else {
			System.out.println("Elements of Array are:");
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + "  ");
				if (i == 9) {
					break;
				}
			}

		}

	}

	// EX4
	public void byte2HexString(String args[]) {
		int n;
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Input n:");
		n = sc4.nextInt();
		byte byteArray[] = new byte[n];
		for (int i = 0; i < n; i++) {
			byteArray[i] = sc4.nextByte();
		}
		sc4.close();
		StringBuilder sb = new StringBuilder();
		for (byte b : byteArray) {
			sb.append(String.format("%02X ", b));
		}
		System.out.println(sb.toString());
	}

}

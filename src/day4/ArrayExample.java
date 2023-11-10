package day4;

import java.util.ArrayList;

//import java.util.Scanner;

public class ArrayExample {

	public static void printArray() {
		int a[];
		a = new int[6];
		a[0] = 7;
		a[1] = 8;
		a[2] = 9;
		a[3] = 4;
		a[4] = 3;
		a[5] = 2;
//		Scanner inputI=new Scanner(System.in);
//		int x=inputI.nextInt();
		for (int i = 0; i < a.length; i++) {
			// a[i] = 7;

			System.out.println("a" + "[" + i + "]" + a[i]);
			// i = i + 1;
		}
	}

	/*
	 * {"Lan", "Mai", "Nga"}
	 */
	public void printString() {
		String b[];
		b = new String[3];
		b[0] = "Lan";
		b[1] = "Mai";
		b[2] = "Nga";
		System.out.println(b[b.length - 1]);
	}

	/*
	 * mang 2 chieu
	 */
	public void print2DArray() {
		int a[][] = new int[3][4];
		a[0][0] = 4;
		a[0][1] = 5;
		a[0][2] = 4;
		a[0][3] = 3;
		a[1][0] = 7;
		a[1][1] = 4;
		a[1][2] = 1;
		a[1][3] = 4;
		a[2][0] = 6;
		a[2][1] = 3;
		a[2][2] = 3;
		a[2][3] = 5;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}

	}

	/*
	 * 
	 */
	public void printArrayList() {
		ArrayList<String> diems= new ArrayList<String>();
		//Thêm phần tử
		diems.add("Lan");
		diems.add("Lan1");
		diems.add("Lan2");
		diems.add("Lan3");
		
//		for (int i=0;i<diems.size();i++) {
//			System.out.println();
//			
//		}
		for (String s:diems) {
			System.out.println(s);
		}
		diems.get(diems.size()-1);
	}
	/*
	 * 1.	Cho mảng a lưu giá trị dãy số a = {1,3,5,8,9}. Viết hàm in ra giá trị của mảng.
	 */
	public void printArray2() {
		int a[]= new int[5];
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=8;
		a[4]=9;
		for (int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]   ");
		}
	}
}

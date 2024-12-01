package week1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printLesson = new Printer();
		//printLesson.printHelloWorld();
		//printLesson.printSumOfTwoNumbers();
		//printLesson.printBiggerNumber();
		//printLesson.printMonthOfYear();
		/*Scanner sc33=new Scanner(System.in);
		System.out.println("input a:");
		int a = sc33.nextInt();
		System.out.println("input b:");
		int b = sc33.nextInt();
		System.out.println("input c:");
		int c = sc33.nextInt();
		sc33.close();
		printLesson.printBiggestNumber(a, b, c);*/
		Scanner sc33=new Scanner(System.in);
		System.out.println("input a:");
		int a = sc33.nextInt();
		System.out.println("input b:");
		int b = sc33.nextInt();
		sc33.close();
		printLesson.printBiggerNubmer(a, b);
		

	}

}

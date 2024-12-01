/**
 * 
 */
package day2;

import java.util.Scanner;

/**
 * 
 */
public class Operators {
	/*
	 * 1. what will be the output of the program?
	 * if x < 15 will print "small", x> 22 print "huge", 15< x < 22 will print "tiny"
	 */
	public void compare(String[] args) {
		int x=20;
		String sup = (x<15)? "small" : (x<22)? "tiny":"huge";
		System.out.println(sup);
	}
	
	/*
	 * 2. calculate speed with input meter and hour from key board
	 */
	public void calSpeed() {
		//input meter and hours
		Scanner meter = new Scanner(System.in);
		System.out.println("Input distance in meter: ");
		float m = meter.nextFloat();
		System.out.println("\r Input hour: ");
		int h = meter.nextInt();
		System.out.println("\r Input minute: ");
		int  mi = meter.nextInt();
		System.out.println("\r Input second: ");
		int  se = meter.nextInt();
		meter.close();
		double time = h*3600 + mi*60+se;
		double speed=(double)Math.round((double)m/time)*1000000000d/100000000d;
		System.out.println("YOur speed in meters/second is"+ speed+"\r");
		
		
		
	}
	

}

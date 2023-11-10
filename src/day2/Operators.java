package day2;

import java.util.Scanner;

public class Operators {

	/*
	 * 1. What will be the output of the program?
	 */
	public void compare(String[] args) {
		int x = 20;
		String sup = (x < 15) ? "small" : (x < 22) ? "tiny" : "huge";
		System.out.println(sup);
	}

	/*
	 * 2. speed
	 */
	public void calSpeed() {
		Scanner meter = new Scanner(System.in);
		System.out.print("Input distance in meters:  ");
		int m = meter.nextInt();
		System.out.print("Input hour:  ");
		int h=meter.nextInt();
		System.out.print("Input minutes:  ");
		int mi=meter.nextInt();
		System.out.print("Input seconds:  ");
		int s=meter.nextInt();
		meter.close();
		double time=h*3600+mi*60+s;
		double speed1=(double)Math.round((double)m/time)* 100000000d/ 100000000d;
		//double speed=(double)Math.round(((double)distance/(double)timeInSeconds) * 100000000d) / 100000000d;
		double speed2=((m*0.001)*36000/(time));
		//dobule speed3=(double)(m/1609.344)*36000/(time)
		System.out.println("Your speed in meters/second is "+speed1+"\r");
		System.out.println("Your speed in km/h  "+speed2+"\r");
		//System.out.println("Your speed in miles/h"+speed3+"\r");
	}
}

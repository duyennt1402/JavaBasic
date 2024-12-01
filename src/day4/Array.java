package day4;

public class Array {
	//ex1
	public void printArray() {
		int a[];
		a= new int[6];
		a[0]=7;
		a[1]=8;
		a[2]=9;
		a[3]=10;
		a[4]=11;
		a[5]=12;
		for (int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]"+ a[i]);
		}
	}
	//EX2 print a string
	public void printString() {
		String b[];
		b= new String[3];
		b[0]="Lan";
		b[1]="Mai";
		b[2]="Nga";
		System.out.println(b[b.length-1]);
		
	}

}

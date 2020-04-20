package Lecture6;

import java.util.Scanner;

public class FibonaciiSeries {

	public static void main(String[] args) {
		System.out.println("Enter y as to get y'th fibonacii term  ");
		Scanner scn = new Scanner(System.in);
		int y = scn.nextInt();
		//System.out.println("Enter m as power ");
		//scn = new Scanner(System.in);
		//int m = scn.nextInt();
		int ans=fiboSeries(y);
		System.out.println("Ans is "+ans);

	}
	public static int fiboSeries(int n) {
		if(n==0||n==1)
			return n;
		
		
			int fnm= fiboSeries(n-1)+fiboSeries(n-2);
		
			return fnm;
		
			
	}

}

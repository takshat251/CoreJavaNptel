package Lecture5;

import java.util.Scanner;

public class StringOps {

	public static void main(String[] args) {
		System.out.println("Enter the string please");
		Scanner scn = new Scanner(System.in);
		String stm = scn.nextLine();
		printChars(stm);
		printSS(stm);

	}

	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	public static void printSS(String str) {	
		for(int si=0;si<=str.length()-1;si++) {
			for(int ei=si+1;ei<=str.length();ei++) {
	        System.out.println(str.substring(si, ei));
	       
	        
			}
		}
	}

}

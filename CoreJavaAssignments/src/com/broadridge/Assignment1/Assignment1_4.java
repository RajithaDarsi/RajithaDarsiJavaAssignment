package com.broadridge.Assignment1;

import java.util.Scanner;
//Write a program to check whether the current year is leap year or not. Users will enter a year value.
public class Assignment1_4 {

	public static void main(String[] args) {
		int year;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an year: " );
		year = scanner.nextInt();
		if(year%4==0)
		System.out.println(year+" is a leap year");
		else 
			System.out.println(year+" is not a leap year");	
		
		
	}
}

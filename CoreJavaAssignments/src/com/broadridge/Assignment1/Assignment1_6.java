package com.broadridge.Assignment1;

import java.util.Scanner;
//Write a program to calculate the area of a triangle. Users will enter the values for base and height of the triangle.
public class Assignment1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, height;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter base of trainagle: " );
		base = scanner.nextInt();
		System.out.println("Enter height of triangle: " );
		height = scanner.nextInt();
		System.out.println("area of triangle= " +0.5*base*height);
	}

}

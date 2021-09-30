package com.broadridge.Assignment1;

import java.util.Scanner;
//Write a program to calculate the factorial of a number using a while loop.
public class Assignment1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to calculate its factorial : " );
		int n= scanner.nextInt();
		int factorial=fact(n);
		System.out.println("factorial of "+n+" is "+factorial);
	}
	public static int fact(int n)
	{
		int fact=1;
		if(n==0 || n==1)
			fact=1;
			else
			{
		while(n>1)
		{
			fact=fact*n;
			n--;		
		}
			}
		return fact;
	}
}

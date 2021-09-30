package com.broadridge.Assignment1;

import java.util.Scanner;
//Write a program to print fibonacci series (10 values).
public class Assignment1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib=0;
		int f1=0,f2=1;
		System.out.print(f1+" "+f2);
		for(int i=0;i<8;i++)
		{
			fib=f1+f2;
			System.out.print(" "+fib);
			f1=f2;
			f2=fib;	
		}
		
	}
	
}

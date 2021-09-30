package com.broadridge.Assignment1;

import java.util.Scanner;


public class Assignment1_8 {

	public static void main(String[] args) {
	
	 //declaration

	int counter=0;

	Scanner scanner = new Scanner(System.in);

	System.out.println("How many elements you want to enter: ");

	counter = scanner.nextInt();
	int[] arr = new int[counter];

	Scanner reader = new Scanner(System.in);

	System.out.println("Enter the elements of the array");

	for(int i=0;i<counter;i++)

	{

	arr[i] = reader.nextInt();

	}

	reader.close();
//System.out.println(arr.length);
	System.out.println("The elements in reverse order");
	for(int i=arr.length-1;i>=0;i--)

	{

		System.out.print(arr[i]+ " ");
	}

	
	}
}

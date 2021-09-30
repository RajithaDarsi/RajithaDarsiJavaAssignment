package com.broadridge.Assignment2;
//Java Program to Calculate average of numbers using Array
public class Assignment2_1 {
public static void main(String[] args) {
	int value[]= {1,2,3,4,5};
	int sum=0;
	double average;
	for(int i=0;i<value.length;i++)
	{
		sum=sum+value[i];
	}
	average=sum/value.length;
	System.out.println("Average of numbers= "+average);
}
}

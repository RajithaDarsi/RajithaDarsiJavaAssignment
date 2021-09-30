package com.broadridge.Assignment2;
//Find the sum of digits

public class Assignment2_4 {

	public static void main(String[] args) {
	int a,sum=0,n=1234;
	while(n>0)
	{
		a=n%10;
	    sum=sum+a;
	    n=n/10;
	}
	System.out.println("sum="+sum);
	}
}

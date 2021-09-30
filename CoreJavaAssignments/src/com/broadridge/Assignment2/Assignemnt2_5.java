package com.broadridge.Assignment2;
//Reverse a number 123
public class Assignemnt2_5 {

	public static void main(String[] args) {
		int n=123,a,reverse=0;
		while(n>0)
		{
			a=n%10;
		    reverse=reverse*10+a;
		    n=n/10;
		}
		System.out.println("reverse of a number="+reverse);
	}

}

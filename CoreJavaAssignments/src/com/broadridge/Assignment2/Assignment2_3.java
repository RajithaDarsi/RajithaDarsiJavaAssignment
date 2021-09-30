package com.broadridge.Assignment2;
//Is 13 a prime number?
public class Assignment2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("13 is not a prime number");
				break;
			}				
			else
				System.out.println("13 is a prime number");
			break;
		}
	}

}

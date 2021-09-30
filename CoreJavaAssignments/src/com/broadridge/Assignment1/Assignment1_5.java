package com.broadridge.Assignment1;
//Write a program to print the first 10 prime numbers.
public class Assignment1_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{

			int cP=0,n=0,i=1,j=1;

			System.out.println("The first 10 prime numbers are:");

			while(n<10)

			{

			j=1;

			cP=0;

			while(j<=i)

			{

			if(i%j==0)

			cP++;

			j++;

			}

			if(cP==2)

			{

			System.out.print(" "+ i);

			n++;

			}

			i++;

			}

			}

			}}

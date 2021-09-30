package com.broadridge.Assignment2;
//Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6
public class Assignment2_6 {

	public static void main(String[] args) {
	   int a[]= {12,32,12,45,65,93,0,23,45,6};	
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   if(i!=j) {
			   if(a[i]==a[j])
				   System.out.println(a[i]+" is a duplicate");		   
			   }
			 }
	   }
	}

}

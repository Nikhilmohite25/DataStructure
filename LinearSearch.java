package com.DataStructure;

import java.util.Scanner;

  
public class LinearSearch {
	
	public static int Search(int a[], int target)
	  {
	   
		  for(int i=0; i<a.length; i++)
		  {
			  if(a[i]==target)
			  {
				  return i;
			  }
		  }
		  return -1;
	  }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements that you want to search:");
		int target = sc.nextInt();
		 
		
		int result = Search(arr, target);
		System.out.println("Element found at position:"+result);
		
        
	}

}


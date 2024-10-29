package com.DataStructure;

import java.util.Scanner;

public class BinarySearch {
	
	public static int SearchEle(int[]arr, int target)
	{
	      int left = 0;
	      int right = arr.length-1;
	      
	      while(left<=right)
	      {
	    	  int mid = left +(right-left)/2;
	    	  
	    	  if(arr[mid]==target)
	    	  {
	    		  return mid;
	    	  }
	    	  else if(arr[mid]<target)
	    	  {
	    		  left = mid+1;
	    	  }
	    	  else
	    	  {
	    		  right = mid-1;
	    	  }
	      }
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
        for(int i=0; i<arr.length; i++)
        {
        	arr[i] = sc.nextInt();
        }
       
        System.out.println("Enter target element to search for");
        int target = sc.nextInt();
        
       int result = SearchEle(arr, target);
        
        System.out.println("element found at position:"+ result);
        
        
	}

}

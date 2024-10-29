package com.DataStructure;

public class BubbleSort {
	
	public static void Sorting(int a[])
	{
		for(int i =0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
	}
	
	public static void display(int a[])
	{
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		} 
		System.out.println();
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7, 4, 9, 2, 1, 4};
		
		System.out.println("Before sorting:");
		display(arr);
		
		Sorting(arr);
		System.out.println("After Sorting elements are:");
        display(arr);
	}

}

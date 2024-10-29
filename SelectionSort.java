package com.DataStructure;

public class SelectionSort {
	
	public static void Sorting(int a[])
	{
		for(int i=0; i<a.length-1; i++)
		{
			int min=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[min])
				{
					min = j;
				}
			}
			int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
			
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
		
        int arr[] = {8, 14, 2, 1, 0, 9};
		
		System.out.println("Before sorting:");
		display(arr);
		
		Sorting(arr);
		System.out.println("After Sorting elements are:");
        display(arr);


	}

}

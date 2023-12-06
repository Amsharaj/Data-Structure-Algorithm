package Sorting;

import java.util.Scanner;

public class Work_Out {
	static void Replace(int arr[],int n) {
		int max,temp;
		max=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			temp=arr[i];
			arr[i]=max;
			if(temp>max)
				max=temp;
		}
		arr[n-1]=0;
	}
     static void printArray(int arr[],int n) {
    	 for(int i=0;i<n;i++) 
 			System.out.print(arr[i]+" ");
     }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=s.nextInt();
		System.out.println("Enter array elements ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();}
		System.out.println("The final array is ");
		Replace(arr,n);
		printArray(arr,n);
s.close();
	}

}

package Sorting;

import java.util.Scanner;

public class Array_swap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			System.out.print("Enter the number of elements: ");
			int n=s.nextInt();
			int arr[]=new int[n];
			System.out.print("Enter the array elements: ");
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			 for(int i=0;i<n-1;i+=2) {
				 int t=arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1]=t;
	}
			for(int i=0;i<n;i++) {
				 System.out.print(arr[i]+" ");
			 }s.close();
	}
}

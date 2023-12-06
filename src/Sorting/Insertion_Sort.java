package Sorting;

import java.util.Scanner;

public class Insertion_Sort {
	static void insertionSort(int n,int arr[]) {
		int t,key;
		for (int step=0;step<n;step++) {
			key=step;
			for(int i=step-1;i>=0;i--) {
				if (arr[i]>arr[key]) {
					t=arr[i];
					arr[i]=arr[key];
					arr[key]=t;
					key--;
				}
			}
			
		}
		
	}
	static void printArray(int n,int arr[]) {
		System.out.println("After the sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
insertionSort(n,arr);
printArray(n,arr);
s.close();

	}

}

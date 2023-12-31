package Sorting;

import java.util.Scanner;

public class Quick_Sort {
	static int partition(int arr[],int low, int high) {
		int pivot = arr[high];
		int i=(low-1),t;
		for(int j=low;j<=high-1;j++) {
			if(arr[j]<=pivot) {
				i++;
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		t=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=t;
		return i+1;
	}
	static void quicksort(int arr[],int low,int high) {
		if(low<high) {
			int pi=partition(arr,low,high);
			quicksort(arr,low,pi-1);
			quicksort(arr,pi+1,high);
		}
	}
	static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		 System.out.print("Enter no. of elements you want in array: ");
		n=s.nextInt();
		 int[] arr = new int[n];

	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = s.nextInt();
	        }
		 //int arr[]= {10,7,8,9,1,5};
		 n=arr.length;
		quicksort(arr,0,n-1);
		System.out.println("Sorted Array: n");
        printArray(arr,n);
        s.close();
	}

}

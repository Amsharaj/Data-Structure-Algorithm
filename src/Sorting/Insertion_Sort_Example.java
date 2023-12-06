package Sorting;

import java.util.Scanner;

public class Insertion_Sort_Example {
	static void Insert(int arr[],int n) {
		int t,key;
		for(int i=0;i<n;i++) {
			key=i;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>arr[key]) {
					t=arr[j];
					arr[j]=arr[key];
					arr[key]=t;
					key--;
				}
			}
		}
	}
static void Display(int arr[],int n) {
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
Insert(arr,n);
Display(arr,n);
s.close();
	}

}

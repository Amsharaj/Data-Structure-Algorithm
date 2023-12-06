package Sorting;

import java.util.Scanner;

public class BubbleSort_Example {
	static void Bubble(int n,int arr[]) {
		int t;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
	}
static void Print(int n,int arr[]) {
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    int n=s.nextInt();
     int arr[]=new int[n];
      for(int i=0;i<n;i++)
      arr[i]=s.nextInt();
      Bubble(n,arr);
      Print(n,arr);
      s.close();
	}

}

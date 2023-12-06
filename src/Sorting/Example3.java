package Sorting;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	//	System.out.print("Enter the number of elements: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		//System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		//System.out.print("Enter the K value: ");
		int K=s.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]%K==0) {
				System.out.print("1 ");
			}
			else {
				System.out.print("0 ");
			}
		}s.close();
	}

}

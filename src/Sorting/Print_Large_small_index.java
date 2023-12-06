package Sorting;

import java.util.Scanner;

public class Print_Large_small_index {

	public static void main(String[] args) {
		int maxind,minind;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();}
		minind=0;maxind=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<arr[minind]) {
				minind=i;}
			else if(arr[i]>arr[maxind]) {
					maxind=i;}
			}
		System.out.println(minind+1);
		System.out.println(maxind+1);
				s.close();
			}
		

	}



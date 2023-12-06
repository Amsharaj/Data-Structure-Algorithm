package Sorting;

import java.util.Scanner;

public class Sum_array {

	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
        for(int i=0;i<n;i++) {
        
        sum= sum+arr[i];
        }
     //  System.out.print("sum="+sum);
        if(sum%2==0&&sum%3==0&&sum%5==0) 
        	System.out.print("1");
        else 
        	System.out.print("0");
        s.close();
	}

}

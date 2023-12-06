package Sorting;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int sum=0;
		double avg;
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
      System.out.println("Sum="+sum);
        avg=(double)sum/n;
      System.out.println("avg="+avg);
      s.close();
	}

}

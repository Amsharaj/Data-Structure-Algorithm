package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Small_positive_Integer {
	public static int findSmallestMissingPositive(int[] arr) {
        Arrays.sort(arr);
        int smallestMissing = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallestMissing) {
                smallestMissing++;
            }
        }

        return smallestMissing;}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=s.nextInt();
		System.out.println("Enter array elements ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
       int result=findSmallestMissingPositive(arr);
       System.out.print("The smallest positive missing integer is "+result);
       s.close();
	}

}

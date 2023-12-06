package Sorting;

import java.util.Scanner;

public class Difference_index {

	public static void main(String[] args) {
		int n,a=0,b=0,c;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		 n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
for (int i=0;i<n;i++) {
	if(arr[i]<arr[b]) {
		b=i;
	}
	else if(arr[i]>arr[a]) {
		a=i;
	}
}
c=a-b;
System.out.print(c);
s.close();
	}

}

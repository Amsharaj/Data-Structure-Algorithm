package Linear_data_structure;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=s.nextInt();
        int arr[]=new int[n+1];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
        System.out.println("The initial Array: ");
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");}
        for(int r=0;r<n-1;r++) {
        	int x=arr[n-1];
        	  for(int i=n-1;i>0;i--)  
            	  arr[i]=arr[i-1];
              arr[0]=x;}
              System.out.println("\nThe array after permutation is: ");
              for(int i=0;i<n;i++)
            	  System.out.print(arr[i]+" ");
                s.close();
        

	}

}

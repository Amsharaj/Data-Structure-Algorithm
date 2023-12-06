package Linear_data_structure;

import java.util.Scanner;

public class Number_of_rotation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=s.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter the array Elements ");
        for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
        System.out.println("The contents of the array before rotation are ");
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");}
        System.out.println("\nEnter the number by which the array elements are to be rotated ");
        int rot=s.nextInt();
        for(int r=0;r<rot;r++) {
        	int x=arr[n-1];
        	  for(int i=n-1;i>0;i--)                    
            	  arr[i]=arr[i-1];
              arr[0]=x;
        }
      System.out.println("The contents of the array after rotation are ");
      for(int i=0;i<n;i++)
    	  System.out.print(arr[i]+" ");
        s.close();

	}

}

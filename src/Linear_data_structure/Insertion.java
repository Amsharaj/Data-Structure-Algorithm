package Linear_data_structure;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n=s.nextInt();
        int arr[]=new int[n+1];
        System.out.print("Enter the array Elements one by one: ");
        for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
        System.out.print("Enter the position you want to insert: ");
        int pos=s.nextInt();
        System.out.print("Enter the element you want to insert: ");
        int element=s.nextInt();
        int j=n;
        while(j>pos) {
        	arr[j]=arr[j-1];
        j--;}
        arr[pos]=element;
        
        System.out.println("Array Traverse: ");
        for(int i=0;i<=n;i++)
        	System.out.print(arr[i]+" ");
        s.close();

	}

}

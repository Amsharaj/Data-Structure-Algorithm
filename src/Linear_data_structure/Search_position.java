package Linear_data_structure;

import java.util.Scanner;

public class Search_position {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of Elements you want in array: ");
        int n=s.nextInt();
        int arr[]=new int[n+1];
        System.out.print("Enter all the Elements: ");
        for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
        System.out.print("Enter the element you want to find: ");
        int search=s.nextInt();
      int count=0;
        for(int i=0;i<n;i++) {
        	if (arr[i]==search) {
        		count++;
        		System.out.printf("Element %d found at position: %d\n",search,i+1);
        	}
        }
        if(count==0)
        	System.out.print("Search element is not present");
        s.close();

	}

}

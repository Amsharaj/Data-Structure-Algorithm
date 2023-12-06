package Linear_data_structure;

import java.util.Scanner;

public class Remove_duplicate {
	//package Array_Programs;

	//import java.util.Scanner;

	//public class Array_Sort_Duplicate{  
	    public static int removeDuplicateElements(int arr[], int n){  
	        if (n==0 || n==1){  
	            return n;  
	        }    
	        int j = 0;//for next element  
	        for (int i=0; i < n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                arr[j++] = arr[i];  
	            }  
	        }  
	        arr[j++] = arr[n-1];  
	        return j;  
	    }  
	       
	    public static void main (String[] args) { 
	    	Scanner s = new Scanner (System.in);
	    	System.out.print("Enter the size array: ");
	        int n=s.nextInt();
	        int arr[]= new int[n];
	        System.out.println("Enter the array elements: ");        
	        for(int i=0;i<n;i++)                                             
	        	arr[i]=s.nextInt(); 
	        int length = arr.length;  
	        length = removeDuplicateElements(arr, length);  
	        //printing array elements  
	        System.out.println("Remove duplicate: ");
	        for (int i=0; i<length; i++) 
	        	
	           System.out.print(arr[i]+" ");  
	        s.close();
	    }  
	
	/*public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,count=0,flag=0;
		System.out.print("Enter the size of the array:");
		n=s.nextInt();
		int arr[]=new int[n];
		int temp[]=new int[n];
		System.out.println("Enter array elements in sorted order: ");
		 for(int i=0;i<n;i++) {
			 arr[i]=s.nextInt();}
System.out.println("After removing duplicates is: ");
for(int i=0;i<n;i++) {
	flag=0;
	if(i==0)
		temp[count++]=arr[i];
	else {
		for(int j=0;j<count;j++) 
		{
		if(arr[i]==temp[j]) {
			flag=1;
			break;
			}
	}
	if(flag==0)
		temp[count++]=arr[i];
	}
	
	}
	for(int i=0;i<count;i++)
		System.out.print(temp[i]+" ");
	s.close();
*/
	}



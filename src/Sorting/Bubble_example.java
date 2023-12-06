package Sorting;
public class Bubble_example {
	public void print(int arr[]) {
		int loop = 0;
		for(int i=0;i<arr.length;i++) {
			 boolean isprime=true;
	    for(int j=2;j<arr[i];j++) {
			 loop=loop+1;
		if(arr[i]%j==0) {
			 isprime=false;
			 break;
			}
			}
		if(isprime) {
			System.out.print(arr[i]+" ");
			}	 
		    }
		    System.out.print(loop);
	  }
  }
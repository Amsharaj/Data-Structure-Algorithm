package Tree;

import java.util.Arrays;

public class Segregate_0s_and_1s {
	 static void segregate(int[] arr) {
	        int left = 0;
	        int right = arr.length - 1;
	        
	        while (left < right) {
	            while (arr[left] == 0 && left < right) {
	                left++;
	            }
	            while (arr[right] == 1 && left < right) {
	                right--;
	            }
	            if (left < right) {
	                arr[left] = 0;
	                arr[right] = 1;
	                left++;
	                right--;
	            }
	        }
	    }


	public static void main(String[] args) {
		int arr[]= {0,1,0,1,0,1};
		 System.out.println("Original Array: " + Arrays.toString(arr));
	        
	        segregate(arr);
	        
	        System.out.println("Array after segregation: " + Arrays.toString(arr));


	}

}

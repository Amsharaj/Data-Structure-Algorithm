package Sorting;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, L,R;
		N = s.nextInt();
		s.useDelimiter("\\s+");
		L= s.nextInt();
		R=s.nextInt();
		if(N>=L&&N<=R) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
s.close();
	}

}

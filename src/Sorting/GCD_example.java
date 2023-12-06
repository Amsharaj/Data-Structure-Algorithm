package Sorting;

import java.util.Scanner;

public class GCD_example {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        s.useDelimiter("\\s+");
        int N=s.nextInt();
        int M=s.nextInt();
        int gcd =1;
		for(int i=1;i<=N&&i<=M;i++) {
			if(N%i==0&&M%i==0) {
				gcd=i;
			
		}
			else {
				gcd=-1;
			}}
		System.out.println("GCD of "+N+" and "+M+" is "+gcd);
		s.close();
	}

}

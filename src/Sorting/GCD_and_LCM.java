package Sorting;

public class GCD_and_LCM {

	public static void main(String[] args) {
		int n1=10,n2=5;
		int gcd = 1;
		for(int i=1;i<=n1&&i<=n2;i++) {
			if(n1%i==0&&n2%i==0)
				gcd=i;
		}
		System.out.println("GCD of "+n1+" and "+n2+" is "+gcd);
		int lcm=(n1*n2)/gcd;
		System.out.println("LCM of "+n1+" and "+n2+" is "+lcm);
	}

}

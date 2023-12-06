package Linear_data_structure;

import java.util.Scanner;

public class Right_angle_triangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int A,B,C;
		System.out.print("Input: ");
		s.useDelimiter("\\s");
		A=s.nextInt();
		B=s.nextInt();
		C=s.nextInt();
		if(C*C==(A*A+B*B))
			System.out.print("yes");
		else
			System.out.print("No");
		s.close();
	}

}

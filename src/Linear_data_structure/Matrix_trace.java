package Linear_data_structure;

import java.util.Scanner;

public class Matrix_trace {

	public static void main(String[] args) {
		int row,col, trace=0;;
		Scanner s=new Scanner(System.in);
	System.out.print("Enter the row: ");
	row=s.nextInt();
	System.out.print("Enter the col: ");
	col=s.nextInt();
	int a[][]=new int[row][col];
	int b[][]=new int[row][col];
	int result[][]=new int[row][col];
	System.out.println("Enter the A matrix values: ");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++)
			a[i][j]=s.nextInt();
	}
	System.out.println("Enter the B matrix values: ");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++)
			b[i][j]=s.nextInt();
	}
	System.out.println("Addition Matrix: ");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) { 
			result[i][j]=(a[i][j]+b[i][j]);
		System.out.print(result[i][j]+" ");
			
		if(i==j) {
			trace=trace+result[i][j];
			
		}
		
		}
	System.out.println();
	
	s.close();
	
	}
	System.out.print("Trace of the matrix: "+trace);
	}

}

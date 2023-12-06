package Linear_data_structure;

import java.util.Scanner;

public class Matrix_transpose {

	public static void main(String[] args) {
		int row,col;
		Scanner s=new Scanner(System.in);
	System.out.print("Enter the row: ");
	row=s.nextInt();
	System.out.print("Enter the col: ");
	col=s.nextInt();
	int a[][]=new int[row][col];
	System.out.println("Enter the matrix values: ");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++)
			a[i][j]=s.nextInt();
	}
    System.out.println("Transpose of the Matrix: ");
    for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++)
			System.out.print(a[j][i]+" ");
		System.out.println();
	}s.close();
	}
}

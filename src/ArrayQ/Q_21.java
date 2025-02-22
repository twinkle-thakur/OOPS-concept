package ArrayQ;

import java.util.Scanner;

public class Q_21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and column");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		for(int i=0;i<row;i++) {
		for	(int j=0;j<column;j++) {
			a[i][j]=sc.nextInt();
			
		}		
		}
		for(int i=0;i<row;i++) {
			for	(int j=0;j<column;j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
			}
				sc.close();
	}

}

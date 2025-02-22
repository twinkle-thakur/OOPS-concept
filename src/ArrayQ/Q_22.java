package ArrayQ;

import java.util.Scanner;

public class Q_22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and column");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		int sum=0;
		for(int i=0;i<row;i++) {
		for	(int j=0;j<column;j++) {
			a[i][j]=sc.nextInt();
			sum+=a[i][j];
		}		
		}
		for(int i=0;i<row;i++) {
			for	(int j=0;j<column;j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
			}
		System.out.println(sum);
		sc.close();
	}

}

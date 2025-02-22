/*transpose means row ko column mai badalna*/
package array2d;

import java.util.Scanner;

public class Transpose_of_matric {

	public static void main(String[] args) {
	int a[][]=new int[2][2];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter values in matrix");
	for(int i=0;i<2;i++) {
		for (int j=0;j<2;j++) {
		a[i][j]=sc.nextInt();
				}
		System.out.println();
		
	}
	System.out.println("matrix");
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(a[i][j]+" ");
		}System.out.println();
	}
	System.out.println(" transpose of matrix");
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(a[j][i]+" ");
		}System.out.println();
	}sc.close();
	}

}

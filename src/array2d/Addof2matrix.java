package array2d;

import java.util.Scanner;

public class Addof2matrix {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=sc.nextInt();
				b[i][j]=sc.nextInt();
				}
					}
	
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
					}
		sc.close();
	}

}

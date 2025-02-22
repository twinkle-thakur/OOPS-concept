package array2d;
import java.util.Scanner;
public class Array_2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row");
		int row=sc.nextInt();
		System.out.println("enter column");
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		System.out.println("enter array element :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}sc.close();
	}

}

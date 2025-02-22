package ArrayQ;

import java.util.Scanner;

public class Q_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array before deletion");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println("\n"+"enetr location from weher eleemnt is to be deleetd");
		int loc=sc.nextInt();
				for(int i=loc;i<a.length-1;i++) {
					a[i]=a[i+1];
				}
				System.out.println("array after deletion of ");
				for(int i=0;i<a.length-1;i++) {
					System.out.print(a[i]);
	
	}sc.close();
	}
}

package array;

import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int r=sc.nextInt();
		int arr[]=new int[r];
		System.out.println("enter values of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("entered array is");
		for(int i=0;i<r;i++) {
			System.out.println(arr[i]);	
		}
		System.out.println("reverse array is");
		for(int i=r-1;i>=0;i--) {
			System.out.println(arr[i]);	
		}sc.close();
	}

}

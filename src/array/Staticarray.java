package array;

import java.util.Scanner;

public class Staticarray {

	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("enter elements");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("printrd array");
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}sc.close();
	}

}

package array;

import java.util.Scanner;

public class Insertelement {

	public static void main(String[] args) {
	//a[3]={34,67,23}
	//location=1 item=100
	//a[3+1]=34,100,67,23
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int size=sc.nextInt();
	int a[]=new int[size+1];
	System.out.println("enter array elements");
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("enter location of item");
	int loc=sc.nextInt();
	System.out.println("enter item");
	int item=sc.nextInt();
	for(int i=size;i>loc;i--) {
		a[i]=a[i-1];
	}
	a[loc]=item;
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}sc.close();
	}

}

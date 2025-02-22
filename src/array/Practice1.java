package array;

import java.util.Scanner;

public class Practice1 {
public static void main(String[] args) {	
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int size=sc.nextInt();
int a[]=new int[size+1];

System.out.println("enter elements of array");
for(int i=0;i<size;i++) {
	a[i]=sc.nextInt();
	System.out.print(a[i]);
}
System.out.println("enter item to be inserted ");
int item=sc.nextInt();
System.out.println("enter position of element to be inserted ");
int pos=sc.nextInt();
for(int i=size;i>pos;i--) {
	a[i]=a[i-1];
}
a[pos]=item;
for(int i=0;i<a.length;i++) {
	
	System.out.print(a[i]);
}sc.close();
}	
}

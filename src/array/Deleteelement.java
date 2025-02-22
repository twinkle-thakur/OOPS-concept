package array;

import java.util.Scanner;

public class Deleteelement {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter size of array ");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter elements of array ");
for(int i=0;i<size;i++) {
	a[i]=sc.nextInt();
	System.out.print(a[i]);
}
System.out.println("\n"+"enter location of element to be deleted ");
int loc=sc.nextInt();
System.out.println("arry after deleteion ");
for(int i=loc;i<size-1;i++) {
	a[i]=a[i+1];
}
size--;
for(int i=0;i<size;i++) {
	System.out.print(a[i]);
}sc.close();
	}

}

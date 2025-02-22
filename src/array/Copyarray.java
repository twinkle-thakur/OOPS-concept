package array;
import java.util.Scanner;
public class Copyarray {

	public static void main(String[] args) {
//1st a[]=1,2,3---->2nd b[]=1,2,3
		/*int a[]= {1,2,3};
		int b[]= {3,5,6};
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			System.out.print(b[i]);}*/
		//or at run time
		
Scanner sc=new Scanner(System.in);
System.out.print("enter size of array");
int b=sc.nextInt();
int a[]=new int[b];
int a1[]=new int[b];
for(int i=0;i<b;i++) {
	a[i]=sc.nextInt();
}
for(int i=0;i<b;i++) {
	a1[i]=a[i];
	System.out.print(a1[i]);
}sc.close();
}

}

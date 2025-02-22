package array;

import java.util.Arrays;

public class Arraymethods2 {

	public static void main(String[] args) {
		/*sort()   equals()  copyOf()*/
		//1:Sort()-->Sorts array in acceding order
	int a[]= {1,4,2,1,3};
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	   //2:equals()-->checks if 2 arrays r =or not & returns T/F
	int a2[]= {1,2,3,7,2,1};
	boolean b=Arrays.equals(a,a2);
	System.out.print("kya arrays equal hai"+" "+b+"\n");
	 //3:copyOf()-->it takes 2 arguments:-1)array which have to be copied(a)
	               //2)size of array in which we have to copy present array
	//int a4[]= {1,5,7};
	int a3[]=Arrays.copyOf(a,3);
	for(int i=0;i<a3.length;i++) {
		System.out.print(a3[i]);

	}
		}

}

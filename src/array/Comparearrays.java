package array;

import java.util.Arrays;

public class Comparearrays {

	public static void main(String[] args) {
		//1.== (checks only if the reference variable is same or not)
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		if(a==b) {
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		//2.equals()-->checks only data reference se koi mtlb ni
		if(Arrays.equals(a,b)) {
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
	}

}

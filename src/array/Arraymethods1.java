package array;

import java.util.Arrays;

public class Arraymethods1 {

	public static void main(String[] args) {
		String s[]= {"khushi","twinkle"};
		int a[]= {1,2,3,4};
		System.out.println("toString() with int :"+Arrays.toString(a));
		System.out.println("toString() :"+Arrays.toString(s));
		System.out.println("asList() :"+Arrays.asList(s));
		System.out.println("aslist() in int "+Arrays.asList(a));
		int arr[][]= {{10,20},{30,50}};
		System.out.println("deepToString() :"+Arrays.deepToString(arr));
	}
}
//all 3 methods are array class ke static methods
//acceps array variable as a parameter
//no obj required to call these methods
/*in case of string to&as..meh.works good but in case of int aslist()
gives refrence*/
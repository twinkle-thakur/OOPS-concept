package KG_coding_Stream;

import java.util.stream.IntStream;

//2 was to calculate factorial
public class Challenge111 {
	//1 way :using structural/procedural programing
	public static int factorial(int n) {
		if(n<2) {
			return 1;
		}
		return n*factorial(n-1);
	}
public static void main(String[] args) {
	System.out.println(factorial(9));
	//2 way :using declarative/funtional programing
	IntStream.rangeClosed(2, 9).reduce((a,b)->a*b).ifPresent(System.out::print);
	
}
}

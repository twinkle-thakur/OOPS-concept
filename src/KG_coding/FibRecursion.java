package KG_coding;

import java.util.Scanner;

public class FibRecursion {
    public static int fibSeries(int position) {
    	if(position==1) {
    		return 0;
    	}
    	if(position==2) {
    		return 1;
    	}
    	return fibSeries(position-1)+fibSeries(position-2);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num upto which u want to print fib series");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println(fibSeries(i)+" ");
		}
	}

}

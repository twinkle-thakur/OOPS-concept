package KG_coding;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int num) {
    	for(int i=2;i<num;i++) {
    		if(num%i==0) {
    			return false;
    		}
    	}
    	return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter num to check");
        int num=sc.nextInt();
     /*   if(isPrime(num)) {
        	System.out.println(num +" is prime no.");
        }
        else {
        	System.out.println(num +" is not prime no.");
        }*/
        System.out.println("no. is "+ (isPrime(num)?"prime":"not prime"));
        sc.close();
	}

}

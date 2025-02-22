package KG_coding;

import java.util.Scanner;

public class GuessNoUsingRandomNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("guess the no. b/n 1-5");
	int random,num;
	do {
		System.out.println("guess the no");
		random=sc.nextInt();
		double a=Math.random()*5;
	    num=(int)Math.ceil(a);
	}while(num!=random);
	System.out.println("you have guessed the right no.");
}
}

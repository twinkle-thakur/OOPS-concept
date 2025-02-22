package KG_coding;

import java.util.Scanner;

public class DoWhileNoGame {
//number guessing game
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to number guessing game");
		int num;
		do {
			System.out.println("guess the no. b/n 1-10");
			num=sc.nextInt();
		}while(num!=5);
		System.out.println("you have successfully guessed the no.");
		sc.close();
	}
}	

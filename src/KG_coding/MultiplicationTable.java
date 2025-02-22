package KG_coding;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. whose table u want");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"X"+i+"="+i*num);
		}sc.close();
	}

}

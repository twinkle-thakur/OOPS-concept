package KG_coding;

import java.util.Scanner;

public class SimpleCalculater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no");
		int num1=sc.nextInt();
		System.out.println("enter 2nd no");
		int num2=sc.nextInt();
		System.out.println("enter operation");
		char s=sc.next().charAt(0);
		switch(s) {
		case '+':System.out.println(num1+num2);break;
		case '-':System.out.println(num1-num2);break;
		case '/':System.out.println(num1/num2);break;
		case '*':System.out.println(num1*num2);break;
		}
		sc.close();
	}

}

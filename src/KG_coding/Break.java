package KG_coding;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(;true;) {
			System.out.println("give input");
			String s=sc.next();
			if(s.equals("exit")) {
				break;
			}
			sc.close();
		}
		System.out.println("you have exited");
		
	}

}

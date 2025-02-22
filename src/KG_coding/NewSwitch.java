package KG_coding;

import java.util.Scanner;

public class NewSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		switch(num) {
		case 1:System.out.println("jan");
		       break;
		case 2:System.out.println("feb");
	       break;
		case 3:System.out.println("march");
	       break;
		case 4:System.out.println("april");
	       break;
		}sc.close();
	//this is new switch expression 
    //it is valid after java 14 only
	//it was introduced in java 14	
	/*	String s=switch(num) {
		case 1-> "jan";
		case 2-> "feb";
		case 3-> "march";
		default->"wrong";
		}*/
		
	}

}

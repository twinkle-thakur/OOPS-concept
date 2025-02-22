package KG_coding;

import java.util.Scanner;

public class DoWhileValidPass {
	public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			
			String pass;
			do {
				System.out.println("enter your pass");
				 pass=sc.next();
			//	System.out.println("plz enter valid pass");
			}while(!(pass.equals("khushi")));
			System.out.println(pass);
			sc.close();
		}
	}



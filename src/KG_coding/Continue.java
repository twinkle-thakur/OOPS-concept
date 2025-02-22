package KG_coding;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		int sum=0;
		for(int i=1;i<=5;i++) {
			System.out.print("enter no. "+i+" :");
			num=sc.nextInt();
			if(num<0) {
				continue;//skips rest of the code and updates i
			}
			else {
				sum+=num;
			}
		}
		System.out.println("sum of all positive no is:"+sum);
		sc.close();
	}

}

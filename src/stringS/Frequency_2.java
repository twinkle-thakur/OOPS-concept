package stringS;
import java.util.Scanner;
public class Frequency_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ch ");
		int ch=sc.next().charAt(0);
		String s="khushi";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		if(count>0) {
			System.out.println((char)ch+" is present "+count+" times");
		}
		else
			System.out.println("not found");
		sc.close();
	}

}

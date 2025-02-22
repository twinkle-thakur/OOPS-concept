package KG_coding;

import java.util.Scanner;

public class PalindromeRecursion {
    public static boolean isPalindrome(String s) {
    	if(s.length()==1) {
    		return true;
    	}
    	int lastPos=s.length()-1;
    	if(s.charAt(0)!=s.charAt(lastPos)) {
    		return false;
    	}
    	String newS=s.substring(1, lastPos);
    	//1 will include and lastpos will be excluded
    	//therfore no need to do lastpos-1
    	return isPalindrome(newS);
     }  
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string ");
		String s=sc.next();
		System.out.println("your string is "
		             +(isPalindrome(s)?"palindrome":"not palindrome"));
	}

}

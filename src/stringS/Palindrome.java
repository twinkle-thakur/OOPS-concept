package stringS;

public class Palindrome {
	
	public static boolean b(String str) {
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
			return false;
		}
	}
	
	return true;
	
	}
	public static void main(String[] args) {
		
		System.out.println(b("naman"));
	}
}

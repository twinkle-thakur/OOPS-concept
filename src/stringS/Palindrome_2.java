package stringS;

public class Palindrome_2 {

	public static void main(String[] args) { 
	String a="khushi";
	boolean b=true;
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)!=a.charAt(a.length()-1-i)) {
			b=false;
		}
	}
	System.out.println(b);
	}

}

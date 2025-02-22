package stringS;

public class Swapstring {

	public static void main(String[] args) {
		String s="my name is khushi";
		String s2="my name is twinkle";
		System.out.println("befor swap of s");
		System.out.println(s);
		s=s.replaceAll(s,s2 );
		System.out.println("after swap of s");
		System.out.println(s);
		System.out.println("befor swap of s2");
		System.out.println(s2);
		s2=s2.replaceAll(s2,s );
		System.out.println("after swap of s2");
		System.out.println(s2);
	}

}


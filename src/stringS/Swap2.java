package stringS;

public class Swap2 {

	public static void main(String[] args) {
		String s="khushi";
		String s2="thakur";
		s=s.concat(s2);
		s2=s.substring(0,s.length()-s2.length());
		s=s.substring(s2.length());
		System.out.println(s);
		System.out.println(s2);
		
	}

}

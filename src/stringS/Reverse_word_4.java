package stringS;

public class Reverse_word_4 {

	public static void main(String[] args) {
		String s=new String("my name is khushi");
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		System.out.println(s1);
	}

}

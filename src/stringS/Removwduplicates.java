package stringS;

public class Removwduplicates {

	public static void main(String[] args) {
		String s="aabbcd";
		String newstr="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(newstr.indexOf(ch)==-1) {
				newstr+=ch;
				
			}
}
		System.out.print(newstr);
	}

}

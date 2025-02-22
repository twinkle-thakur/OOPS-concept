package stringS;

public class Equalsmethod {
//== checks content in some case and in some refrence variable
//equals() only checks content	
	public static void main(String[] args) {
	//case 1:when both string are refering to one obj..
		//it checks content only
	String a="khushi";
	String b="khushi";
	if(a==b) {
		System.out.println("true");
	}
	else 
		System.out.println("false");
	//case 2:when content is diff..
	String c="khushi";
	String d="KHushi";
	if(c==d) {
		System.out.println("true");
	}
	else 
		System.out.println("false");
	//case 3:when both are writen in diff () it sees reference 
	String e="khushi";
	String f=new String("khushi");
	if(e==f) {
		System.out.println("true");
	}
	else 
		System.out.println("false");
	//case 4=case 3 prg with equals () which only sees obj
	String g="khushi";
	String h=new String("khushi");
	if(g.equals(h)) {
		System.out.println("true");
	}
	else 
		System.out.println("false");
	}

}

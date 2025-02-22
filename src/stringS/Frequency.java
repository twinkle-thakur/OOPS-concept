package stringS;

public class Frequency {
	public int charcount(String s,char c) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
	Frequency f=new Frequency();
	int ans=f.charcount("khushi", 'h');
	if(ans==0) {
		System.out.println("not found");
	}
	else
		System.out.println(ans);
		
	}

}

package stringS;

public class noofchinstring {
public static void name(String s,int count) {
	if(count>=5) {
		return;
	}
	System.out.println(s);
	count++;
	name(s,count);
}
	public static void main(String[] args) {
		name("khushi",0);
	}

}

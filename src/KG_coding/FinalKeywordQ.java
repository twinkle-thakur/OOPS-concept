package KG_coding;

public class FinalKeywordQ {
    final String name;
   final int rollNo;
    
	public FinalKeywordQ(String name, int rollNo) {
		
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		FinalKeywordQ f=new FinalKeywordQ("khushi",21);
		System.out.println(f.name+" "+f.rollNo);
	}

}

package KG_coding;

public class TernaryNested {

	public static void main(String[] args) {
		int marks =67;
		String category=marks>=80?"high scores":(marks>=50?"moderate":"low");
		System.out.println("your catagery is "+category);
	}

}

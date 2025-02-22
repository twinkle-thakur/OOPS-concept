package KG_coding;

public class StringBuilQ {

	public static void main(String[] args) {
		String[] arr= {"khushi","and","chinu"};
		StringBuilder sb=new StringBuilder();
		for(String i:arr) {
			sb.append(i).append(" ");
		}
		System.out.println(sb);
	}

}

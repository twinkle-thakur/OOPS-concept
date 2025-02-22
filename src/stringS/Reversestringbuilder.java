package stringS;

public class Reversestringbuilder {

	public static void main(String[] args) {
		String s="my name is khushi ";
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			StringBuilder s1=new StringBuilder(arr[i]);
			System.out.print(s1.reverse()+" ");
		}
	}

}

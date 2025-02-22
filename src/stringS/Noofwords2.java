package stringS;

public class Noofwords2 {
	
/*	public static void main(String[] args) {
		String s="my name is khuhsi ";
		String arr[]=s.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		System.out.println(count);
	}*/
	//with the help of mehtods
	
	public static int countword(String s) {
		String arr[]=s.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("no. of words in given string : ");
		System.out.println(countword("my name is khushi"));
		System.out.println(countword("my name is khushi thakur"));
		System.out.println(countword("my name is khushi thakur :"));
	}
}


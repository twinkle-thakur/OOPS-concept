package stringS;
public class Reverseword {/*
	public static void main(String[] args) {
		String s="this is khushi";
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
			
			System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
	}*/
	//with methods
	public static void reverse(String s) {
	String arr[]=s.split(" ");
	for(int i=0;i<arr.length;i++) {
		for(int j=arr[i].length()-1;j>=0;j--) {
			System.out.print(arr[i].charAt(j));
		}
		System.out.print(" ");
	}
	}
	public static void main(String[] args) {
		reverse("my name is khushi");
	}
}

package stringS;
public class Reverse2 {/*
public static void main(String[] args) {
		String s="my name is khuhsi";
		String arr[]=s.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}*/
//with methods
	public static void reverse(String s) {
		String arr[]=s.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		reverse("my name is khushi");
	}
}

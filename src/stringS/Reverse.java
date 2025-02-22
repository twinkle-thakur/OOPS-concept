package stringS;

public class Reverse {
	public static void reverse() {
		String s="my name is khushi";
		String arr[]=s.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		reverse();
	}

}

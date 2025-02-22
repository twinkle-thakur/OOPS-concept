package stringS;

public class Noofletter {
/*	public static void main(String[] args) {
	String s="my name is khushi";
	String arr[]=s.split(" ");
	int count=0;
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i].length());
		count+=arr[i].length();	}
	System.out.println(" total no. of letters in string :"+count);
	}*/
//with methods
	public static int countletter(String s) {
	String arr[]=s.split(" ");
	int count =0;
	for(int i=0;i<arr.length;i++) {
		int ans=arr[i].length();
		 count+=ans;
		
	}
	return count;
	}
	public static void main(String[] args) {
		int a=countletter("my name is khushi");
		 System.out.println(a);
	}
}

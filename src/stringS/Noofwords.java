package stringS;

public class Noofwords {
	public static int countword() {
	String s1="my name khushi";
	String arr[]=s1.split(" ");
	int count=0;
	for(int i=0;i<arr.length;i++) {
		count++;
		System.out.println(arr[i].length());
	}
	return count;
	}

	public static void main(String[] args) {
		int ans =countword();
		System.out.println(ans);
		
	}

}

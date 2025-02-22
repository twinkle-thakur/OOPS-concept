package KG_coding;

public class Search {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 1, 8 };
		int num = 5;
		int count = 0;
		for (int arr : a) {
			if (num == arr) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("number found "+count +" times");
		}
		else {
			System.out.println("not found");
		}
	}

}

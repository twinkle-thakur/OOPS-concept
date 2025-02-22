package KG_coding;

public class Maximum {

	public static void main(String[] args) {
		int[] a= {3,5,1,2,7,5};
		int max=a[0];
		for(int arr:a) {
			if(arr>max) {
				max=arr;
			}
		}
		System.out.println("max  element is "+max);
	}

}

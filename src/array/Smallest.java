package array;

public class Smallest {

	public static void main(String[] args) {
		int arr[]= {3,6,2,1,8,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			
		}
		System.out.println("smallest element");
		System.out.println(arr[0]);
		System.out.println("largest element");
		System.out.println(arr[arr.length-1]);
	
	}
}

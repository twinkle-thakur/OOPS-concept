package array;

public class Evenandodd {

	public static void main(String[] args) {
		int arr[]= {1,2,7,9,8,3};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]%2!=0&&arr[j]%2==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		System.out.print(arr[i]);
	}
	}
}

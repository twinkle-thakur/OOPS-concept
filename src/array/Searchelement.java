package array;
import java.util.Scanner;
public class Searchelement {

	public static void main(String[] args) {
		//a[]=1,2,3
		//search 1--->found,5--->not found
		int arr[]= {1,2,3,4,9};
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element to be found :");
		int a=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				 count++;
			}
		}
		if(count>0) {
			System.out.println("element found "+count+" times");
		}
		else {
			System.out.println("element not found");
		}sc.close();
	}

}

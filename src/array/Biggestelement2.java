package array;

public class Biggestelement2 {

	public static void main(String[] args) {
	int a[]= {1,5,2,7,3,9};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
			int	temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
		System.out.print(a[i]);
	}
	System.out.println("\n"+"biggest element :"+a[a.length-1]);
	System.out.print("smallest element "+a[0]);
	}

}

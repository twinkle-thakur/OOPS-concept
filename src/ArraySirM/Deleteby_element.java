package ArraySirM;

public class Deleteby_element {
	public static int delete(int data) {
		int[] a= {10,20,30,40,50,60,70};
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==data) {
				index=i;
				break;
			}
		}
		if(index>=0) {
			for(int i=index;i<a.length-1;i++) {
				a[i]=a[i+1];
			}
			for(int i=0;i<a.length-1;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.print("\nindex is:");
			return index;
		}
		else
			return -1;
		}
	public static void main(String[] args) {
		System.out.println(delete(40));
		
	}

}

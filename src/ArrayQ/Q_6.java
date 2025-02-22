package ArrayQ;

public class Q_6 {

	public static void main(String[] args) {
		int a[]= {34,56,2,5,86,21,0,8,1};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("min value is "+min);
	}

}

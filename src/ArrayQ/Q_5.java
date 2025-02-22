package ArrayQ;

public class Q_5 {

	public static void main(String[] args) {
		int a[]= {3,46,41,25,47,534,21,47,78};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("max value is "+max);
	}

}

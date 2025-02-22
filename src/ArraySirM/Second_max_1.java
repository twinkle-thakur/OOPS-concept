package ArraySirM;

public class Second_max_1 {

	public static void main(String[] args) {
		int[]a= {50,90,10,15,85,60};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		int secondmax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(max>a[i]&&a[i]>secondmax) {
				secondmax=a[i];
			}
		}
		System.out.println("2 max element is :"+secondmax);
	}

}

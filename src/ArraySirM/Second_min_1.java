package ArraySirM;

public class Second_min_1 {

	public static void main(String[] args) {
		int[]a= {50,90,10,15,85,60};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		int secondmin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>min&&a[i]<secondmin) {
				secondmin=a[i];
			}
		}
		System.out.println("2 min element is :"+secondmin);
	}

	}



package ArraySirM;

public class Second_min_2 {

	public static void main(String[] args) {
		int[]a= {50,90,10,15,85,60};
		int min=Integer.MAX_VALUE;
		int secondmin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				secondmin=min;
				min=a[i];
			}
			else if(a[i]>min&&a[i]<secondmin) {
				secondmin=a[i];
			}
		}System.out.println(secondmin);
	}

}

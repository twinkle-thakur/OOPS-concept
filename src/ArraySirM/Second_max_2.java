package ArraySirM;

public class Second_max_2 {
public static void main(String[] args) {
	int max=Integer.MIN_VALUE;
	int secondmax=Integer.MIN_VALUE;
	int[] a= {89,90,10,15,85,60};
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			secondmax=max;
			max=a[i];
			
		}
		else if(a[i]<max&&a[i]>secondmax) {
			secondmax=a[i];
		}
	}
	System.out.println(secondmax);
}
}

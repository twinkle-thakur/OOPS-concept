package ArraySirM;

public class Max_element {

	public static void main(String[] args) {
		int[]a= {50,90,10,15,85,60};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}

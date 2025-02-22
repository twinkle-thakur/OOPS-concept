package ArrayQ;

public class Q_9 {

	public static void main(String[] args) {
		int a[]= {1,6,36,52,37,652,5,234,2};
		int n=5;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(n==a[i]) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("element found "+count+" times");
		}
		else
			System.out.println("not found");
	}

}

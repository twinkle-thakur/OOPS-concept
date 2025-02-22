package ArraySirM;

public class Issorted {
	 public static boolean isIncresing(int[] a) {
		   
		   for(int i=1;i<a.length;i++) {
			   if(a[i-1]>a[i]) {
				  return false;
			   }
		   }
		  return true;
	 }
	 public static boolean isDecresing(int[] a) {
		   
		   for(int i=1;i<a.length;i++) {
			   if(a[i-1]<a[i]) {
				  return false;
			   }
		   }
		  return true;
	 }
	public static void main(String[] args) {
		int[] a= {3,2,1};
		if(isDecresing( a)|| isIncresing( a)) {
			System.out.println("array is sorted");
		}
		else 
		System.out.println("not sorted");
	}

}

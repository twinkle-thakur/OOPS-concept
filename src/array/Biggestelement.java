package array;

public class Biggestelement {

	public static void main(String[] args) {
	int a[]= {1,2,4,73,3,6,9};
	//int max=a[0]; 
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		//if(a[i]>max)
		//max=a[i]
			if(a[i]<min) {
		min=a[i];	
		}
	}
	//System.out.println("maximum value is "+max);
	System.out.println("minimum value is "+min);
	
	}

}

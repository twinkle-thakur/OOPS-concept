package ArraySirM;

public class Min_element {

	public static void main(String[] args) {
		int[]a= {50,90,10,15,85,60};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++) {
        	if(a[i]<min) {
        		min=a[i];
        	}
        }System.out.println(min);
	}

}

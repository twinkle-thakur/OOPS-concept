package ArraySirM;

public class Datatype {

	public static void main(String[] args) {
		int[] a=new int[4];
//byte,short,char are smaller than int therefore it will take it
//but float is bigger than int therefore it will produce error		
		byte b=2;
		short s=12;
		char c='A';//it will take ASCII value of char A
		float f=2.3f;
		System.out.println(a[0]=1);
		System.out.println(a[1]=b);
		System.out.println(a[2]=s);
		System.out.println(a[3]=c);
		//a[4]=f;
		
	}

}

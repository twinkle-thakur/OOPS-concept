package ArraySirM;

public class Typesaftey extends Object {
//object is a super class in java by inheriting we can access all features
	public static void main(String[] args) {
		int[] a=new int[2];
		int[] b=new int[5];
a=b;/* and */b=a;//both are valid becoz type(1-d&&int) is same no matter size
		int[][] c=new int[5][2];
//	c=a; or c=b; or a=c; or b=c;-->will produce error
//becoz type is diff. as c=2D & a,b=1D array,cast is same but dimension different
	/*but*/	c[0]=a;/*and*/a=c[0];/*same for b will not producde error*/
//becoz c[0],a,b are of 1D array therefore same type(int & 1D)
	//special case for object class
	//this is possible
	Object o=a;
	Object o1=b;
	Object o2=c;
	//but
	//a,b,c=Object o1; it is not
	//now we will create an object array
	//only array of array will be converted to object i.e, 2-D array,3-D &so on
	Object[] d=new Object[7];//1-D object
	char[][] e=new char[3][];d=e;
	//d=a; becoz it is not array of array i.e,1-D
	d=c;//but a=d& c=d will give error 
	Object d1[][]=new Object[7][6];//1-D object
	d=d1;//becoz d1 is array of array
	//d1=d; error becoz d is not array of array therefore dimension is diff 
	//and cant be converted to 2D
	}

}

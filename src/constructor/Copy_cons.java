package constructor;
class E{
	int a;String s;
	E(){
		 a=7; s="khushi";	
		System.out.println(a+" "+s);
	}
	E(E ref){
		int d=ref.a;
		String g=ref.s;
		System.out.println(d+" "+g);
	}
}
public class Copy_cons {

	public static void main(String[] args) {
		E e=new E();
		E e2=new E(e);
	}

}

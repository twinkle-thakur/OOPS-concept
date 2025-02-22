package constructor;
class B{
	B(int a,String s){
		System.out.println(a+s);
	}
}
public class Parameterized {

	public static void main(String[] args) {
		B a=new B(3,"khushi");
	}

}

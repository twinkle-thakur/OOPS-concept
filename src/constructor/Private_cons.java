package constructor;
class A{
	private A() {
		int a=2;
		System.out.println(a);
	}
}
public class Private_cons {

	public static void main(String[] args) {
		A a=new A();
		
	}

}

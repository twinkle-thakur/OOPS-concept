package encapsulation;
class A{
	private int a;
	public void set(int x) {
		a=x;
	}
	public void get() {
		System.out.println(a);
	}
}
public class P_1 {

	public static void main(String[] args) {
		A a=new A();
		a.set(10);
		a.get();
	}

}

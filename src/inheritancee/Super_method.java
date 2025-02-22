package inheritancee;
class K{
	void show() {
		System.out.println("super class");
	}
}
class L extends K{
	void show() {
		super.show();
		System.out.println("sub class");
	}
}
public class Super_method {

	public static void main(String[] args) {
		L l=new L();
		l.show();

	}

}

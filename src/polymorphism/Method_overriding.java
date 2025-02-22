package polymorphism;
class C{
	void show() {
		System.out.println("khushi");
	}
}
class D extends C{
	
	void show() {
		
		System.out.println("twinkle");
		
	}
}
public class Method_overriding {

	public static void main(String[] args) {
		D d=new D();
		d.show();
	}

}

package polymorphism;
class A{
	void add() {
		int a=5,b=3,c;
		c=a+b;
		System.out.println(c);
	}
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	void add(int a,int b,int c) {
		int d=c+a+b;
		System.out.println(d);
	}
}
public class Method_overloading {

	public static void main(String[] args) {
		A a=new A();
		a.add();
		a.add(12,2);
		a.add(1,2,3);
	}

}

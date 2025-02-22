package inheritancee;
class C{
	int a,b,c;
	void add() {
		a=10;b=2;
		c=a+b;
		System.out.println("addition is "+c);
	}
}
class D extends C{
	void sub() {
		c=a-b;
		System.out.println("sub is c "+c);
	}
}
class E extends D{
	void mul() {
		c=a*b;
		System.out.println("multiplication is "+c);
	}
}
public class Multilevel {

	public static void main(String[] args) {
		E e=new E();
		e.add();
		e.sub();
		e.mul();
	}

}

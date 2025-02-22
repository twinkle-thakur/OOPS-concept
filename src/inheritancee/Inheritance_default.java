package inheritancee;
interface K1{
	void add();
	default void sub() {
		System.out.println("may or  may not be overriden");
	}
}
class L1 implements K1{
	public void add() {
		int a=10,b=2,c;
		c=a+b;
		System.out.println(c);
			}
	public void sub() {
		System.out.println("over ridden");
	}
	}
class M1 implements K1{
	public void add() {
		int a=1,b=4,c;
		c=a+b;
		System.out.println(c);
	}
}
public class Inheritance_default {
	public static void main(String[] args) {
		L1 l=new L1();
		l.add();l.sub();
		M1 m=new M1();
		m.add();m.sub();
	}

}

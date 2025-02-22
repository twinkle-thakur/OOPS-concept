package inheritancee;
class A{
	int a,b;String s;
	void enter() {
	System.out.println("enter name , marks and roll");
	}
}
class B extends A{
	void disp() {
		s="khushi";
		a=40;
		b=214;
		System.out.println(s+" "+a+" "+b);
	}
}
public class Single {
public static void main(String[] args) {
	B b=new B();
	b.enter();
	b.disp();
}
}

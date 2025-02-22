package inheritancee;
class J{
	int a=10;
}
class I extends J{
	int a=7;
	void show() {
		System.out.println("super class :"+super.a);
		System.out.println("sub class :"+a);
	}
}
public class Super_variable {
public static void main(String[] args) {
	I i=new I();
	i.show();
}
}

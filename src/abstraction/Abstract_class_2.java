package abstraction;
abstract class animall{
	void eat() {
		System.out.println("enter what your animal eats");
	}
}
class dogg extends animall{
	void eat() {
		super.eat();
		System.out.println("dog eats roti");
	}
}
class catt extends animall{
	void eat() {
		super.eat();
		System.out.println("cat eats milk");
	}
}
public class Abstract_class_2 {

	public static void main(String[] args) {
		dogg d=new dogg();
		d.eat();
		catt c=new catt();
		c.eat();
	}

}

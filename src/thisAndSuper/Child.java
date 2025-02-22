package thisAndSuper;
/*
 * this and super keyword:you can use only inside instance method and block else you will get compilation error
 * 
 * */
public class Child extends Parent{
	public int age=20;
	
	private int money;
	private String name;
	public Child(int money, String name) {
		super(50000,"papa");
		this.money = money;
		this.name = name;
	}
	public void m1() {
		System.out.println("child");
	}
	{
		int age=10;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);//nearest parent
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		System.out.println("---------");
		return "Child [money=" + money + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Child child =new Child(10000,"kartik");
		System.out.println(child);
	}
}

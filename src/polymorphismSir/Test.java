package polymorphismSir;

public class Test {

	public static void main(String[] args) {
//technical meaning of polymorphism
//"Aparent class ref can hold its child class obj"
		Animal a=new Dog();
		Animal a1=new Cow();
		Animal a2=new Rat();
		a.eat();
		a1.eat();
	}

}

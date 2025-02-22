package abstraction;
abstract class Animal{
	 abstract void sound() ;
}
class Dog extends Animal{
	public void sound() {
		System.out.println("dog barks");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("cat mews ");
	}
}
public class Abstract_class_1 {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		Cat c=new Cat();
		c.sound();
	}

}

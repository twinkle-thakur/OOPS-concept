package polymorphism;
// this() represents Constructor & it is helpful to call another Constructor like below
//if you call a method itself it will throw exception at run time
//but if you call a constructor than compiler will give error at compile time
public class ConstructorOverloading {
	public ConstructorOverloading(){
//	this()	will give compile time error
		this(10);
		System.out.println("no agrument");
	}
	public ConstructorOverloading(int a){
		this(10,20);
	System.out.println("one agrument");
	}
public ConstructorOverloading(int a,int b){
//	this(10,20);
	System.out.println("two agrument");
	}
public static void main(String[] args) {
	ConstructorOverloading c=new ConstructorOverloading();
}
}

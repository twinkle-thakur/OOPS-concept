package polymorphism;
class D1{
	D1(){
		System.out.println("khsuhi");
	}
	D1(int a){
		System.out.println(a);
	}
	D1(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
}
public class Constructor_overloading {

	public static void main(String[] args) {
		D1 d=new D1();
		D1 d1=new D1(2);
		D1 d2=new D1(14,2);
		
	}

}

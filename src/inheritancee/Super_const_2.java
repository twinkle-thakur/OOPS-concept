package inheritancee;
class O{
	O(int a){
		System.out.println("super "+a);
	}
}
class P extends O{
	P(){
		super(10);
		System.out.println("sub");
	}
}
public class Super_const_2 {

	public static void main(String[] args) {
		P p=new P();
	}

}

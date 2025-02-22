package inheritancee;
class M{
	M(){
		System.out.println("super");
	}
}
class N extends M{
	N(){
		System.out.println("sub");
	}
}
public class Super_constructor_1 {
public static void main(String[] args) {
	N n=new N();
}
}

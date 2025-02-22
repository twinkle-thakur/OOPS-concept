package constructor;

public class Copy_2 {
	int x;String y;
	Copy_2(int a,String s){
		x=a;y=s;
		System.out.println(x+" "+y);
	}
	Copy_2(Copy_2 ref){
		x=ref.x;
		y=ref.y;
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		Copy_2 c=new Copy_2(10,"khushi");
		Copy_2 c2=new Copy_2(c);
	}

}

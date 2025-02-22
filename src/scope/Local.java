package scope;

public class Local {
int a=20;
static int b=30;

public void setData(int a) {
//	int a=20;same argument  and variable name and both are local variable
	final int b=20;//compile time constant
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(b);
}
	public static void main(String[] args) {
		Local l=new Local();
		l.setData(40);
	//	System.out.println(this.a);error becoz of static
		System.out.println(b);
	}

}

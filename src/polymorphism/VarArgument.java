package polymorphism;

public class VarArgument {
public static void m1(int...a/*internallyarray define krna*/ ) {
	int sum=0;
for(int i:a) {
	sum+=i;
}
System.out.println(sum);
}
/*public void m1(double...d,String s,float f,int...a) {
1)	
}*/
public static void main(String[] args) {
	{
		m1(10,20,30,40,50,60,70);
	}
}
}

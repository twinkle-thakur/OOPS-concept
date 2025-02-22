package polymorphism;

public class ValuePasing {
int age=5;
public void setAge(int a) {
	a=a+10;
	System.out.println(a);
}
public static void main(String[] args) {
	ValuePasing v=new ValuePasing();
	System.out.println(v.age);
	v.setAge(10);
	System.out.println(v.age);
}
}

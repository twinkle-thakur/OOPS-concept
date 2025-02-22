package polymorphism;
/*
 * method signature=method name+argument
 * method over loading
 * 1)method name must be same
 * 2)argument must be different:-
 *   *argument might be different based on type
 *   *argument might be different based on no. of arguments
 *   *argument might be different based on argument order 
 * 3)don't bother on return type    
 */
public class MethodOverloadingSir {
public void m1() {
	m1(10);
//	m1(); it will throw error(stack over flow exception) at run time
	System.out.println("no agrument method");
}
public void m1(int a) {
	m1(20L);
	System.out.println("ono agrument method");
}	
public void m1(long a) {
	m1(10L,20);
	System.out.println("ono agrument long type");
}
public void m1(long a,int b) {
	System.out.println("two agrument");
}
public void m1(int a,long b) {}
}

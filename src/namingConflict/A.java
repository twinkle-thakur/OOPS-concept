package namingConflict;
/*
 * 1.Method signature & return type same(no confusion) means you can implement only 1 method
1* 2.Method signature same & return type different(confusion hi confusion) 
 * 3.Method signature different(method name same & argument list is different) and return type same
 *(implement both methods)
 *note=if method signature same and different return type 100% confusion esle baki sb implement ho jaiga
 */
public class A implements X,Y{

	@Override
	public int m1(int a) {
		return 10;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public int m1() {
//		System.out.println("hello");
//	}
//	@Override
//	public void m1() {
//		System.out.println("hello");
//	}
	
}


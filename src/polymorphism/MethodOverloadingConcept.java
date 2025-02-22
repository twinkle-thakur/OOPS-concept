package polymorphism;
/**
 *calling order in method overloading
 *1)exact matching
 *if exact match not found then compiler will search next immediate primitive matching 
 *it increases the scope
 *2)byte,short,int,long,float,double
 *if start from char,int,long,float,double
 *3)if no primitive matching then
 * exact matching wrapper only
 *4)matching var argument 
 *if all above not matched then
 *5)compilation error
 * */
public class MethodOverloadingConcept {
	
		public static void m1(byte b) {
			System.out.println("byte");
		}
		public static void m1(short b) {
			System.out.println("short");
		}
		public static void m1(char b) {
			System.out.println("char");
		}
		public static void m1(int a) {
			System.out.println("int");
		}	
		public static void m1(long a) {
			System.out.println("long");
		}
		public static void m1(Integer a) {
			System.out.println("Integer");
		}
		public static void m1(Long a) {
			System.out.println("Long");
		}
		public static void m1(int...a) {
			System.out.println("Var arg");
		}
		public static void m1(long a,int b) {
			System.out.println("long,int");
		}
		public static void m1(int a,long b) {
			System.out.println("int,long");
		}
		public static void main(String[] args) {
			//compiler
			m1(10);//by default int consider krega
			byte b=20;
			m1(b);
		}
}

package KG_coding;
//% [flags] [width] [.precision] specifier-character(%s,%b,%d....)
//we use printf so that we can add strings without concatination(+)
public class StringFormating {

	public static void main(String[] args) {
		String name="khushi";
		int marks=45;
//we are concatinating 1st hello with name then "your mar.." then it is again a String
//and with this new String again we will concat marks which is again a
//new String as we will concate more obj more Strings will bw ceated 
//all these will be created in hcp and more memory will be utilized
//therefor we use printf 		
		System.out.println("hello "+name+" your marks are "+marks);
//%s for String and %d for integer &%b for bool &%f for float and double and many more
		//jis order mai argument ussi mai give values
		System.out.printf("hello %s your marks are %d \n",name,marks);
		//when we want to formate our String 
	//1)when we want spaces rigth align
		System.out.printf("%15s",name);
	//2)spaces left align include -
		System.out.printf("%-15s",name);
	//3)if s is written as S then it will capatalize whole string
		System.out.printf("%S",name);
	//4)spaces ki jagha 0
		int a=500000;
		System.out.printf("\n%010d",a);
	//5), laga dega after 3 3 no.
		
		System.out.printf("\n%,d",a);
	}

}

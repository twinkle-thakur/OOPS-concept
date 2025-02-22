package KG_coding;

public class BreakAndContinue {
/* break lets u stop a loop or break out of loop
 * continue is used to skip one iteration or the current iteration*/
	public static void main(String[] args) {
		System.out.println("int the loop");
		for(int i=1;i<=10;i++) {
			if(i==50) {
			break;//break jaha hoga vai se end or closing bracket ke badh ka execute krega
			}  //loops mai and switch case mai break use hota hai and return funtions mai
			System.out.println(i);
		}
		System.out.println("out of the loop");
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;//as soon as it will see 5 it will skip all code below and will go to the loop again and update i and will execute the rest code
			}//5 will not be printed as it will to loop again without executing below code
			System.out.println(i);
		}
	}

}

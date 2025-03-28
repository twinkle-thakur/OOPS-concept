package KG_coding_Stream;

public class Challenge110Test {
public static void main(String[] args) {
	Challenge110 c=a->{
		int num=(int) Math.sqrt(a);
		if(num<0)
		return false;
		for(int i=2;i<=num;i++) {
			if(a%i==0)
				return false;
		}
		return true;
	};
	System.out.println(c.isPrime(23));
}

}

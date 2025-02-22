package inheritanceSirM;

public class Child {

	private static int totalMoney;

	public static void main(String[] args) {
		Son s=new Son();
		
		
		totalMoney = s.getTotalMoney();
		System.out.println(totalMoney);
	}

}

package Interface;

public abstract class Payment {
public void UPIpayment() {
	System.out.println("UPI payment");
}
public abstract void creditCardPayment();
}
abstract class Bank extends Payment{

//	@Override
//	if we dont want to implement it then make class abstract
//	public void creditCardPayment() {
//		
//	}
//	public static void main(String[] args) {
//	//	Bank b=new Bank(); we cant create abstract class  object
//	//bcoz abstract means kalpana jo clear hai hi ni uska kaise obj banaye
//	
//	}
}
class SBI extends Bank{

	@Override
	public void creditCardPayment() {
		System.out.println("sbi credit card");
	}
	public static void main(String[] args) {
		SBI sbi=new SBI();
		sbi.UPIpayment();
	}
}
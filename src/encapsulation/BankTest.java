package encapsulation;

public class BankTest {
public static void main(String[] args) {
	Bank bank=new Bank();
	bank.setAccountNo(1234);

bank.deposite(100000);
bank.deposite(5000000);
bank.withdraw(2000);

}

}

package encapsulation;

public class Bank {
private int accountNo;
private long balance;
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public long getBalance() {
	return balance;
}
public void deposite(int money) {
	if(money>0) {
		balance+=money;
		System.out.println(money+"rs deposited to your account");
	}
	else
		System.out.println("invalid deposit");
}
public void withdraw(int money) {
	if(money>0&&money<=balance) {
		balance-=money;
		System.out.println(money+"rs is debited from your account");
	}
	else
		System.out.println("can,t withdraw");
}
}

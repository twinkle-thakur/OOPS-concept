package kg_q;

public class BankAcoount {
private String accountNumber;
private String accountHolderName;
private int balance;
public BankAcoount(String accountNumber, String accountHolderName) {
	
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	
}
public void setMoney(int money) {
	balance+=money;
	System.out.printf("you have succesfully deposited,%d,and your current balance is %d",money,balance);
}
public void getMoney(int amount) {
	if(amount<0||amount>balance) {
		System.out.println("enter valid amount");
	}
	else if(balance==amount) {
		balance=0;
	}
	else {
		balance-=amount;
		System.out.printf("you have withdrawed %d amount and your current balance is %d",amount,balance);
	}
	
}
public static void main(String[] args) {
	BankAcoount b=new BankAcoount("khu123","khushi");
	b.setMoney(100);
	b.getMoney(200);
	System.out.println(b.accountNumber);
	System.out.println(b.accountHolderName);
}
}

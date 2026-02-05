package Bank;

public class Account {
	int ACC_No;
	String Acc_Name;
	double balance;
	String IFSC;

	Account() {

	}

	Account(int ACC_No, String Acc_Name, double balance, String IFSC) {
		this.ACC_No = ACC_No;
		this.Acc_Name = Acc_Name;
		this.balance = balance;
		this.IFSC = IFSC;
	}

	public void showAccount() {
		System.out.println("Account No: " + ACC_No);
		System.out.println("Account Name: " + Acc_Name);
		System.out.println("Balance: " + balance);
		System.out.println("IFSC: " + IFSC);
	}

	public void deposit(double amt) {
		if (amt > 0) {
			balance = balance + amt;
			System.out.println("Amt of RS" + amt + "deposit to your saving account");
			System.out.println("current balance" + amt + balance);
		} else {
			System.out.println("invalid balance");
		}
	}

	public void Withdraw(double amt) {
		if (balance > amt) {
			balance = balance - amt;
			System.out.println("Amt of RS" + amt + "created to your saving account");
			System.out.println("current balance " + amt + balance);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public void checkbalance() {
		System.out.println("Total Balace is " + balance);
	}
}

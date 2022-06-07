package ex14;

public class Account {
	String accountNumber;
	int balance;
	
	public String toString() {
		return "￥￥" + this.balance + "(口座番号: " + this.accountNumber + " )";
	}
	
	public boolean equals(Account a) {
		String a1 = this.accountNumber.trim();
		if (this.accountNumber.trim().equals(a.accountNumber.))
	}
}


public class Account {

	public double balance = 100.00;

	public static void dicountLoan(double x) {
		x = x * 0.95;
	}

	public static void debitFee(Account acct) {
		acct.balance = acct.balance - 2.50;
	}
	
	public static void salutation(String aName) {
		aName = "Dear " + aName;
	}

}

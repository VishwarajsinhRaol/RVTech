package encapsulation;

class Account {
	private long accNo = 123456789;
	private double balance;
	private String pwd;

	public Account() {
	}

	public Account(long accNo, double balance, String pwd) {
		this.accNo = accNo;
		this.balance = balance;
		this.pwd = pwd;
	}

	public long getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}

class TestEncapsulation {
	public static void main(String[] args) {
		Account a1 = new Account();
		System.out.println(a1.getAccNo());
		System.out.println(a1.getBalance());
		// Setting Data Using Setters
		a1.setBalance(120000.80);
		a1.setPwd("A1@007");
		System.out.println(a1.getAccNo());
		System.out.println(a1.getBalance());
		System.out.println(a1.getPwd());
	}
}
package polymorphism;

class Bank {
	double rateOfInst() {
		return 0;
	}
}

class Axis extends Bank {
	double rateOfInst(double roi) {
		return roi;
	}
}

class HDFC extends Bank {
	double rateOfInst(double roi) {
		return roi;
	}
}

class TestPolymorphism {
	public static void main(String[] args) {
		Bank b1 = new Bank();
		System.out.println(b1.rateOfInst());
		Axis b2 = new Axis();
		System.out.println(b2.rateOfInst(6.5));
	}
}
package week3.day1.assignments;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("deposit account in Axis Bank");
	}

	public static void main(String[] args) {
		AxisBank abank = new AxisBank();
		abank.deposit();
	}

}

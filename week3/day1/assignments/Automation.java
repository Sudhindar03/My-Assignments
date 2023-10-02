package week3.day1.assignments;

public class Automation extends MultipleLanguage {

	public void Selenium() {
		System.out.println("Selenium automation tool");
	}

	public void Java() {
		System.out.println("Java programming language");
	}

	@Override
	public void ruby() {
		System.out.println("Ruby programming language");
	}

	public static void main(String[] args) {

		Automation auto = new Automation();
		auto.python();
		auto.Selenium();
		auto.Java();
		auto.ruby();
	}

}

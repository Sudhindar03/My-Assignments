package week3.day1.assignments;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Desktop size");
	}

	public static void main(String[] args) {
		Desktop dc = new Desktop();
		dc.desktopSize();
		dc.computerModel();
	}

}

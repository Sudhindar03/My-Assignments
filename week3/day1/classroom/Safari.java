package week3.day1.classroom;

public class Safari extends Edge {

	public void readerMode() {
		System.out.println("Reader mode");
	}

	public void fullScreenMode() {
		System.out.println("Full screen mode");
	}
	
	public static void main(String[] args) {
		Safari sbrowser = new Safari();
		
		sbrowser.openURL();
		sbrowser.openIncognito();
		sbrowser.clearCache();
		sbrowser.fullScreenMode();
		
		sbrowser.browserName = "Chrome";
		
		System.out.println(sbrowser.browserName);
	}
	
}

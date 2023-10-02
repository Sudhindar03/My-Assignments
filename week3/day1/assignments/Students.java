package week3.day1.assignments;

public class Students {

	public void getStudentInfo() {

	}

	public void getStudentInfo(int id) {
		System.out.println("Student id : " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id : " + id + " and Student Name : " + name);
	}

	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Student email id : " + email + " and Student contact no : " + phoneNumber);
	}

	public static void main(String[] args) {

		Students stdtsobj = new Students();

		stdtsobj.getStudentInfo(159357);
		stdtsobj.getStudentInfo(357159, "Dominique");
		stdtsobj.getStudentInfo("teststudent@testuniv.com", "9578624130");
	}

}

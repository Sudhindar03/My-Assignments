package week3.day1.assignments.org.student;

import week3.day1.assignments.org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Print the student name");
	}

	public void studentDept() {
		System.out.println("Print the student dept");
	}

	public void studentId() {
		System.out.println("Print the student id");
	}

	public static void main(String[] args) {
		Student stuobj = new Student();
		stuobj.studentName();
		stuobj.studentDept();
		stuobj.studentId();

		stuobj.deptName();

		stuobj.collegeName();
		stuobj.collegeCode();
		stuobj.collegeRank();
	}

}

package sample;

import java.util.Scanner;

public class AddNewStudent {

	Scanner sc = new Scanner(System.in);
	
	
	public Student getNewStudent() {
		
		
		Student student = new Student();

		setStudentName(student);
		setStudentLastName(student);
		setStudnetGender(student);
		setStudentId(student);
		setStudentGroupName(student);

		return student;
	}

	public void setStudentName(Student student) {
		System.out.println("Enter student name");
		String name = sc.nextLine();
		student.setName(name);
	}

	public void setStudentLastName(Student student) {
		System.out.println("Enter student last name");
		String lsatname = sc.nextLine();
		student.setLastName(lsatname);
	}

	public void setStudnetGender(Student student) {

		System.out.println("Enter student gender");
		String gender = sc.nextLine();
		for (int i = 0; i < Gender.values().length; i++) {
			if (Gender.values()[i].toString().equals(gender))
				student.setGender(Gender.values()[i]);
		}

	}

	public void setStudentId(Student student) {
		System.out.println("Enter student id");
		int id = sc.nextInt();
		student.setId(id);
		
	}

	public void setStudentGroupName(Student student) {
		System.out.println("Enter student group name");
		String groupname = sc.nextLine();
		student.setGroupName(groupname);
	}
}

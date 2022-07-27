package sample;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private String groupName;
	private Student[] students = new Student[10];
	
	private AddNewStudent ans = new AddNewStudent();

	private Student addStudent = ans.getNewStudent();

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudens(Student[] studens) {
		this.students = studens;

	}

	public void addStudent(Student student) throws GroupOverflowException {
		Integer freeIndex = getFreeIndex();
		if (freeIndex == null)
			throw new GroupOverflowException("Overflow group");
		students[freeIndex] = addStudent;
	}

	public Integer getFreeIndex() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null)
				return i;
		}
		return null;
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		Integer studentIndex = getStudentIndex(lastName);
		if (studentIndex == null)
			throw new StudentNotFoundException("Student not found");
		return students[studentIndex];
	}

	public Integer getStudentIndex(String lastName) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getLastName() != null && students[i].getLastName().equals(lastName))
				return i;
		}
		return null;
	}

	public boolean removeStudentByID(int id) {
		Integer studentIndex = getStudentIndex(id);
		if (studentIndex == null)
			return false;
		students[studentIndex] = null;
		return true;
	}

	public Integer getStudentIndex(int id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getId() == id)
				return i;
		}
		return null;
	}

	public void sortStudentsByLastName() {
		Arrays.sort(students, Comparator.nullsLast(new StudentLastNameComparator()));

	}

	private String createToString() {
		StringBuilder sb = new StringBuilder("\nStudent group :\n");
		for (Student student : students) {
			if (student != null)
				sb.append(student).append("\n");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		sortStudentsByLastName();
		return createToString();
	}

}

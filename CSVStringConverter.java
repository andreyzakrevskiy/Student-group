package sample;

public class CSVStringConverter {

	public String toStringRepresentation(Student student) {
		StringBuilder sb = new StringBuilder();

		addStudentNameCSV(student, sb);
		sb.append(",");
		addStudentLastNameCSV(student, sb);
		sb.append(",");
		addStudentGenderCSV(student, sb);
		sb.append(",");
		addStudentIdCSV(student, sb);
		sb.append(",");
		addStudentGroupNameCSV(student, sb);
		sb.append(",");

		return (sb == null) ? null : sb.toString();

	}

	public Student fromStringRepresentation(String str) {
		
		String[] arrStudent = str.split(",");
		
		Student student = new Student();
		setStudentName(student, arrStudent[0]);
		setStudentLastName(student, arrStudent[1]);
		setStudentGender(student, arrStudent[2]);
		setStudentId(student, arrStudent[3]);
		setStudentGroupName(student, arrStudent[4]);
		return student;
	}

	private void setStudentGroupName(Student student, String groupName) {
		student.setGroupName(groupName);

	}

	private void setStudentId(Student student, String id) {
		student.setId(0);

	}

	private void setStudentGender(Student student, String gender) {

		for (int i = 0; i < Gender.values().length; i++) {
			if (Gender.values()[i].toString().equals(gender))
				student.setGender(Gender.values()[i]);
		}

	}

	private void setStudentLastName(Student student, String lastName) {
		student.setLastName(lastName);

	}

	private void setStudentName(Student student, String name) {
		student.setName(name);

	}

	private void addStudentGroupNameCSV(Student student, StringBuilder sb) {
		sb.append(student.getGroupName());

	}

	private void addStudentIdCSV(Student student, StringBuilder sb) {
		sb.append(student.getId());

	}

	private void addStudentGenderCSV(Student student, StringBuilder sb) {
		sb.append(student.getGender().toString());

	}

	private void addStudentLastNameCSV(Student student, StringBuilder sb) {
		sb.append(student.getLastName());

	}

	private void addStudentNameCSV(Student student, StringBuilder sb) {
		sb.append(student.getName());

	}

	@Override
	public String toString() {
		return "CSVStringConverter [getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

}

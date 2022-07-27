package sample;

public class Student extends Human {

	int id;
	String groupName;

	public Student(String name, String lastName, Gender gender) {
		super(name, lastName, gender);
	}

	public Student() {

	}

	public Student(int id, String groupName) {
		this.id = id;
		this.groupName = groupName;
	}

	public Student(String name, String lastName, Gender gender, int id, String groupName) {
		super(name, lastName, gender);
		this.groupName = groupName;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", groupName=" + groupName + super.toString() + "]";
	}


}

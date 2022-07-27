package sample;

public class TestGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group studentsGroup = new Group();
		try {
			studentsGroup.addStudent(null);
		} catch (GroupOverflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println(studentsGroup);

	}
}
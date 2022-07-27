package sample;

public class StudentNotFoundException extends Exception {

	public StudentNotFoundException() {
		
	}
	public StudentNotFoundException(String massage) {
		super (massage);
	}
	public StudentNotFoundException(String massage, Throwable cause) {
		super (massage, cause);
		}
	public StudentNotFoundException(Throwable cause) {
		super (cause);
	}
}

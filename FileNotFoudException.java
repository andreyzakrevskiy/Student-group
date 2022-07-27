package sample;

public class FileNotFoudException extends Exception {
public FileNotFoudException() {
		
	}
	public FileNotFoudException(String massage) {
		super (massage);
	}
	public FileNotFoudException(String massage, Throwable cause) {
		super (massage, cause);
		}
	public FileNotFoudException(Throwable cause) {
		super (cause);
	}
}

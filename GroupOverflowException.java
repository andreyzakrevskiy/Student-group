package sample;

public class GroupOverflowException extends Exception {

		public GroupOverflowException() {
			
		}
		public GroupOverflowException(String massage) {
			super (massage);
		}
		public GroupOverflowException(String massage, Throwable cause) {
			super (massage, cause);
		}
		public GroupOverflowException(Throwable cause) {
			super (cause);
		}
}

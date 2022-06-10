package day32.exceptiondemo;

public class InvalidAgeException extends RuntimeException {
	

	private static final long serialVersionUID = -6097077946163510753L;

	public InvalidAgeException(String msg) {
		super(msg);
	}
}

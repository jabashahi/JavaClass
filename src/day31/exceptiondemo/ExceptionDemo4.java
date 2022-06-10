package day31.exceptiondemo;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		try {
			try {

			} catch (Exception e) {
			}
		} catch (Exception e) {
			try {

			} catch (Exception e2) {
			}
		} finally {
			try {

			} catch (Exception e2) {

			}
		}
	}
}

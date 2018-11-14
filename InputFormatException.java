package phoneBookClasses;

public class InputFormatException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1188228411182065150L;

	InputFormatException() {
	}
	
	public String toString() {
		String errorString = "Input error detected, please check format and try again";
		return errorString;
	}
	
}

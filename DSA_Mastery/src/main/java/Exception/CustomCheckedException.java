package Exception;


/**
 * CustomCheckedException class
 * 
 * 1. Extends the Exception class to create a custom checked exception.
 * 2. Provides multiple constructors for flexibility based on the use case.
 */
public class CustomCheckedException extends Exception{	
	
	/**
	 * Use it when you want to throw an exception with a custom message.(For most business exceptions)
	 * throw new CustomCheckedException("User not found");
	 * @param message
	 */
	public CustomCheckedException(String message) {
		super(message);
	}
	
	/**
	 *  custom message and preserve the original exception (cause).
	 *  throw new CustomCheckedException("Invalid number format", e);
	 * @param message
	 * @param cause
	 */
	public CustomCheckedException(String message, Throwable cause) {
		super(message, cause);
	}
	/**
	 * only care about wrapping the original exception (cause) without a new message.
	 * throw new CustomCheckedException(e);
	 * @param cause
	 */
	public CustomCheckedException(Throwable cause) {
		super(cause);
	}
	
	public CustomCheckedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}	
	
	
	public CustomCheckedException() {
		super();
	}
	

}

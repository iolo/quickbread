package net.daum.dna.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class APICommonException.
 */
@SuppressWarnings("serial")
public class APICommonException extends Exception{

	/** The message. */
	private String message;
	/**
	 * Instantiates a new API common exception.
	 */
	public APICommonException() {
		super();
	}

	/**
	 * Instantiates a new API common exception.
	 *
	 * @param message Exception이 발생했을 때 출력할 메세지
	 */
	public APICommonException(String message) {
		super();
		this.setMessage(message);
		
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}


	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Prints the message.
	 */
	public void printMessage(){
		System.out.println(message);
	}

}

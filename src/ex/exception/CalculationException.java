package ex.exception;

public class CalculationException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5771400484283135124L;
	public CalculationException() {
		super();
	}
	public CalculationException(String msg) {
		super(msg);
	}
	
	public CalculationException(String msg, Throwable cause) {
		super(msg, cause);
	}

}

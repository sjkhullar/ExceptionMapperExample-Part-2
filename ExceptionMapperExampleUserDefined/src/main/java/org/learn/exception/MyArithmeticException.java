package org.learn.exception;

public class MyArithmeticException extends ArithmeticException {
	
	private static final long serialVersionUID = 652325545058196579L;

	public MyArithmeticException(String s) {
        super(s);
    }
}

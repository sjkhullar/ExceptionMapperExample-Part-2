package org.learn.exception;



public class MyNullPointerException extends NullPointerException {
	
	private static final long serialVersionUID = 5627096569547521249L;

	public MyNullPointerException(String s) {
        super(s);
    }
}

package com.nlc.collection.exception;

public class MtgCollectionException extends RuntimeException {

	private static final long serialVersionUID = -4251259578408321485L;

	public MtgCollectionException(String message) {
		super(message);
	}

	public MtgCollectionException(Throwable cause) {
		super(cause);
	}

	public MtgCollectionException(String message, Throwable cause) {
		super(message, cause);
	}
}

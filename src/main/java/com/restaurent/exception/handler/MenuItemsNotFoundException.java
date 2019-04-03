package com.restaurent.exception.handler;

public class MenuItemsNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -291293582451968071L;
	
	public MenuItemsNotFoundException(String message) {
		super(message);
	}

}

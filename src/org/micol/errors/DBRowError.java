package org.micol.errors;

/**
 * DBRowError class.
 * 
 * The DBRowError class store error cause and
 * identifier for DBRow error.
 * 
 * @author vallance
 *
 */
public class DBRowError {

	protected int rowIndex = -1;
	protected String message = "";
	
	/**
	 * Constructor.
	 * 
	 * Complete DBRowError constructor.
	 * 
	 * @param rowIndex	The DBQueryResult row index of the DBRow that throw error.
	 * @param message	The message of the error.
	 */
	public DBRowError(int rowIndex, String message) {
		super();
		this.rowIndex = rowIndex;
		this.message = message;
	}

	/**
	 * Constructor.
	 * 
	 * DBRowError constructor.
	 * 
	 * @param rowIndex	The DBQueryResult row index of the DBRow that throw error.
	 */
	public DBRowError(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	/**
	 * Default constructor.
	 * 
	 * Default empty constructor.
	 */
	public DBRowError() {
	}

	/**
	 * Get row index.
	 * 
	 * Get the row index of the DBRow that
	 * create error from DBQueryResult.
	 * 
	 * @return The DBQueryResult row index of the DBRow that throw error.
	 */
	public int getRowIndex() {
		return rowIndex;
	}

	/**
	 * Set row index.
	 * 
	 * Set up the row index of the DBRow that
	 * create error from DBQueryResult.
	 * 
	 * @param rowIndex	The DBQueryResult row index of the DBRow that throw error.
	 */
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	/**
	 * Get message.
	 * 
	 * Get the error message.
	 * 
	 * @return	The error message.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Set up error message.
	 * 
	 * Set up the error message.
	 * 
	 * @param message	The message of the error.
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}

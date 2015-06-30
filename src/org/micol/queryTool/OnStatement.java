package org.micol.queryTool;

public class OnStatement implements QLEqualityInterface{

	protected String fromField;
	protected String toField;
	protected int equalityType;
	
	/**
	 * Constructor.
	 * 
	 * OnStatement constructor. Define the on clause.
	 * 
	 * @param fromField
	 * @param toField
	 * @param equalityType
	 */
	public OnStatement(String fromField, String toField, int equalityType) {
		this.fromField = fromField;
		this.toField = toField;
		this.equalityType = equalityType;
	}
	
	/**
	 * Get from field.
	 * 
	 * Get the field name that create the jonction in
	 * the existant container.
	 * 
	 * @return The existant field.
	 */
	public String getFromField() {
		return fromField;
	}
	
	/**
	 * Get to field.
	 * 
	 * Get the field name that create the jonction in
	 * the external container.
	 * 
	 * @return	The external field name.
	 */
	public String getToField() {
		return toField;
	}
	
	/**
	 * @see org.micol.queryTool.QLEqualityInterface#getEqualityType()
	 */
	@Override
	public int getEqualityType() {
		return equalityType;
	}
	
	
}

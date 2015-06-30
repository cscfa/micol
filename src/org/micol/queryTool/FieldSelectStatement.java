/**
 * 
 */
package org.micol.queryTool;

/**
 * FieldSelectStatement class.
 * 
 * The FieldSelectStatement provide logic usage
 * of field selection.
 * 
 * @author vallance
 *
 */
public class FieldSelectStatement {

	protected String fieldName;
	protected String alias;
	protected Object value;
	
	/**
	 * Constructor.
	 * 
	 * FieldSelectStatement constructor.
	 * 
	 * @param fieldName	The field name.
	 * @param alias		The field alias.
	 */
	public FieldSelectStatement(String fieldName, String alias) {
		super();
		this.fieldName = fieldName;
		this.alias = alias;
	}
	
	/**
	 * Constructor.
	 * 
	 * FieldSelectStatement constructor.
	 * 
	 * @param fieldName	The field name.
	 * @param alias		The field alias.
	 * @param value		The new value of the field.
	 */
	public FieldSelectStatement(String fieldName, String alias, Object value) {
		super();
		this.fieldName = fieldName;
		this.alias = alias;
		this.value = value;
	}

	/**
	 * Get field name.
	 * 
	 * Get the current field name.
	 * 
	 * @return	The field name
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * Get alias.
	 * 
	 * Get the current field alias.
	 * 
	 * @return	The field alias.
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Get value.
	 * 
	 * Get the new value of the field.
	 * 
	 * @return	The new value.
	 */
	public Object getValue() {
		return value;
	}
	
}

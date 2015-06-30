package org.micol.queryTool;

/**
 * WhereStatement class.
 * 
 * The WhereStatement class define a where statement
 * with a comparison between a field and a value.
 * 
 * @author vallance
 *
 */
public class WhereStatement implements QLEqualityInterface{
	
	protected String 	column;
	protected int 		WhereType;
	protected Object 	value;

	/**
	 * Default constructor.
	 * 
	 * Default WhereStatement constructor.
	 * 
	 * @param column	The field name to compare.
	 * @param whereType	The comparison type as {@link Where} constants.
	 * @param value		The compare to value.
	 */
	public WhereStatement(String column, int whereType, Object value) {
		super();
		this.column = column;
		WhereType = whereType;
		this.value = value;
	}

	/**
	 * Get column.
	 * 
	 * Get the field name to compare.
	 * 
	 * @return the field name.
	 */
	public String getColumn() {
		return column;
	}

	/**
	 * Get value.
	 * 
	 * Get the compare to value.
	 * 
	 * @return the compare to value.
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * Get stringify.
	 * 
	 * Return a string representation of the current instance.
	 * 
	 * @return A string representation of the current instance.
	 */
	public String getStringify(){
		return this.column + String.valueOf(this.WhereType) + this.value.toString();
	}

	/**
	 * @see org.micol.queryTool.QLEqualityInterface#getEqualityType()
	 */
	@Override
	public int getEqualityType() {
		return WhereType;
	}
}

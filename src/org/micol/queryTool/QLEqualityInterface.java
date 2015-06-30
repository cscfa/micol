/**
 * 
 */
package org.micol.queryTool;

/**
 * QLEqualityInterface.
 * 
 * Query language equality type interface.
 * 
 * @author vallance
 *
 */
public interface QLEqualityInterface {

	static final int 	EQUAL = 0;
	static final int 	NOTEQUAL = 1;
	static final int 	SUPERIOR = 2;
	static final int 	INFERIOR = 3;

	/**
	 * Get equality type.
	 * 
	 * Get the comparison type of the statement.
	 * 
	 * @return the comparison type.
	 */
	public int getEqualityType();
	
}

/**
 * 
 */
package org.micol.queryTool;

/**
 * @author vallance
 *
 */
public interface QLJunctionTypeInterface {

	public static final int JOIN = 0;
	public static final int LEFT_JOIN = 1;
	public static final int RIGHT_JOIN = 2;
	public static final int INNER_JOIN = 3;
	public static final int FULL_JOIN = 4;
	public static final int FULL_OUTER_JOIN = 5;
	public static final int UNION = 6;
	public static final int UNION_ALL = 6;


	/**
	 * Get type.
	 * 
	 * Get the junction type.
	 * 
	 * @return	The type of the junction.
	 */
	public int getType();
}

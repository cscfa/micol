/**
 * 
 */
package org.micol.queryTool;

import java.util.LinkedList;

/**
 * GroupBy class.
 * 
 * GroupBy class define a field grouping.
 * 
 * @author vallance
 *
 */
public class GroupBy {

	protected LinkedList<String> fieldsGroup;

	/**
	 * Default constructor.
	 * 
	 * Default GroupBy constructor.
	 */
	public GroupBy() {
		this.fieldsGroup = new LinkedList<String>();
	}
	
	/**
	 * Add.
	 * 
	 * Add a field name to the groupBy clause.
	 * 
	 * @param field	The field name.
	 */
	public void add(String field) {
		this.fieldsGroup.add(field);
	}
	
	/**
	 * Get all.
	 * 
	 * Get all of the grouping fields of the current
	 * GroupBy instance.
	 * 
	 * @return	The grouping fileds as {@link LinkedList}.
	 */
	public LinkedList<String> getAll() {
		return this.fieldsGroup;
	}
	
}

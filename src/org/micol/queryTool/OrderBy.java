/**
 * 
 */
package org.micol.queryTool;

import java.util.LinkedHashMap;

/**
 * OrderBy class.
 * 
 * OrderBy class define a field ordering.
 * 
 * @author vallance
 *
 */
public class OrderBy implements QLOrderInterface {

	public LinkedHashMap<String, Integer> fields;

	/**
	 * Default constructor.
	 * 
	 * OrderBy default constructor.
	 */
	public OrderBy() {
		this.fields = new LinkedHashMap<String, Integer>();
	}
	
	/**
	 * Add.
	 * 
	 * Add a new order by clause to the current instance.
	 * 
	 * @param field	The fieldName.
	 * @param order	The order type.
	 */
	public void add(String field, int order) {
		this.fields.put(field, new Integer(order));
	}
	
	/**
	 * Get all.
	 * 
	 * Get all of the order clause of the 
	 * current instance.
	 * 
	 * @return The order clause as {@link LinkedHashMap}.
	 */
	public LinkedHashMap<String, Integer> getAll() {
		return this.fields;
	}
	
}

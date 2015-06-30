/**
 * 
 */
package org.micol.queryTool;

import java.util.LinkedHashMap;

/**
 * From class.
 * 
 * The From class define the query
 * containers to select.
 * 
 * @author vallance
 *
 */
public class From {

	protected LinkedHashMap<String, String> containers;
	
	/**
	 * Add.
	 * 
	 * Add a new from clause.
	 * 
	 * @param container	The container name to instert.
	 */
	public void add(String container) {
		this.containers.put(container, null);
	}
	
	/**
	 * Add.
	 * 
	 * Add a new from clause with alias.
	 * 
	 * @param container	The container name to insert.
	 * @param alias		The container alias name.
	 */
	public void add(String container, String alias){
		this.containers.put(container, alias);
	}
	
	/**
	 * Get all.
	 * 
	 * Get all of the from clause 
	 * stored into the current instance.
	 * 
	 * @return	The forms clause as {@link LinkedHashMap};
	 */
	public LinkedHashMap<String, String> getAll() {
		return this.containers;
	}
	
}

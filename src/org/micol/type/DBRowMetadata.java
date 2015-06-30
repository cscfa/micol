package org.micol.type;

import java.util.Set;

/**
 * DBRowMetadata interface.
 * 
 * DBRowMetadata interface introduce methods to
 * get DBRow definition.
 * 
 * @author vallance
 *
 */
public interface DBRowMetadata {

	/**
	 * Get field set.
	 * 
	 * Get the database row response field set.
	 * 
	 * @return	The database row field set.
	 */
	public Set<String> getFieldSet();
	
	/**
	 * Get a field type.
	 * 
	 * Get a field type from the database
	 * row response.
	 * 
	 * @param field	The field name.
	 * @return		The type of the field as String.
	 */
	public String getType(String field);
	
}

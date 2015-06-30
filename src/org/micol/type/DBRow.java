/**
 * 
 */
package org.micol.type;


/**
 * DBRow interface.
 * 
 * The DBRow interface introduce methods to
 * store in memory a database row response.
 * 
 * @author vallance
 *
 */
public interface DBRow {

	/**
	 * Get metadata.
	 * 
	 * Get the database row metadata.
	 * 
	 * @return	The database row metadata.
	 */
	public DBRowMetadata metadata();
	
	/**
	 * Get field value.
	 * 
	 * Get a field value from database row result.
	 * 
	 * @param key	The field name.
	 * @return		The field value.
	 */
	public Object get(String key);
	
	/**
	 * Set a field.
	 * 
	 * Set up a field value.
	 * 
	 * @param key	The field key.
	 * @param value	The new field value.
	 * @return		True if the value was effectively set up, or false.
	 */
	public boolean set(String key, Object value);
	
	/**
	 * Insert row.
	 * 
	 * Insert the current row in new id.
	 * 
	 * @return	True on insertion success, or false.
	 */
	public boolean insert();
	
	/**
	 * Update row.
	 * 
	 * Update the current row.
	 * 
	 * @return	True on update success, or false.
	 */
	public boolean update();

}

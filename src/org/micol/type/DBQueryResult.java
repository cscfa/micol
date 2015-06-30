package org.micol.type;

import java.util.ArrayList;
import java.util.Deque;

import org.micol.errors.DBRowError;

/**
 * DBQueryResult interface.
 * 
 * DBQueryResult interface introduce methods
 * to manage DBRow instances.
 * 
 * @author vallance
 *
 */
public interface DBQueryResult extends Deque<DBRow>{

	/**
	 * Update all.
	 * 
	 * Update all stored DBRow instances.
	 * 
	 * @return	True on success, false on failure of one or more DBRow update.
	 */
	public boolean updateAll();

	/**
	 * Insert all.
	 * 
	 * Insert all stored DBRow instances.
	 * 
	 * @return	True on success, false on failure of one or more DBRow insert.
	 */
	public boolean insertAll();
	
	/**
	 * Get errors.
	 * 
	 * Get previous errors throws by insertAll or UpdateAll.
	 * 
	 * @return	An ArrayList of DBRowError.
	 */
	public ArrayList<DBRowError> getErrors();
	
	/**
	 * Clear errors.
	 * 
	 * Clear previous errors throws by insertAll or UpdateAll.
	 */
	public void clearErrors();
	
}

/**
 * 
 */
package org.micol.traductor;

import org.micol.queryBuilder.QueryBuilder;
import org.micol.type.DBQueryResult;

/**
 * Micol traductor interface.
 * 
 * Traductor interface introduce method definition
 * to transmit order to database.
 * 
 * @author vallance
 *
 */
public interface MicolTraductor {

	/**
	 * Use.
	 * 
	 * Inform the current instance about
	 * the connection database driver to
	 * use for execute the process.
	 * 
	 * @param driver	The driver denomination.
	 * @return			True on success, or false on failure.
	 */
	public boolean use(String driver);
	
	/**
	 * Select.
	 * 
	 * Perform a select request.
	 * 
	 * @param query	The {@link QueryBuilder} to use for create the query.
	 * @return		The query result as {@link DBQueryResult} or null on failure.
	 */
	public DBQueryResult select(QueryBuilder query);
	
	/**
	 * Insert.
	 * 
	 * Perform an insert request.
	 * 
	 * @param query	The {@link QueryBuilder} to use for create the query.
	 * @return		True on success, or false on failure.
	 */
	public boolean insert(QueryBuilder query);
	
	/**
	 * Update.
	 * 
	 * Perform an update request.
	 * 
	 * @param query	The {@link QueryBuilder} to use for create the query.
	 * @return		True on success, or false on failure.
	 */
	public boolean update(QueryBuilder query);
	
	/**
	 * Delete.
	 * 
	 * Perform a delete request.
	 * 
	 * @param query	The {@link QueryBuilder} to use for create the query.
	 * @return		True on success, or false on failure.
	 */
	public boolean delete(QueryBuilder query);
	
	/**
	 * Describe.
	 * 
	 * Request for informations.
	 * 
	 * @param query	The {@link QueryBuilder} to use for create the query.
	 * @return		The query result as {@link DBQueryResult} or null on failure.
	 */
	public DBQueryResult describe(QueryBuilder query);
}

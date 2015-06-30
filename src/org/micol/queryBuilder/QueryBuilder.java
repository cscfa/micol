package org.micol.queryBuilder;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.micol.queryTool.FieldSelectStatement;
import org.micol.queryTool.From;
import org.micol.queryTool.GroupBy;
import org.micol.queryTool.Join;
import org.micol.queryTool.JoinStatement;
import org.micol.queryTool.OnStatement;
import org.micol.queryTool.OrderBy;
import org.micol.queryTool.Where;
import org.micol.queryTool.WhereStatement;

/**
 * QueryBuilder interface.
 * 
 * The QueryBuilder interface introduce methods
 * to create a query.
 * 
 * @author vallance
 *
 */
public interface QueryBuilder {

	/**
	 * Field.
	 * 
	 * Adding a field selector list.
	 * 
	 * @param select	A list of {@link FieldSelectStatement} into a {@link LinkedList}.
	 */
	public void field(LinkedList<FieldSelectStatement> select);
	/**
	 * Add field.
	 * 
	 * Create a new field and insert it into
	 * fields storage.
	 * 
	 * @param fieldName	The {@link FieldSelectStatement} fieldName.
	 * @param alias		The {@link FieldSelectStatement} alias.
	 */
	public void addField(String fieldName, String alias);
	/**
	 * Add field.
	 * 
	 * Create a new field and insert it into
	 * fields storage.
	 * 
	 * @param fieldName	The {@link FieldSelectStatement} fieldName.
	 * @param alias		The {@link FieldSelectStatement} alias.
	 * @param value		The {@link FieldSelectStatement} value.
	 */
	public void addField(String fieldName, String alias, Object value);
	/**
	 * Remove field.
	 * 
	 * Remove a field from the fields storage.
	 * 
	 * @param field	The field name.
	 */
	public void removeField(String field);
	/**
	 * Get all fields.
	 * 
	 * Get all of the stored {@link FieldSelectStatement}.
	 * 
	 * @return	All of the {@link FieldSelectStatement} into a {@link LinkedList}.
	 */
	public LinkedList<FieldSelectStatement> getAllFields();
	
	/**
	 * From.
	 * 
	 * Adding a From list.
	 * 
	 * @param from	A list of field into a {@link LinkedHashMap}.
	 */
	public void from(LinkedHashMap<String, String> from);
	/**
	 * Add From.
	 * 
	 * Create a new from and insert it into
	 * fields storage.
	 * 
	 * @param container	The {@link From} container.
	 * @param alias		The {@link From} alias.
	 */
	public void addFrom(String container, String alias);
	/**
	 * Remove From.
	 * 
	 * Remove a 'from' from the fields storage.
	 * 
	 * @param container	The container name.
	 */
	public void removeFrom(String container);
	/**
	 * Get all from.
	 * 
	 * Get all of the stored {@link From}.
	 * 
	 * @return	All of the {@link From} into a {@link LinkedHashMap}.
	 */
	public LinkedHashMap<String, String> getAllFrom();
	
	/**
	 * Join.
	 * 
	 * Adding a Join list.
	 * 
	 * @param join	A list of {@link Join} into an {@link ArrayList}.
	 */
	public void join(ArrayList<JoinStatement> join);
	/**
	 * Add join.
	 * 
	 * Create a new {@link Join} and insert it
	 * into Join storage.
	 * 
	 * @param join	A {@link JoinStatement} to insert.
	 */
	public void addJoin(JoinStatement join);
	/**
	 * Add join.
	 * 
	 * Create and insert a new {@link Join}
	 * into Join storage.
	 * 
	 * @param type			The {@link JoinStatement} type.
	 * @param containerFrom	The {@link JoinStatement} containerFrom.
	 * @param containerTo	The {@link JoinStatement} containerTo.
	 * @param on			The {@link JoinStatement} on.
	 */
	public void addJoin(int type, String containerFrom, String containerTo, OnStatement on);
	/**
	 * Add join.
	 * 
	 * Create and insert a new {@link Join}
	 * into Join storage.
	 * 
	 * @param type			The {@link JoinStatement} type.
	 * @param containerFrom	The {@link JoinStatement} containerFrom.
	 * @param containerTo	The {@link JoinStatement} containerTo.
	 * @param fromField		The {@link OnStatement} fromField.
	 * @param toField		The {@link OnStatement} toField.
	 * @param equalityType	The {@link OnStatement} equalityType.
	 */
	public void addJoin(int type, String containerFrom, String containerTo, String fromField, String toField, int equalityType);
	/**
	 * Remove join.
	 * 
	 * Remove a join from the fields storage.
	 * 
	 * @param join	The {@link JoinStatement} to delete.
	 */
	public void removeJoin(JoinStatement join);
	/**
	 * Get all.
	 * 
	 * Get all of the stored {@link Join}.
	 * 
	 * @return	The list of store {@link Join} into an {@link ArrayList};
	 */
	public ArrayList<JoinStatement> getAllJoin();
	
	/**
	 * Where.
	 * 
	 * Adding a where list.
	 * 
	 * @param where	A list of {@link Where} into an {@link ArrayList}.
	 */
	public void where(ArrayList<WhereStatement> where);
	/**
	 * Add where.
	 * 
	 * Insert a new {@link WhereStatement} into
	 * where storage.
	 * 
	 * @param where	A {@link WhereStatement} to insert.
	 */
	public void addWhere(WhereStatement where);
	/**
	 * Add where.
	 * 
	 * Create and insert a new {@link WhereStatement} 
	 * into where storage.
	 * 
	 * @param column	The {@link WhereStatement} column.
	 * @param whereType	The {@link WhereStatement} whereType.
	 * @param value		The {@link WhereStatement} value.
	 */
	public void addWhere(String column, int whereType, Object value);
	/**
	 * Remove where.
	 * 
	 * Remove a where from the where
	 * storage.
	 * 
	 * @param where The {@link WhereStatement} to remove.
	 */
	public void removeWhere(WhereStatement where);
	/**
	 * Get all where.
	 * 
	 * Get all the list of {@link WhereStatement}
	 * that are stored into the current
	 * instance.
	 * 
	 * @return	A list of {@link WhereStatement} into an {@link ArrayList}.
	 */
	public ArrayList<WhereStatement> getAllWhere();
	
	/**
	 * Group by.
	 * 
	 * Adding a GroupBy list.
	 * 
	 * @param group	A list of {@link GroupBy} into a {@link LinkedList}.
	 */
	public void groupBy(LinkedList<GroupBy> group);
	/**
	 * Add group by.
	 * 
	 * Create and insert a new {@link GroupBy}.
	 * 
	 * @param field	The {@link GroupBy} field.
	 */
	public void addGroupBy(String field);
	/**
	 * Remove group by.
	 * 
	 * Remove a {@link GroupBy} from the
	 * current instance storage.
	 * 
	 * @param field	The field name to remove.
	 */
	public void removeGroupBy(String field);
	/**
	 * Get all group by.
	 * 
	 * Get all of the stored {@link GroupBy} from
	 * the current instance.
	 * 
	 * @return	A list of {@link GroupBy} into a {@link LinkedList}.
	 */
	public LinkedList<GroupBy> getAllGroupBy();
	
	/**
	 * Order by.
	 * 
	 * Adding an OrderBy list.
	 * 
	 * @param orderBy	A list of {@link OrderBy} into a {@link LinkedList}.
	 */
	public void orderBy(LinkedList<OrderBy> orderBy);
	/**
	 * Add order by.
	 * 
	 * Create and insert a new {@link OrderBy}
	 * into the current instance storage.
	 * 
	 * @param field	The {@link OrderBy} field.
	 * @param type	The {@link OrderBy} type.
	 */
	public void addOrderBy(String field, int type);
	/**
	 * Remove order by.
	 * 
	 * Remove an OrderBy from the current
	 * instance storage.
	 * 
	 * @param field	The field name of the {@link OrderBy}.
	 */
	public void removeOrderBy(String field);
	/**
	 * Get all order by.
	 * 
	 * Return the list of current instance
	 * stored {@link OrderBy}.
	 * 
	 * @return	A list of {@link OrderBy} into a {@link LinkedList}.
	 */
	public LinkedList<OrderBy> getAllOrderBy();
	
}

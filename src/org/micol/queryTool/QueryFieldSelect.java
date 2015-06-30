/**
 * 
 */
package org.micol.queryTool;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Query field select.
 * 
 * This class define a selection of fields
 * to want from the query result.
 * 
 * @author vallance
 *
 */
public class QueryFieldSelect {

	protected LinkedList<FieldSelectStatement> fields;

	/**
	 * Default constructor.
	 * 
	 * Default QueryFieldSelect constructor.
	 */
	public QueryFieldSelect() {
		this.fields = new LinkedList<FieldSelectStatement>();
	}
	
	/**
	 * Add.
	 * 
	 * Add a field into the current select
	 * instance.
	 * 
	 * @param field	The field name.
	 */
	public void add(FieldSelectStatement field){
		this.fields.add(field);
	}

	/**
	 * Add.
	 * 
	 * Create a new field into the current select
	 * instance.
	 * 
	 * @param fieldName	The {@link FieldSelectStatement} fieldName.
	 * @param alias		The {@link FieldSelectStatement} alias.
	 */
	public void add(String fieldName, String alias){
		this.fields.add(new FieldSelectStatement(fieldName, alias));
	}

	/**
	 * Add.
	 * 
	 * Create a new field into the current select
	 * instance.
	 * 
	 * @param fieldName	The {@link FieldSelectStatement} fieldName.
	 * @param alias		The {@link FieldSelectStatement} alias.
	 * @param value		The {@link FieldSelectStatement} value.
	 */
	public void add(String fieldName, String alias, Object value){
		this.fields.add(new FieldSelectStatement(fieldName, alias, value));
	}
	
	/**
	 * Get all.
	 * 
	 * Return a {@link LinkedHashMap} that containe all of the
	 * fields and their alias.
	 * 
	 * @return	Fields and alias as {@link LinkedHashMap}.
	 */
	public LinkedList<FieldSelectStatement> getAll(){
		return this.fields;
	}
}

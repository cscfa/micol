package org.micol.queryTool;

import java.util.ArrayList;

/**
 * Where class.
 * 
 * A {@link WhereStatement} container for a query.
 * 
 * @author vallance
 *
 */
public class Where{
	
	protected ArrayList<WhereStatement> whereList;
	
	/**
	 * Default constructor.
	 * 
	 * Default Where constructor.
	 */
	public Where() {
		this.whereList = new ArrayList<WhereStatement>();
	}
	
	/**
	 * Add.
	 * 
	 * Add a new {@link WhereStatement} by it's properties.
	 * 
	 * @param column	A field name.
	 * @param type		A comparison type.
	 * @param value		A value.
	 */
	public void add(String column, int type, Object value) {
		this.whereList.add(new WhereStatement(column, type, value));
	}
	
	/**
	 * Add.
	 * 
	 * Add a new {@link WhereStatement}.
	 * 
	 * @param whereStatement	The {@link WhereStatement} to insert.
	 */
	public void add(WhereStatement whereStatement){
		this.whereList.add(whereStatement);
	}
	
	/**
	 * Get all.
	 * 
	 * Get all the {@link WhereStatement} that's contained into
	 * the current Where instance.
	 * 
	 * @return An {@link ArrayList} of {@link WhereStatement}.
	 */
	public ArrayList<WhereStatement> getAll(){
		return this.whereList;
	}

}

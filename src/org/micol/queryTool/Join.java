/**
 * 
 */
package org.micol.queryTool;

import java.util.ArrayList;

/**
 * Join class.
 * 
 * Join class define a list of query junction.
 * 
 * @author vallance
 *
 */
public class Join {

	protected ArrayList<JoinStatement> joinStatements;

	/**
	 * Default constructor.
	 * 
	 * Join default constructor.
	 */
	public Join() {
		this.joinStatements = new ArrayList<JoinStatement>();
	}

	/**
	 * Add.
	 * 
	 * Add a new {@link JoinStatement} to the current list
	 * of junctions.
	 * 
	 * @param type			The {@link JoinStatement} type.
	 * @param containerFrom	The {@link JoinStatement} containerFrom.
	 * @param containerTo	The {@link JoinStatement} containerTo.
	 * @param fromField		The {@link JoinStatement} fromField.
	 * @param toField		The {@link JoinStatement} toField
	 * @param equalityType	The {@link JoinStatement} equalityType.
	 */
	public void add(int type, String containerFrom, String containerTo, String fromField, String toField, int equalityType){
		this.joinStatements.add(new JoinStatement(type, containerFrom, containerTo, fromField, toField, equalityType));
	}

	/**
	 * Add.
	 * 
	 * Add a new {@link JoinStatement} to the current list
	 * of junctions.
	 * 
	 * @param type			The {@link JoinStatement} type.
	 * @param containerFrom	The {@link JoinStatement} containerFrom.
	 * @param containerTo	The {@link JoinStatement} containerTo.
	 * @param on			The {@link JoinStatement} on.
	 */
	public void add(int type, String containerFrom, String containerTo, OnStatement on){
		this.joinStatements.add(new JoinStatement(type, containerFrom, containerTo, on));
	}

	/**
	 * Add.
	 * 
	 * Add a new {@link JoinStatement} to the current list
	 * of junctions.
	 * 
	 * @param jStatement	The new {@link JoinStatement} to insert.
	 */
	public void add(JoinStatement jStatement){
		this.joinStatements.add(jStatement);
	}

	/**
	 * Get all.
	 * 
	 * Get an {@link ArrayList} that contain all of the
	 * current instance stored {@link JoinStatement}.
	 * 
	 * @return A list of {@link JoinStatement}.
	 */
	public ArrayList<JoinStatement> getAll() {
		return joinStatements;
	}
	
}

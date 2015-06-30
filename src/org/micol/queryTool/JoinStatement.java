/**
 * 
 */
package org.micol.queryTool;

/**
 * JoinStatement class.
 * 
 * This class define a query junction.
 * 
 * @author vallance
 *
 */
public class JoinStatement implements QLJunctionTypeInterface {
	
	protected int type;
	protected String containerFrom;
	protected String containerTo;
	protected OnStatement on;

	/**
	 * Constructor.
	 * 
	 * JoinStatement constructor.
	 * 
	 * @param type			The junction type.
	 * @param containerFrom	The existant container name.
	 * @param containerTo	The external container name.
	 * @param fromField		The {@link OnStatement} fromField.
	 * @param toField		The {@link OnStatement} toField.
	 * @param equalityType	The {@link OnStatement} equalityType.
	 */
	public JoinStatement(int type, String containerFrom, String containerTo,
			String fromField, String toField, int equalityType) {

		this.type = type;
		this.containerFrom = containerFrom;
		this.containerTo = containerTo;
		this.on = new OnStatement(fromField, toField, equalityType);
	}
	
	/**
	 * Constructor.
	 * 
	 * JoinStatement constructor.
	 * 
	 * @param type			The junction type.
	 * @param containerFrom	The existant container name.
	 * @param containerTo	The external container name.
	 * @param on			The on clause as {@link OnStatement}.
	 */
	public JoinStatement(int type, String containerFrom, String containerTo,
			OnStatement on) {

		this.type = type;
		this.containerFrom = containerFrom;
		this.containerTo = containerTo;
		this.on = on;
	}

	/**
	 * Get container from.
	 * 
	 * Get the existant container name.
	 * 
	 * @return The existant container name.
	 */
	public String getContainerFrom() {
		return containerFrom;
	}

	/**
	 * Get container to.
	 * 
	 * Get the extarnal query container.
	 * 
	 * @return The external container name.
	 */
	public String getContainerTo() {
		return containerTo;
	}

	/**
	 * Return on.
	 * 
	 * Return the on clause of the junction.
	 * 
	 * @return The on clause.
	 */
	public OnStatement getOn() {
		return on;
	}

	/**
	 * @see org.micol.queryTool.QLJunctionTypeInterface#getType()
	 */
	@Override
	public int getType() {
		return this.type;
	}

}

/**
 * 
 */
package com.greatlearning.model;

/**
 * @author NithishDongreT
 *
 */
public class Admin_Department extends Super_Department{
	
	private String departmentName;
	
	/**
	 * Default Constructor
	 */
	public Admin_Department() {
		
	}
	
	/**
	 * @param name parameterized Constructor
	 */
	public Admin_Department(String name) {
		this.departmentName = name;
	}

	/**
	 * @return the departmentName
	 */
	public final String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public final void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	/**
	 * @return getTodaysWork
	 */
	public String getTodaysWork() {
		return "Complete your documents Submission ";
	}
	
	/**
	 * @return getWorkDeadline
	 */
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	
}

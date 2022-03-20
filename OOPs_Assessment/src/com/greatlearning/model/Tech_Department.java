/**
 * 
 */
package com.greatlearning.model;

/**
 * @author NithishDongreT
 *
 */
public class Tech_Department extends Super_Department{
	
	private String departmentName;
	
	/**
	 * Default Constructor
	 */
	public Tech_Department() {
		
	}
	
	/**
	 * @param name Parameterized Constructor
	 */
	public Tech_Department(String name) {
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
	 * getTodaysWork
	 */
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	/**
	 * getWorkDeadline
	 */
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	/**
	 * @return getTechStackInformation
	 */
	public String getTechStackInformation() {
		return "Core Java";
	}
}

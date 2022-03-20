/**
 * 
 */
package com.greatlearning.model;

/**
 * @author NithishDongreT
 *
 */
public class HR_Department extends Super_Department{
	
	private String departmentName;
	
	/**
	 * default constructor
	 */
	public HR_Department() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param name parameterized constructor
	 */
	public HR_Department(String name) {
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
		return "Fill today’s worksheet/timesheet and mark your attendance";
	}
	
	/**
	 * @return getWorkDeadline
	 */
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	/**
	 * @return doActivity
	 */
	public String doActivity() {
		return "Team Lunch";
	}
	
}

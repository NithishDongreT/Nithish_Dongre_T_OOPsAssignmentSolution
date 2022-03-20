/**
 * 
 */
package com.greatlearning.model;

/**
 * @author NithishDongreT
 *
 */
public class Super_Department {
	
	private String departmentName;
	
	/**
	 * default constructor
	 */
	public Super_Department() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param name parameterized constructor
	 */
	public Super_Department(String name) {
		this.departmentName = name;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	/**
	 * @return getTodaysWork
	 */
	public String getTodaysWork() {
		return "No Work as of now ";
	}
	
	/**
	 * @return getWorkDeadline
	 */
	public String getWorkDeadline() {
		return "Nil";
	}
	
	/**
	 * @return
	 */
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}

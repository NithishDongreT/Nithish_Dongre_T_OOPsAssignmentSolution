/**
 * 
 */
package com.greatlearning.app;
import com.greatlearning.model.Admin_Department;
import com.greatlearning.model.HR_Department;
import com.greatlearning.model.Super_Department;
import com.greatlearning.model.Tech_Department;

/**
 * @author NithishDongreT
 *
 */
public class DriverApplication {

	/**
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_Department s1 = new Super_Department(" Super Department ");
		Admin_Department a1 = new Admin_Department(" Admin Department ");
		HR_Department h1 = new HR_Department(" HR Department ");
		Tech_Department t1 = new Tech_Department(" Tech Department ");
		
		System.out.println("Welcome to Admin Department");
		System.out.println(a1.getTodaysWork());
		System.out.println(a1.getWorkDeadline());
		System.out.println(a1.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to HR Department");
		System.out.println(h1.doActivity());
		System.out.println(h1.getTodaysWork());
		System.out.println(h1.getWorkDeadline());
		System.out.println(h1.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to Tech Department");
		System.out.println(t1.getTodaysWork());
		System.out.println(t1.getWorkDeadline());
		System.out.println(t1.getTechStackInformation());
		System.out.println(t1.isTodayAHoliday());


	}

}

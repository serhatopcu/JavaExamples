
package org.javaturk.oop.ch08.bean;

import org.javaturk.oop.ch08.enums.date.startDateEnums.DayOfMonth;
import org.javaturk.oop.ch08.enums.date.startDateEnums.Month;
import org.javaturk.oop.ch08.enums.date.startDateEnums.Year;

/**
 * That's a bean.
 * @author akin
 *
 */
public class Date {
	private DayOfMonth dayOfMonth;
	private Month month;
	private Year year;
	
	public Date(){
	}
	
	public Date(DayOfMonth dayOfMonth, Month month, Year year) {
		this.dayOfMonth = dayOfMonth;
		this.month = month;
		this.year = year;
	}

	public DayOfMonth getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(DayOfMonth dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}
}

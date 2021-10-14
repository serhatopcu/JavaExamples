/**
 * 
 */
package org.javaturk.oop.ch08.enums.date;

import org.javaturk.oop.ch08.enums.date.startDateEnums.DayOfMonth;
import org.javaturk.oop.ch08.enums.date.startDateEnums.Month;
import org.javaturk.oop.ch08.enums.date.startDateEnums.Year;

public class StartDateTest {

	public static void main(String[] args) {
		StartDate1 ed1 = new StartDate1(-2, 25, 121213232);
		
		StartDate2 ed2 = new StartDate2("-8", "Ojak", "2019");
		
		StartDate4 ed3 = new StartDate4(DayOfMonth.DAY_3, Month.NOVEMBER, Year.YEAR_2019);
	}
}

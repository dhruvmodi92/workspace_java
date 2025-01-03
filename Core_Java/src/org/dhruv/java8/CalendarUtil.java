package org.dhruv.java8;

import java.time.LocalDate;
import java.util.*;

public class CalendarUtil {
	public static void main(String[] args) {
		/*
		 * System.out.println(Calendar.getAvailableCalendarTypes()+" "+Calendar.JANUARY)
		 * ; System.out.println((CalendarUtil.Month.valueOf("APR")).noOfMonth);
		 * System.out.println(LocalDate.of(2014, Month.APR.noOfMonth + 1,
		 * 1).getDayOfWeek()); //System.out.println(Calendar.get);
		 * 
		 * Month startMonth = Month.getValue("April");
		 * System.out.println(getFirstMonday(2014, startMonth.noOfMonth));
		 */
		
		int weeks = vacationWeeks("Wednesday",2020,"January","May");
		System.out.println(weeks);
		
	}
	
	private static int vacationWeeks(String firstDayOfYear,int year, String vacationStartMonth, String vacationEndMonth) {
		int noOfWeeks = 0;
		
		Date date = new Date();
		
		if(Month.getValue(vacationStartMonth).noOfMonth  > Month.getValue(vacationEndMonth).noOfMonth)
			return 0;
		
		boolean isLeapYear = ((year % 4) == 0);
		
		
		
		//valueOf("January");
		//Date date = new GregorianCalendar(2014,Calendar.MONTH);
		Month startMonth = null, endMonth = null;
		int totalDays = 0;
		for(Month m : Month.values()) {
			if(null == startMonth) {
				if(m.label.equals(vacationStartMonth)){
					startMonth = m;
					totalDays += m.daysInMonth;
					if(isLeapYear && m == Month.FEB)
						totalDays++;
				}
				continue;
			}
			if(vacationStartMonth.equals(vacationEndMonth))
				break;
			totalDays += m.daysInMonth;
			if(isLeapYear && m == Month.FEB)
				totalDays++;
			if(null == endMonth) {
				if(m.label.equals(vacationEndMonth)){
					endMonth = m;
					break;
				}
			}
		}
		
		System.out.println("Total No of Days between startMonth and EndMonth : "+totalDays);
		
		int firstMondayDate = getFirstMonday(2014, startMonth.noOfMonth);
		totalDays -= firstMondayDate;
		
		System.out.println("Total No of Days for vacation between startMonth and EndMonth : "+totalDays);
		noOfWeeks = totalDays/7;
		if(totalDays % 7 == 6)
			noOfWeeks++;
		return noOfWeeks;
	}
	
	
	public static int getFirstMonday(int year, int month) {
		Calendar cacheCalendar = Calendar.getInstance();
	    cacheCalendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	    cacheCalendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
	    cacheCalendar.set(Calendar.MONTH, month);
	    cacheCalendar.set(Calendar.YEAR, year);
	    return cacheCalendar.get(Calendar.DATE);
	}
	
	private enum Month{
		JAN("January",Calendar.JANUARY,31),
		FEB("February",Calendar.FEBRUARY,28),
		MAR("March",Calendar.MARCH,31),
		APR("April",Calendar.APRIL,30),
		MAY("May",Calendar.MAY,31),
		JUN("June",Calendar.JUNE,30),
		JUL("July",Calendar.JULY,31),
		AUG("August",Calendar.AUGUST,31),
		SEP("September",Calendar.SEPTEMBER,30),
		OCT("October",Calendar.OCTOBER,31),
		NOV("November",Calendar.NOVEMBER,30),
		DEC("December",Calendar.DECEMBER,31);
		
		
		public final String label;
		public final int noOfMonth;
		public final int daysInMonth;
		
		private Month(String label,int noOfMonth,int daysInMonth) {
			this.label=label;
			this.noOfMonth = noOfMonth;
			this.daysInMonth = daysInMonth;
		}
		
		private static Month getValue(String label) {
			for(Month m : values()) {
				if(m.label.equalsIgnoreCase(label))
					return m;
			}
			return null;
			
		}
	}
}



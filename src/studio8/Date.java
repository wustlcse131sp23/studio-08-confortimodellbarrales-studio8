package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day; 
	private int year; 
	private boolean isHoliday;
	
	/**
	 * Constructor for Date instance variables 
	 * @param month var for what month 
	 * @param day var for what day
	 * @param year var for what year
	 * @param isHoliday var for if holiday or not
	 */
	
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	
	/**
	 * Converts code into string 
	 */
	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", isHoliday=" + isHoliday + "]";
	}

	/**
	 * hashCode and .equals methods for Date
	 */
    @Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {

    	Date Date1 = new Date(4,6,2002, false);
    	Date Date2 = new Date(4,6,2002, false);
    	Date Date3 = new Date(10,31,2002, true);
    	Date Date4 = new Date(4,29,2002, true);
    	Date Date5 = new Date(7,4,2002, true);
    	
    	LinkedList<Date> list = new LinkedList<Date>(); 
    	
    	list.add(Date1);
    	list.add(Date2);
    	list.add(Date3);
    	
    	System.out.println(list);
 
    	HashSet<Date> set = new HashSet<Date>();
    	
    	set.add(Date1);
    	set.add(Date2);
    	set.add(Date3);
    	set.add(Date1);

    	
    	System.out.println(set);
      	
    }

}

package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean isMilitaryTime; 
	
	/**
	 * Constructor for time instance variables
	 * @param hour var for what hour it is
	 * @param minute var for what minute it is
	 */
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	/**
	 * Converts code into string
	 */
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", isMilitaryTime=" + isMilitaryTime + "]";
	}


	/**
	 * hashCode and .equals code 
	 */
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
 
		Time time1 = new Time(2, 23);
		Time time2 = new Time(2, 23);
		Time time3 = new Time(5, 39);
 
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		
		System.out.println(time1.equals(time2));
		System.out.println(time1.equals(time3));
		
    	
    }

}
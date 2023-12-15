package PZ_4;
import java.util.ArrayList;
import java.util.Collections;

public class Sprint4 {

	public static void main(String[] args) {
		
	     testCalendarDate();
	     testRectangle();

	}
		
		 public static void testCalendarDate() {
		        ArrayList<CalendarDate> dates = new ArrayList<>();
		        dates.add(new CalendarDate(4, 23));
		        dates.add(new CalendarDate(3, 15));
		        dates.add(new CalendarDate(4, 15));
		        dates.add(new CalendarDate(3, 10));
		        dates.add(new CalendarDate(5, 2));

		        System.out.println("CalendarDate - Before sorting:");
		        for (CalendarDate date : dates) {
		            System.out.println(date);
		        }

		        Collections.sort(dates);

		        System.out.println("\nCalendarDate - After sorting:");
		        for (CalendarDate date : dates) {
		            System.out.println(date);
		        }
		    }
		 
		 public static void testRectangle() {
		        ArrayList<Rectangle> rectangles = new ArrayList<>();
		        rectangles.add(new Rectangle(5, 10));
		        rectangles.add(new Rectangle(3, 7));
		        rectangles.add(new Rectangle(4, 8));
		        rectangles.add(new Rectangle(2, 9));
		        rectangles.add(new Rectangle(6, 12));

		        System.out.println("\nRectangle - Before sorting:");
		        for (Rectangle r : rectangles) {
		            System.out.println(r);
		        }

		        Collections.sort(rectangles);

		        System.out.println("\nRectangle - After sorting:");
		        for (Rectangle r : rectangles) {
		            System.out.println(r);
		        }
		    }


}
	
	class CalendarDate implements Comparable<CalendarDate> {
	    private int month;
	    private int day;

	    public CalendarDate(int m, int d) {
	        this.month = m;
	        this.day = d;
	    }

	    @Override
	    public String toString() {
	        return String.format("%02d/%02d", month, day);
	    }

	    @Override
	    public int compareTo(CalendarDate other) {
	        if (this.month != other.month) {
	            return Integer.compare(other.month, this.month);
	        } else {
	            return Integer.compare(this.day, other.day);
	        }
	    }
	}
	
	class Rectangle implements Comparable<Rectangle> {
	    private int a;
	    private int b;

	    public Rectangle(int sideA, int sideB) {
	        this.a = sideA;
	        this.b = sideB;
	    }

	    public int area() {
	        return a * b;
	    }

	    @Override
	    public int compareTo(Rectangle other) {
	        return Integer.compare(this.area(), other.area());
	    }

	    @Override
	    public String toString() {
	        return "Rectangle Area: " + area();
	    }
	}

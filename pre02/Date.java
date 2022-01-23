import java.io.*;
import java.util.*;

public class Date {
	public static void main (String[] args){
		System.out.println("Hello World!");
		String day;
		int date;
		String month;
		int year;
		day = "Sunday";
		date = 23;
		month = "January";
		year = 2021;
		System.out.println (day);
		System.out.println (date);
		System.out.println (month);
		System.out.println (year);
		System.out.println ("American format: ");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println ("European format: ");
		System.out.println(day + " " + date + " " + month + " " + year);
}
}
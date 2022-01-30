import java.io.*;
import java.util.*;

public class Time {
	public static void main (String[] args){
		int hour;
		int min;
		int sec;
		int minSec;
		int secFromMid; 
		

		hour = 9;
		min = 30;
		sec = 05;
		minSec = 60;
		secFromMid = hour * minSec * minSec + (min*minSec) + sec;


		System.out.println(hour * minSec * minSec + (min*minSec) + sec);

		System.out.println(secFromMid*100/(24*60*60));

	}
}
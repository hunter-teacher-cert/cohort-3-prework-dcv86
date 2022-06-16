import java.io.*;
import java.util.*;

public class Beer {
	public static void main(String[] args){
		int beers = 99;
		String BoB = " bottles of beer on the wall";
		String ToD = "Take one down, pass it around,";
		
		while (beers > 0){
			System.out.println(beers + BoB +". "+ beers + BoB + ". ");
			System.out.println(ToD);
			beers = beers - 1; 
			System.out.println(beers + BoB + ".");{}
		}

		
	}

	
}
 
package org.j2eedev.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	
	public static void main(String[] args) {
	try
		{
		
		System.out.print( "Enter number (0 to exit): " ) ;	
		BufferedReader	reader =new BufferedReader( new InputStreamReader( System.in ) ) ;
			String value = reader.readLine() ;
			int number = Integer.parseInt( value ) ;
			NumberWords numberWords=new NumberWords();
			String result=numberWords.toWords(number);
			System.out.println(result);
		} catch ( NumberFormatException | IOException e ) {
			System.out.println( "Invalid number" ) ;
		}
		}
	
	
	

}

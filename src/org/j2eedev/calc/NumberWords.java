package org.j2eedev.calc;

public class NumberWords {

	public String toWords( int n ) throws NumberFormatException{
			
		if (n < 0) {
			return "Enter the number above one";
		}
		if(n==0)
		{
			System.exit(0);
			
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + toWords(n % 100);
		}	
return  "enter the number in between 1 to 1000";
	}
	
	
	
	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", 		
			"",		
			"Twenty", 	
			"Thirty", 	
			"Forty", 	
			"Fifty", 	
			"Sixty", 	
			"Seventy",	
			"Eighty", 	
			"Ninety" 	
	};
}

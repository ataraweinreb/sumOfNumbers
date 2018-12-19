
	public class SumOfNumbers {

		public static int sumOfNumbers(String str) {
			
	    	int count = 0; 
	    	String temp = "0"; // String variable has a 0 as default so that can be parsed to an integer 
	    	
	    	if (str == null) return 0; // if null, return 0 because has no numbers
	    	
	    	for (int i = 0; i < str.length(); i++) { 
	    		
	    		 if (Character.isDigit(str.charAt(i))) { // if character at position i in the string is a digit 
	    			temp += Character.getNumericValue(str.charAt(i)); // convert to an int and concatenate with temp
	    			
	    			/* 
	    			 * Tests if the number found in the above if statement has an additional digit: 
	    			 * 
	    			 * if i == last character of String, then obviously the number cannot have an any more digits
	    			 * or, if the next character is not digit, then obviously reached the end of the number
	    			 */
	    			if (i == str.length() - 1 || !Character.isDigit(str.charAt(i+1))) {
	    				count += Integer.parseInt(temp); // reached end of number, so add it to count
	    				temp = "0"; // then clear the value back to 0
	    			}
	    			
	    		/*
	    		 * if character at position i is NOT a digit, means that the program has either 
	    		 * 1) reached the end of a number or 2) has not yet found any numbers
	    		 * 
	    		 * if case 1), then parse the program's previous findings into an int and add to count
	    		 * if case 2), the program will simply parse and add 0 w/o changing the value of count
	    		 */
	    		} else {
	    			count += Integer.parseInt(temp);
	    			temp = "0"; // then clear the value back to 0
	    		}
	    	} //end of for loop
			return count;
		} // end of method
	} // end of class

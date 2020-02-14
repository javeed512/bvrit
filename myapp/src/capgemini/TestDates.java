package capgemini;

import java.time.*;
import java.util.Currency;
import java.util.Locale;
import java.util.Locale.Category;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * LocalDate d1 = LocalDate.now();
		 * 
		 * System.out.println(d1.getDayOfYear());
		 * 
		 * System.out.println(d1.plusMonths(2));
		 * 
		 */
		
		Locale l= Locale.FRENCH;
		
			Currency c = Currency.getInstance(l);
			
				System.out.println(5000+c.getSymbol()+" "+c.getCurrencyCode());
				
			
			
			
		
		
		
		
		
		
		

	}

}

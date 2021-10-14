package org.javaturk.oop.ch03;

import java.util.Currency;
import java.util.Locale;
import java.util.Set;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class CurrencyCharacters {

	public static void main(String[] args) {
		System.out.println("All avilable currencies and their symbols:");
		Set<Currency> currenciesAvailable = Currency.getAvailableCurrencies();
		for(Currency currency : currenciesAvailable){
			System.out.println(currency + " " + currency.getSymbol());
		}
		
		// Check to see if a character is a currency symbol
		System.out.println("Check to see if a character is a currency symbol:");
		char[] symbols = {'$', '€', '£', '¥', '₺'};
		for(char symbol : symbols){
			System.out.print(symbol + ": ");
			System.out.println(Character.getType(symbol) == Character.CURRENCY_SYMBOL);
		}
	
		Currency currencyInstance = Currency.getInstance(Locale.getDefault());
		System.out.println("Default currency symbol: " + currencyInstance.getDisplayName());
	}
}

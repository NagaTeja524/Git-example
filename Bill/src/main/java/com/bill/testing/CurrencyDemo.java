package com.bill.testing;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
	
	public static void main(String[] args) {
		
		//JPA,AUD,USD,INR
		Currency currency=Currency.getInstance("GBP");
		System.out.println(currency.getDisplayName());
	//	System.out.println(currency.getCurrencyCode());
	}

}

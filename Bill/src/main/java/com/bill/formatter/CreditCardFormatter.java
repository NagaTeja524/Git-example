package com.bill.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.bill.api.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard> {

	public String print(CreditCard cc, Locale locale) {
		
		
		return cc.getFirstFourDigits()+"-"+cc.getSecondFourDigits()+"-"+cc.getThirdFourDigits()+"-"+cc.getLastFourDigits();
	}

	public CreditCard parse(String text, Locale locale) throws ParseException {
		// spliting the credit card
		String[] digitArry = text.split("-");
		
		// setting credit card values
		CreditCard creditCard = new CreditCard();
    
		 creditCard.setFirstFourDigits(Integer.valueOf(digitArry[0]));
		 creditCard.setSecondFourDigits(Integer.valueOf(digitArry[1]));
		 creditCard.setThirdFourDigits(Integer.valueOf(digitArry[2]));
		 creditCard.setLastFourDigits(Integer.valueOf(digitArry[3]));
		 
		return creditCard;
	}

}

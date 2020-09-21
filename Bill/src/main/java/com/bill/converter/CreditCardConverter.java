package com.bill.converter;

import org.springframework.core.convert.converter.Converter;

import com.bill.api.CreditCard;

public class CreditCardConverter implements Converter<String, CreditCard> {

	public CreditCard convert(String source) {
		// spliting the credit card
		String[] digitArry = source.split("-");

		// setting credit card values
		CreditCard creditCard = new CreditCard();

		creditCard.setFirstFourDigits(Integer.valueOf(digitArry[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(digitArry[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(digitArry[2]));
		creditCard.setLastFourDigits(Integer.valueOf(digitArry[3]));

		return creditCard;
	}

}

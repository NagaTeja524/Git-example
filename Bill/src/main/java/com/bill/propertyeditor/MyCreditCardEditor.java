package com.bill.propertyeditor;

import java.beans.PropertyEditorSupport;

import com.bill.api.CreditCard;

public class MyCreditCardEditor extends PropertyEditorSupport {
	
	@Override
	public String getAsText() {
		
		CreditCard creditCard=(CreditCard)getValue();
		return "sample :"+creditCard;
		
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// spliting the credit card
		String[] digitArry = text.split("-");

		// setting credit card values
		CreditCard creditCard = new CreditCard();

		creditCard.setFirstFourDigits(Integer.valueOf(digitArry[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(digitArry[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(digitArry[2]));
		creditCard.setLastFourDigits(Integer.valueOf(digitArry[3]));

		setValue(creditCard);
	}

}

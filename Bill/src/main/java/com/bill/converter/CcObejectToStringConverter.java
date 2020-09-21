package com.bill.converter;

import org.springframework.core.convert.converter.Converter;

import com.bill.api.CreditCard;

public class CcObejectToStringConverter implements Converter<CreditCard, String> {

	public String convert(CreditCard source) {
		
		return "sample :"+source.getFirstFourDigits()+"-"+source.getSecondFourDigits()+"-"+source.getThirdFourDigits()+"-"+source.getLastFourDigits();
	}

}

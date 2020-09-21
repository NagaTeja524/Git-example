package com.bill.controllers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bill.api.BillPojo;
import com.bill.api.CreditCard;
import com.bill.formatter.CreditCardFormatter;
import com.bill.propertyeditor.MyCreditCardEditor;
import com.bill.propertyeditor.MyCurrencyEditor;

@Controller
public class BillController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("bill") BillPojo billPojo) 
	{   
		CreditCard creditCard=new CreditCard();
		creditCard.setFirstFourDigits(1234);
		creditCard.setSecondFourDigits(1234);
		creditCard.setThirdFourDigits(1234);
		creditCard.setLastFourDigits(1234);
		
		billPojo.setCreditcard(creditCard);

		return "home-page";

	}

	@RequestMapping("/process-bill")
	public String showResultPage(@Valid @ModelAttribute("bill") BillPojo billPojo, BindingResult result) 
	{

		if (result.hasErrors()) {
			return "home-page";
		}
		return "result-page";

	}

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) 
	{ 
		// InBuiltCustom editor for Date
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor dateEditor = new CustomDateEditor(dateFormat, true);
		dataBinder.registerCustomEditor(Date.class, "date", dateEditor);

	
		//InBuiltCustom editor for amount
		NumberFormat numberFormat = new DecimalFormat("##,###.00");
		CustomNumberEditor numberEditor = new CustomNumberEditor(BigDecimal.class, numberFormat, true);
		dataBinder.registerCustomEditor(BigDecimal.class, "amount", numberEditor);

		//MyCustom editor for Currency

		MyCurrencyEditor currencyEditor = new MyCurrencyEditor();
		dataBinder.registerCustomEditor(Currency.class, "currency", currencyEditor);
		
		//adding credit card formatter class to initbinder method
    
		/* dataBinder.addCustomFormatter(new CreditCardFormatter()); */
		
		//adding customPropertyeditor myCreditCardEditor to initbinder method
		
		/*
		 * MyCreditCardEditor cardEditor=new MyCreditCardEditor();
		 * dataBinder.registerCustomEditor(CreditCard.class, "creditcard", cardEditor);
		 */
		
	}

}

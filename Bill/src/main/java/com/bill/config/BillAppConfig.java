package com.bill.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.bill.converter.CcObejectToStringConverter;
import com.bill.converter.CreditCardConverter;
import com.bill.formatter.CreditCardFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.bill")
public class BillAppConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

   // this method is for formatters
	
	
	  public void addFormatters(FormatterRegistry registry) {
	  System.out.println("inside add formater method.."); registry.addFormatter(new
	  CreditCardFormatter()); }
	 
	
	//this method is for converter
	
	/*
	 * public void addFormatters(FormatterRegistry registry) {
	 * System.out.println("inside add formater method.."); registry.addConverter(new
	 * CreditCardConverter()); registry.addConverter(new
	 * CcObejectToStringConverter()); }
	 */
	 

}

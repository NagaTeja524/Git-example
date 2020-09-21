package com.bill.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BillAppInitailizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[]= {BillAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[]= {"/"};
		return arr;
	}

}

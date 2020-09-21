package com.bill.api;

public class CreditCard {

	private Integer firstFourDigits;      //we can add credit card 3 ways 1.using formatter 2.propertyEditor 3.converter
	private Integer secondFourDigits;
	private Integer thirdFourDigits;
	private Integer lastFourDigits;

	public Integer getFirstFourDigits() {
		return firstFourDigits;
	}

	public void setFirstFourDigits(Integer firstFourDigits) {
		this.firstFourDigits = firstFourDigits;
	}

	public Integer getSecondFourDigits() {
		return secondFourDigits;
	}

	public void setSecondFourDigits(Integer secondFourDigits) {
		this.secondFourDigits = secondFourDigits;
	}

	public Integer getThirdFourDigits() {
		return thirdFourDigits;
	}

	public void setThirdFourDigits(Integer thirdFourDigits) {
		this.thirdFourDigits = thirdFourDigits;
	}

	public Integer getLastFourDigits() {
		return lastFourDigits;
	}

	public void setLastFourDigits(Integer lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}

	@Override
	public String toString() {
		return getFirstFourDigits()+"-"+getSecondFourDigits()+"-"+getThirdFourDigits()+"-"+getLastFourDigits();
	}

	
}

package com.utilities;

import java.math.BigDecimal;
import java.util.Locale;

import org.apache.commons.validator.routines.BigDecimalValidator;
import org.apache.commons.validator.routines.CurrencyValidator;
import org.openqa.selenium.WebElement;

public class CurrencyLibrary {

	public static Double getCurrencyInDouble(String currencyValue) {
		double doubleValue = 0;
		try {
			
			BigDecimalValidator validator = CurrencyValidator.getInstance();
			BigDecimal amount1 = validator.validate(currencyValue, Locale.US);
			double d = amount1.doubleValue();

			/*
			 * String doubleReadyString = string.replaceAll("[$,]", "");
			 * 
			 * doubleValue = Double.parseDouble(doubleReadyString);
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}

		return doubleValue;
	}

	public static boolean validateFieldvalueInCurrencyFormat(WebElement element) {
		boolean flag = false;
		String elementvalue="";
		try {
			if (element.getTagName().equalsIgnoreCase("input")) {
				elementvalue = element.getAttribute("value");
			} else {
				elementvalue=element.getText();
			}

			if (elementvalue.substring(0, 1).equals("$")) {

				BigDecimalValidator validator = CurrencyValidator.getInstance();
				BigDecimal amount1 = validator.validate(elementvalue, Locale.US);
				double d = amount1.doubleValue();
				if (d > 0) {

					flag = true;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

}

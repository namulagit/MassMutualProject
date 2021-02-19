package com.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.MassMutualPage1;
import com.utilities.CurrencyLibrary;
import com.utilities.WebLibrary;

public class MassMutualPage1Module extends MassMutualPage1 {

	public MassMutualPage1Module(WebDriver driver) {
		super(driver);

	}

	public boolean IsInputCurrencyValueGreaterThanZero(WebElement elemement) {

		boolean flag = false;
		try {
			String value1 = elemement.getAttribute("value");
			double currency = CurrencyLibrary.getCurrencyInDouble(value1);

			if (currency > 0) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public boolean validateTotalBalanceMatchesTheSumOfValues() {

		boolean flag = false;
		try {
			double filedvalue1 = CurrencyLibrary.getCurrencyInDouble(WebLibrary.getFieldValue(value1));
			double filedvalue2 = CurrencyLibrary.getCurrencyInDouble(WebLibrary.getFieldValue(value2));

			double filedvalue3 = CurrencyLibrary.getCurrencyInDouble(WebLibrary.getFieldValue(value3));
			double filedvalue4 = CurrencyLibrary.getCurrencyInDouble(WebLibrary.getFieldValue(value4));

			double filedvalue5 = CurrencyLibrary.getCurrencyInDouble(WebLibrary.getFieldValue(value5));
			double TotalFiledValue = CurrencyLibrary.getCurrencyInDouble(WebLibrary.getFieldValue(totalBalance));

			double sumOfFieldvalues = filedvalue1 + filedvalue2 + filedvalue3 + filedvalue4 + filedvalue5;
			if (sumOfFieldvalues == TotalFiledValue) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

}

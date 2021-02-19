package com.utilities;

import org.openqa.selenium.WebElement;

import com.base.BaseTest;

public class WebLibrary extends BaseTest {

	public static boolean isTextBoxHasValue(WebElement element) {
		boolean flag = false;
		try {

			if (element.getAttribute("value") != null && (!element.getAttribute("value").equals(" ")))

			{

				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public static String getFieldValue(WebElement element) {
		String elementValue = "";
		try {
			if (element.getTagName().equalsIgnoreCase("input")) {
				elementValue = element.getAttribute("value");
			} else {
				elementValue = element.getText();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return elementValue;
	}

}

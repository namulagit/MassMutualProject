package com.stepDefinitions;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

import org.apache.commons.validator.routines.BigDecimalValidator;
import org.apache.commons.validator.routines.CurrencyValidator;
import org.testng.Assert;

import com.base.BaseTest;
import com.modules.MassMutualPage1Module;
import com.pages.MassMutualPage1;
import com.utilities.CurrencyLibrary;
import com.utilities.WebLibrary;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class MassMutualPage1Steps extends BaseTest {
	MassMutualPage1 page1;

	@Given("I am at home page Total Balance")
	public void i_am_at_home_page_total_balance() {

		getDriver().get("https://www.exercise1.com/values");

	}

	@When("value1 is not null")
	public void value1_is_not_null() {

		page1 = new MassMutualPage1(driver);

		boolean flag = WebLibrary.isTextBoxHasValue(page1.value1);

		Assert.assertTrue(flag, "value1 TextBox value should not be null");

	}

	@Then("Value1 field value should be equal to {double}")
	public void value1_field_value_should_be_equal_to(double double1) {

		page1 = new MassMutualPage1(driver);
		double Actualvalue = CurrencyLibrary.getCurrencyInDouble(page1.value1.getAttribute("value"));
		Assert.assertEquals(Actualvalue, double1, "value1 Input field value should match with expected value");

	}

	@When("value2 is not null")
	public void value2_is_not_null() {

		page1 = new MassMutualPage1(driver);

		boolean flag = WebLibrary.isTextBoxHasValue(page1.value2);

		Assert.assertTrue(flag, "value2 TextBox value should not be null");

	}

	@Then("Value2 field value should be equal to {double}")
	public void value2_field_value_should_be_equal_to(double double1) {

		page1 = new MassMutualPage1(driver);
		double Actualvalue = CurrencyLibrary.getCurrencyInDouble(page1.value2.getAttribute("value"));
		Assert.assertEquals(Actualvalue, double1, "value2 Input field value should match with expected value");

	}

	@When("value3 is not null")
	public void value3_is_not_null() {

		boolean flag = WebLibrary.isTextBoxHasValue(page1.value3);

		Assert.assertTrue(flag, "value3 TextBox value should not be null");

	}

	@Then("Value3 field value should be equal to {double}")
	public void value3_field_value_should_be_equal_to(double double1) {

		page1 = new MassMutualPage1(driver);
		double Actualvalue = CurrencyLibrary.getCurrencyInDouble(page1.value2.getAttribute("value"));
		Assert.assertEquals(Actualvalue, double1, "value3 Input field value should match with expected value");

	}

	@When("value4 is not null")
	public void value4_is_not_null() {

		boolean flag = WebLibrary.isTextBoxHasValue(page1.value4);

		Assert.assertTrue(flag, "value4 TextBox should not be null");

	}

	@Then("Value4 field value should be equal to {double}")
	public void value4_field_value_should_be_equal_to(double double1) {

		page1 = new MassMutualPage1(driver);
		double Actualvalue = CurrencyLibrary.getCurrencyInDouble(page1.value2.getAttribute("value"));
		Assert.assertEquals(Actualvalue, double1, "value4 Input field value should match with expected value");

	}

	@When("value5 is not null")
	public void value5_is_not_null() {

		boolean flag = WebLibrary.isTextBoxHasValue(page1.value5);

		Assert.assertTrue(flag, "value5 TextBox has value:");

		System.out.println("value1_field_value_should_be_equal_to");
	}

	@Then("Value5 field value should be equal to {double}")
	public void value5_field_value_should_be_equal_to(double double1) {

		page1 = new MassMutualPage1(driver);
		double Actualvalue = CurrencyLibrary.getCurrencyInDouble(page1.value2.getAttribute("value"));
		Assert.assertEquals(Actualvalue, double1, "value5 Input field value should match with expected value");

	}

	/*** Scenario-2:verify the values on the screen are greater than zero **/
	@Then("Validate All input field values should be greater than {int}")
	public void validate_all_input_field_values_should_be_greater_than(Integer int1) {

		MassMutualPage1Module page1 = new MassMutualPage1Module(driver);

		boolean flag = page1.IsInputCurrencyValueGreaterThanZero(page1.value1);
		Assert.assertTrue(flag, "value1 currency value should be greater than zero");

		flag = page1.IsInputCurrencyValueGreaterThanZero(page1.value2);
		Assert.assertTrue(flag, "value2 currency value should be greater than zero");

		flag = page1.IsInputCurrencyValueGreaterThanZero(page1.value3);
		Assert.assertTrue(flag, "value3 currency value should be greater than zero");

		flag = page1.IsInputCurrencyValueGreaterThanZero(page1.value4);
		Assert.assertTrue(flag, "value4 currency value should be greater than zero");

		flag = page1.IsInputCurrencyValueGreaterThanZero(page1.value5);
		Assert.assertTrue(flag, "value5 currency value should be greater than zero");

	}

	/*** Scenario-3:verify the values are formatted as currencies **/

	@Then("Validate All field values are formatted as currencies")
	public void validate_all_field_values_are_formatted_as_currencies() {

		page1 = new MassMutualPage1(driver);

		boolean flag = CurrencyLibrary.validateFieldvalueInCurrencyFormat(page1.value1);
		Assert.assertEquals(flag, true, "value1 Input field should be in currency format");

		flag = CurrencyLibrary.validateFieldvalueInCurrencyFormat(page1.value2);
		Assert.assertEquals(flag, true, "value2 Input field should be in currency format");

		flag = CurrencyLibrary.validateFieldvalueInCurrencyFormat(page1.value3);
		Assert.assertEquals(flag, true, "value3 Input field should be in currency format");

		flag = CurrencyLibrary.validateFieldvalueInCurrencyFormat(page1.value4);
		Assert.assertEquals(flag, true, "value4 Input field should be in currency format");

		flag = CurrencyLibrary.validateFieldvalueInCurrencyFormat(page1.value5);
		Assert.assertEquals(flag, true, "value5 Input field should be in currency format");

		flag = CurrencyLibrary.validateFieldvalueInCurrencyFormat(page1.totalBalance);
		Assert.assertEquals(flag, true, "totalBalance field should be in currency format");

	}

	/*** Scenario-4:verify the total balance matches the sum of the values **/
	/*** verify the total balance is correct based on the values listed on the screen**/
	@Then("Validate total balance matches the sum of the values")
	public void validate_total_balance_matches_the_sum_of_the_values() {

		MassMutualPage1Module page1 = new MassMutualPage1Module(driver);

		boolean flag = page1.validateTotalBalanceMatchesTheSumOfValues();

		Assert.assertEquals(flag, true, "totalBalance should match with sum of the values on the screen");

		System.out.println("value1_field_value_should_be_equal_to");

	}

	@After
	public void cleanUp() {
		tearDown();

	}

}

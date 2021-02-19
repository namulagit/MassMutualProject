package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MassMutualPage1 {

	WebDriver driver;
	public MassMutualPage1(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,20), this);
		
		if(!driver.getTitle().equals("MassMutualPage1"))
		{
			
			throw new IllegalStateException("ths is not login page the current page is "+driver.getCurrentUrl());
		}
		
	}
	
	
	@FindBy(id="txt_val_1")
	public WebElement value1;
	
	
	@FindBy(id="txt_val_2")
	public WebElement value2;
	
	@FindBy(id="txt_val_4")
	public WebElement value3;
	
	
	@FindBy(id="txt_val_5")
	public WebElement value4;
	
	
	@FindBy(id="txt_val_6")
	public WebElement value5;
	
	@FindBy(id="txt_ttl_val")
	public WebElement  totalBalance;
	
	
	
	
	
}

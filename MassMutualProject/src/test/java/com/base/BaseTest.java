package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "./Servers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage( ).timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;
	}

	public static void tearDown() {
		driver.close();
		driver.quit();

	}

}

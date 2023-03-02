package com.Keyword_Driven_Framework.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordActions {

	public static WebDriver driver;

	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anura\\eclipse-workspace\\Keyword_Driven_Framework\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void navigateToURL() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(FrameworkConstants.URL);
	}

	public void enterEmail() {

		driver.findElement(By.id("email")).sendKeys(FrameworkConstants.Username);

	}

	public void emailPassword() {

		driver.findElement(By.id("pass")).sendKeys(FrameworkConstants.Password);

	}

	public void clickForgettonPassword() {

		driver.findElement(By.linkText("Forgotten password?")).click();

	}

	public void closeBrowser() {

		driver.close();
	}

}

package com.OrangeHrm.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends Base{
	public static void waitForElementToClick(By element) 
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
}
	public static void waitForElementToVisible(WebElement element) 
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
    }
	
	public static void validate(String actualResult, String expectedResult) throws Exception
	{
		if(actualResult.equals(expectedResult))
		{
			System.out.println("Successfully done the validation");
		}else {
		throw new Exception("Failed to verify actual and expected result : \n actualResult:" +actualResult+"\n expectedResult:"+actualResult );
		}	
	}
	
	     
}


package com.OrangeHrm.Automation;


import org.openqa.selenium.By;


public class LogIn extends Base{

	
	public void logIn(String userName, String password)
	{
		 driver.findElement(By.id("txtUsername")).sendKeys(userName);
         driver.findElement(By.id("txtPassword")).sendKeys(password);
         driver.findElement(By.id("btnLogin")).click();
	}
	

}

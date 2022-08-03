package com.testNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInTestCase extends EmpAddCode {
	WebDriver driver;

  @Test
  public void hrmlogin() throws Exception
  {
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
       driver =  new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/");
       driver.findElement(By.id("txtUsername")).sendKeys("Admin");
       driver.findElement(By.id("txtPassword")).sendKeys("admin123");
       driver.findElement(By.id("btnLogin")).click();
	  
  }
}

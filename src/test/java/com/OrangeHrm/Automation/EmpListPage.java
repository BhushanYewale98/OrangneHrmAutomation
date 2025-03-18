package com.OrangeHrm.Automation;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmpListPage extends Base {
	    
		
		public Map<String, Object> addEmp(String fName, String mName, String lName, boolean isUser, String uName, String pwd, String cnfpwd)
		
		{  
			Map<String, Object>empDetails=new HashMap<String, Object>();
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			driver.findElement(By.id("btnAdd")).click();
		   WebElement firstName1=	driver.findElement(By.id("firstName"));
		   firstName1.sendKeys(fName);
		   WebElement middleName1=	driver.findElement(By.id("middleName"));
		   middleName1.sendKeys(mName);
		   WebElement lastName1=	driver.findElement(By.id("lastName"));
		   lastName1.sendKeys(lName);
		   String employeeId = driver.findElement(By.id("employeeId")).getAttribute("value");
		   
		   // Here we stored key and value to empDetails object of Hash Map
		   // below keys will be used in search method (exm. empDetails.get("employeeId").to String())
		   
		   empDetails.put("employeeId", employeeId);
		   empDetails.put("firstName", fName);
		   empDetails.put("middleName", mName);
		   empDetails.put("lastName", lName);
		   if(isUser)
		   {
			   driver.findElement(By.id("chkLogin")).click();
			   driver.findElement(By.id("user_name")).click();
			   driver.findElement(By.id("user_password")).click();;
			   driver.findElement(By.id("re_password")).click();   
		   }
		   driver.findElement(By.id("btnSave")).click();
		   return empDetails;
		}
		
		public void searchEmp(Map<String, Object> empDetails) throws Exception
		{
			driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
			
			// Here we are searching Emp Details by using Emp Id
			
			driver.findElement(By.id("empsearch[id]")).sendKeys(empDetails.get("employeeId").toString());
			driver.findElement(By.id("searchBtn")).click();
			WebElement searchResult = driver.findElement(By.xpath("//tr[@class='odd']/td[2]/a"));
			Util.waitForElementToVisible(searchResult);
			Util.validate(searchResult.getText(), empDetails.get("employeeId").toString());
			/*
			//Here we are searching Employee by using First Name
			driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(empDetails.get("firstName").toString());
			WebElement searchFName = driver.findElement(By.xpath("//tr[@class='odd']/td[3]/a"));
			Util.waitForElementToVisible(searchFName);
			Util.validate(searchFName.getText(), empDetails.get("firstName").toString());
			
			driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(empDetails.get("lastName").toString());
			WebElement searchLName = driver.findElement(By.xpath("//tr[@class='odd']/td[4]/a"));
			Util.waitForElementToVisible(searchLName);
			Util.validate(searchLName.getText(), empDetails.get("lastName").toString());*/
			
			
			driver.findElement(By.id("searchBtn")).click(); 

		}
		
        
	}



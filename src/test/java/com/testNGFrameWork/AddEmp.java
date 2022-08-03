package com.testNGFrameWork;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class AddEmp extends LogInTestCase{
	
  @BeforeMethod
  public void beforeMethod() throws Exception
  {
	  LogInTestCase lohInTestCase = new LogInTestCase();
	  lohInTestCase.hrmlogin();
	  
  }
  
  @Test
  public void addEmp() throws Exception 
  
  {
	EmpAddCode empAddCode=new EmpAddCode();
	empAddCode.empListPage();
  }
}

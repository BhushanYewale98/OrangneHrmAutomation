package com.testNGFrameWork;
import org.testng.annotations.Test;

import com.OrangeHrm.Automation.EmpListPage;

public class EmpAddCode extends EmpListPage {
	 EmpListPage empListPage;
  @Test
  public void empListPage() {
	  
	  empListPage  = new EmpListPage();
	  empListPage.addEmp("John", "Peter", "Drucker", true, "Robert", "test123", "test123");
	  
  }
}

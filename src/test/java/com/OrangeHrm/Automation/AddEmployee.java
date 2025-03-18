package com.OrangeHrm.Automation;


	import java.util.Map;

	public class AddEmployee extends Base{

		public static void main(String[] args) throws Exception{
			Base.launchBrowser();
			LogIn loginpage = new LogIn();
			EmpListPage empListPage=new EmpListPage();
			loginpage.logIn("Admin","admin123");
			
			// Here we created variable (empDetails) of type Map<String, Object> in order to store parameters passed to addEmp method
			
			Map<String, Object> empDetails=empListPage.addEmp("Yodinath", "", "Bharade", true, "Arman", "Jonsen", "Antony");
			empListPage.searchEmp(empDetails);

		}

	}



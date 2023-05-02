package peoplegroveTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.baseLibrary;
import peoplegrovePage.Jobs;

public class jobsTest extends baseLibrary {
	
	Jobs ob;
	
	@BeforeTest
	public void getlaunchBrowser() throws Exception
	{
		getlaunchUrl();
		ob=new Jobs();
	}
	
	
	@Test(description ="To click on the Jobs", priority = 0)
	public void selectJobs() throws Exception
	{
		ob.selectByValue();
	}
	
	@Test(priority = 1)
	public void clickonjob()
	{
		ob.clickonjob();
	}
	
	@Test(priority = 2)
	public void clickonconvo()
	{
		ob.keepgoigngconvo();
	}
	
	@Test (priority = 3)
	public void sendmsg() throws Exception 
	{
		ob.sendMesseage();
	}
	
	@Test (priority = 4)
	public void actions()
	{
		ob.actionsonUser();
	}
	
	@Test  (priority = 5)
	public void verify()
	{
		ob.verify();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	

}

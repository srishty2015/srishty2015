package peoplegroveTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.baseLibrary;
import peoplegrovePage.careerPaths;

public class careerPathsTest extends baseLibrary {
     careerPaths ob;
	@BeforeTest
	public void getlaunchBrowser() throws Exception
	{
		getlaunchUrl();
		ob=new careerPaths();
	}
	
	@Test(priority = 0)
	public void clickcareerpath() throws Exception
	{
	ob.careerPath();	
	}
	
	@Test(priority = 1)
	public void clickonjobs() throws Exception
	{
	ob.clickonjobs();	
	}
	
@AfterTest
public void tearDown()
{
	driver.quit();
}
	
	
}

package peoplegrovePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.baseLibrary;

public class Jobs extends baseLibrary {

	public Jobs() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//*[@class='navListItem'])[2]")
	private WebElement Career;
	
	@FindBy (xpath = "//p[contains(text(),'Jobs')]")
	private WebElement Jobs;
	
	
	@FindBy (xpath = "//div[@class=\"company-info\"]")
	private WebElement Job1;
	
	
	@FindBy(xpath = "//*[contains(text(),'Keep the Convo Going!')]")
	private WebElement convo;
	
	@FindBy(xpath = "//div[@aria-label=\"Write a message\"]")
	private WebElement message;
	
	@FindBy(xpath = "//*[@class=\"ant-btn ant-btn-primary ant-btn-lg\"]")
	private WebElement sendbtn;
	
	@FindBy(xpath = "//*[@class=\"ant-btn btn-link\"]")
	private WebElement viewprofile;
	
	@FindBy(xpath = "//h3[text()='Bob Beier']")
	private WebElement clickonprofile;
	
	@FindBy(xpath = "//span[@class=\"ant-switch\"]")
	private WebElement clickswitch;
	
	@FindBy(xpath = "//*[@aria-label=\"Login as user Bob\"]")
	private WebElement loginAs;
	
	@FindBy(xpath = "//div[@class=\"actions\"]/button")
	private WebElement viewMessage;
	
	
	
//	public void login() throws Exception
//	{
//	try {
//		email.sendKeys("test+7@peoplegrove.com");
//		pass.sendKeys("Testing@123");
//		login.click();
//		Thread.sleep(20000);
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		System.out.println(e+"issue in login");
//	}
//}
	// After that Captcha Appeared which can't be automated.
	//So, We inserted Some time and Do it Manually and Move forward with the automation.
	
	public void selectByValue() throws Exception 
	{
	try {
		mouse_hover(Career);	
		mouse_hover(Jobs);
		Thread.sleep(200);
		Jobs.click();
	} catch (Exception e) {
		System.out.println(e+"issue in selectbyvalue");
	}
		}
	
	
	public void clickonjob()
	{
		Job1.click();
	}
	
	public void keepgoigngconvo()
	{
		convo.click();
	}

	public void sendMesseage() throws Exception 
	{
		message.sendKeys("Amit dhiman 30/04/2023. \nTotal year of experience- 3.7 years");
		Thread.sleep(200);
		sendbtn.click();
	}
	
	public void actionsonUser()
	{
		viewprofile.click();
		clickonprofile.click();
		clickswitch.click();
		loginAs.click();
		viewMessage.click();
	}
	
//	public void verify()
//	{
//		String expected="Amit dhiman 29/04/2023. \\nTotal year of experience- 3.7 years";
//		
//		
//	}
		

	
	
	
	
	

}

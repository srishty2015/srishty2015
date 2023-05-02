package peoplegrovePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.baseLibrary;

public class Jobs extends baseLibrary {

	public Jobs() {
		PageFactory.initElements(driver, this);
	}
	
	public static String msg ="Amit Dhiman 1/05/2023. \nTotal year of experience- 3.7 years";
	
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
	
	@FindBy(xpath = "//main[@id]//button[@class=\"ant-btn ant-btn-primary ant-btn-lg\"]")
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
		message.sendKeys(msg);
		Thread.sleep(200);
		elementtobeClickable(sendbtn, 10);
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
	
	public void verify()
	{
		List<WebElement> msgs= driver.findElements(By.xpath("//div[@class='rich-text ql-editor']"));
		String str =  msgs.get(msgs.size()-1).getText();
		System.out.println("Test");
		System.out.println(str);
	
		
		boolean assertionResult = false;
		try {
		    Assert.assertEquals(msg, str);
		    assertionResult = true;
		} catch (AssertionError e) {
		    assertionResult = false;
		}
		String resultString = String.valueOf(assertionResult);
		System.out.println(resultString);
	
	
	}
		

	
	
	
	
	

}

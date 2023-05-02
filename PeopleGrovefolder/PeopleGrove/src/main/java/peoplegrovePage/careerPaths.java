package peoplegrovePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.baseLibrary;

public class careerPaths extends baseLibrary {
	
	public careerPaths()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='navListItem'])[2]")
	private WebElement career;
	
	@FindBy(xpath = "//p[contains(text(),'Career Paths')]")
	private WebElement careerPaths;
	
	@FindBy(xpath = "//div[contains(text(),'Senior Product Managers')]")
	private WebElement job1 ;
	
	@FindBy(xpath = "//div[@class=\"breadcrumb-n-career-head\"]//span[contains(text(),'Career Paths')]")
	private WebElement backtoHome;
	
	@FindBy(xpath = "//div[contains(text(),'Test Engineer in SDET')]")
	private WebElement job2;
	
	@FindBy(xpath = "//div[contains(text(),'Krittikaa Testing')]")
	private WebElement job3;
	
	@FindBy(xpath = "//div[@class=\"navListEl\"]/button[contains(text(),'Home')]")
	private WebElement home;
	
	@FindBy(xpath = "//main[@id=\"main\"]/div/div[1]/div[4]/div[1]/a")
	private WebElement careerStage;
	
	
	public void careerPath() throws InterruptedException
	{
		mouse_hover(career);	
		mouse_hover(careerPaths);
		Thread.sleep(200);
		careerPaths.click();	
	}
	
	public void clickJob1()
	{
	job1.click();
	backtoHome.click();
	}
	
	
	
	
	

}

package baseLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import applicationUtility.application_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import waitUtility.waitUtility;

public class baseLibrary implements application_Utility, waitUtility {
	
	public static WebDriver driver;
	
	public void getlaunchUrl() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://basecopy5.staging.pg-test.com/auth/sign-in?postLoginRedirect=/hub/newhub503949860203/home-v3");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("test+7@peoplegrove.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//*[@form=\"auth-standard-login-form\"]")).click();
		Thread.sleep(20000);
		// After that Captcha Appeared which can't be automated.
		//So, We inserted Some time and Do it Manually and Move forward with the automation.
	}

	public void selectByIndex(WebElement ele, int index) {
		Select sel=new Select(ele);
		sel.selectByIndex(index);
		
	}

	

	public void mouse_hover(WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
	}

	public void mouse_hover_click(WebElement ele, String value) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.linkText(value));
		
	}

	public void selectByvalue(String value, WebElement ele) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(value);
		
	}

	public void elementtobeClickable(WebElement ele, int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

}

package peoplegrovePage;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.baseLibrary;

public class careerPaths extends baseLibrary {

	public careerPaths() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class=\"navListItem\"]//*[contains(text(),'Career')]")
	private WebElement career;

	@FindBy(xpath = "//p[contains(text(),'Career Paths')]")
	private WebElement careerPaths;

	@FindBy(xpath = "//div[@class=\"breadcrumb-n-career-head\"]//span[contains(text(),'Career Paths')]")
	private WebElement backtoCareerPath;

	@FindBy(xpath = "//div[@class=\"navListEl\"]/button[contains(text(),'Home')]")
	private WebElement home;

	@FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[2]/div[1]/a")
	private WebElement careerStage;

	@FindBy(xpath = "//*[@value=\"108\"]")
	private WebElement radioBtn;

	@FindBy(xpath = " //*[text()=\"Skip\"]")
	private WebElement skip;

	@FindBy(xpath = "//div[@class=\"Modal-module_footer__4-TiA\"]//button[text()='Update']")
	private WebElement update;

	public void careerPath() throws InterruptedException {
		mouse_hover(career);
		mouse_hover(careerPaths);
		Thread.sleep(200);
		careerPaths.click();
	}

	public void clickonjobs() throws Exception {
		boolean flag = false;


		
		List<String> ifyTileText = new ArrayList<String>();
		for (int i=1;i<=3;i++) {
			WebElement ele = driver.findElement(By.xpath("(//div[@aria-label='Inspiration for you']//div[@class='CardMeta-module_title__Pec8b Card-module_metaTitle__kce94'])["+i+"]"));
			ifyTileText.add(ele.getText());
			ele.click();
			Thread.sleep(3000);
			driver.navigate().back();
		}
		home.click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		careerStage.click();
		Thread.sleep(200);

		if (radioBtn.isSelected()) {
			Thread.sleep(200);
			skip.click();
		} else {
			radioBtn.click();
			update.click();

		}
		
		
		List<WebElement> rcbTiles = driver.findElements(By.xpath(
				"//div[contains(@aria-label,'Recently viewed careers')]//div[@class='CardMeta-module_title__Pec8b Card-module_metaTitle__kce94']"));

		for(int i=ifyTileText.size()-1;i>=0;i--) {
			for (WebElement element : rcbTiles) {
				String s = element.getText();
				if(s.equals(ifyTileText.get(i))) {
					flag = true;
				}
				i--;
			}			
		}
		
		Assert.assertTrue(flag);
		
		

	}

}

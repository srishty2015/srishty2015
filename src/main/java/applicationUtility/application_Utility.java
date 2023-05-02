package applicationUtility;

import org.openqa.selenium.WebElement;

public interface application_Utility {
	
	
	public void selectByvalue(String value, WebElement ele);
	public void selectByIndex(WebElement ele, int index);
	
	public void mouse_hover(WebElement ele);
	public void mouse_hover_click(WebElement ele, String value);
}

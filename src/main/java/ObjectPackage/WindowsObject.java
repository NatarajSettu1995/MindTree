package ObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class WindowsObject extends BaseClass {

	public WindowsObject() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a")
	public WebElement Home;
	public String ParentWindow=driver.getWindowHandle();//current parrent window
	@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[2]/div/div/button")
     public WebElement Button1;
}


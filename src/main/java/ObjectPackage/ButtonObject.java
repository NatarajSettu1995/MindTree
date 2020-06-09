package ObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class ButtonObject extends BaseClass{

	public ButtonObject() {
		PageFactory.initElements(driver, this);
		
	}

	String label="//preceding::label[1]";
	@FindBy(partialLinkText="Button")
	private WebElement EntButton;
	@FindBy(xpath="//button[@id='color']")
	private WebElement Button;
	@FindBy(xpath="//a[contains(@href,'home')]")
	private WebElement Home;
	
	public WebElement EntryButton()
	{
		return EntButton;
		
	}
	public WebElement Button()
	{
		return Button;
		
	}

public WebElement GotoHome()
{
	return Home;
	
}
}

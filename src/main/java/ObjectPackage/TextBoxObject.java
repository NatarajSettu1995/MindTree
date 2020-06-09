package ObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class TextBoxObject extends BaseClass{

	public TextBoxObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul[@class='wp-categories-list']/li[1]/a")
	private WebElement Button;
   @FindBy(xpath="//input[@id='email']")
	private WebElement Text;
	private WebElement email;
	
	private String Name="Hai dear";
	
	@FindBy(xpath=" //input[@disabled='true']")
	private WebElement DisBox;
	@FindBy(xpath="//li[@id='text-2']/a")
	private WebElement Home;
	public WebElement Button()
	{
		
		return Button;
		
	}
	
	public WebElement Text()
	{
		return Text;
		
	}
	
	public String Name()
	{
		return Name;
		
	}
public WebElement DisBox()
{
	return DisBox;
	
}
public WebElement Home()
{
	return Home;
	
}
}

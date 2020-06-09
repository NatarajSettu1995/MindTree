package ObjectPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class iframeObject extends BaseClass {

	public iframeObject() {
		
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[contains(@href,'frame')]")
	private WebElement iframeHome;
	
	public WebElement iframeHome()
	{
		return iframeHome;
		
	}
	
	@FindBy(xpath="//*[@id=\'Click\']")
	private WebElement iframe;
	public WebElement iframe()
	{
		return iframe;
		
	}
	
	@FindBy(xpath="//button[@id='Click1']")
	private WebElement Nestediframe;
	public WebElement Nestediframe()
	{
		return Nestediframe;
		
	}
	
@FindBys(@FindBy(tagName="iframe"))
private List<WebElement> count;
public List<WebElement> Cout()
{
	return count;
	
}
@FindBys(@FindBy(xpath="//*[@id=\"text-2\"]/a"))
private WebElement home;
public WebElement Home()
{
	return home;
	
}



}

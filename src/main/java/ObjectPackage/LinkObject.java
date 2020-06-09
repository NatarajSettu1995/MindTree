package ObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class LinkObject extends BaseClass {

	public LinkObject() {
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(xpath="//*[@id=\'post-153\']/div[2]/div/ul/li[3]/a")
	private WebElement LinkPage;
	@FindBy(partialLinkText="supposed")
	private WebElement link;
	@FindBy(linkText="Verify am I broken?")
	private WebElement link2;
	@FindBy(xpath="//*[@id=\'text-2\']/a")
	private WebElement Homepage;
	@FindBy(xpath="//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a")
	private WebElement HomeImage;
	//@FindBy(xpath="//*[@id=\'contentblock\']/section/div[2]/div/div/img")
	@FindBy(xpath="//*[@id=\'contentblock\']/section/div[1]/div/div/img")
	private WebElement Image;
	//*[@id="contentblock"]/section/div[1]/div/div/img
	
	public WebElement LinkPage()
	{
		return LinkPage;
		
	}
	public WebElement link()
	{
		return link;
		
	}
	public WebElement link2()
	{
		return link2;
		
	}
	public WebElement HomePage()
	{
		return Homepage;
		
	}
	public WebElement ImageHome()
	{
		return HomeImage;
		
	}
	public WebElement Image()
	{
		return Image;
		
	}
	
}

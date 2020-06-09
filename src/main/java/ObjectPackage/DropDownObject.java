package ObjectPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class DropDownObject extends BaseClass {

	public DropDownObject() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[contains(@href,'Drop')]")
	private WebElement Button;
	
	@FindBy(xpath="//select[@id='dropdown1']")
	private WebElement DropDownBox;
	
	@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[6]/select")
    private WebElement MultiSelect;
	private int index =1;
	private int index2 =2;
	private int index3 =3;
	@FindBys(@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[6]/select//option"))
	private List<WebElement> Wselect;
	@FindBy(xpath="//a[contains(@href,'home')]")
	private WebElement Home;
	public WebElement Home()
	{
		return Home;
		
	}
	
	public List<WebElement> WSelect()
	{
		return Wselect;
		
	}
	
	public WebElement MultiSelect()
	{
		return MultiSelect;
		
	}
	
	public WebElement Button()
	{
		return Button;
		
	}

	
	public WebElement DropDown()
	{
		return DropDownBox;
		
	}
	public int index()
	{
		return index;
		
	}
	public int index2()
	{
		return index2;
		
	}
	public int index3()
	{
		return index3;
		
	}	

	

}

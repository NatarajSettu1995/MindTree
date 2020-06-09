package BasePackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public BaseClass() {
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataraj\\Desktop\\software\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://leafground.com/");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}

	public void TextBox(WebElement Location,String Name)
	{
		if(Location.isEnabled())
		{
		Location.sendKeys(Name);
		System.out.println("Box Entered Name="+Location.getAttribute("value"));
		
		}
		else
		{
			System.out.println("Box is disable and Not a writteable");
		}
	}
	
	public void Button_Detail(WebElement Location)
	{
		System.out.println("*******Button Color********");
		String ButtonColor=Location.getCssValue("background-color");
		System.out.println("Button Color ="+ButtonColor);
		System.out.println("*******Button Text Font********");
		String ButtonFont=Location.getCssValue("font-family");
		System.out.println("Button Text Font ="+ButtonFont);
		System.out.println("********Text in Button********");
		System.out.println("Button Text is "+ "\"" +Location.getText() +"\"");
		System.out.println("*********Button Questions**********");
		WebElement ques=Location.findElement(By.xpath(".//preceding::label[1]"));
		System.out.println("Question of label:"+ques.getText());
		System.out.println("*****************Button X axis & Y axis***************");
		Point position=Location.getLocation();
		System.out.println("X value of the button in Application :"+position.getX());
		System.out.println("Y value of the button in Application :"+position.getY());
		System.out.println("****************Button Hight(h) and Width(w)***************");
		System.out.println("Width and Hight of  the button"+Location.getSize());
		System.out.println("Width of the Button:"+Location.getSize().getWidth());
		System.out.println("hight of the Button"+Location.getSize().getHeight());
			
	}
	public void DropDown(WebElement Location,int index,int index2,int index3 )
	{
		Select otran=new Select(Location);
	
		otran.selectByIndex(index);
		otran.selectByIndex(index2);
		otran.selectByIndex(index3);
		
		
	List<WebElement> AllOption=otran.getOptions();
	System.out.println("All Option From Drop Down");
	for(WebElement option:AllOption)
	{
		System.out.println(option.getText());
	}
	
/*System.out.println("Selected value from Single Drop Down");		
WebElement SigleDrobDown=otran.getFirstSelectedOption();
System.out.println("value:"+SigleDrobDown.getText());*/
otran.deselectByIndex(index3);
System.out.println("All Selected value from Muti Drop Down");
List<WebElement> MultiLevel=otran.getAllSelectedOptions();
for(WebElement multi:MultiLevel)
{
	System.out.println(multi.getText());
}
}


public void DropDownWithoutUsing_Select(List<WebElement>Location)
{
Actions action=new Actions(driver); 
//action.keyDown(Keys.CONTROL).click(Location.get(1)).click(Location.get(2)).click(Location.get(3)).build().perform();

action.clickAndHold(Location.get(1));
action.build().perform();
}
public void Link(WebElement Location)
{
System.out.println("***********Link Color**************");
	System.out.println("Link Color="+Location.getCssValue("color"));
	System.out.println("*************Where to go*************");
	System.out.println("Where to go="+Location.getAttribute("href"));
	System.out.println("**************How many link presented in ************");
	List<WebElement> TotallLink=driver.findElements(By.tagName("a"));
	System.out.println("Totall no of links="+TotallLink.size());
	System.out.println("*********Totall links************");
	for(WebElement Links:TotallLink)
	{
		System.out.println(Links.getAttribute("href"));
	}
	
	System.out.println("**********This is Broken link or not*********");
	Location.click();
	if(driver.getTitle().contains("404"))
	{
		System.out.println("Title is::"+driver.getTitle());
		System.out.println("Link is Broken");
	}
	else
	{
		System.out.println("Link is not Broken");
		System.out.println("Title is::"+driver.getTitle());
	}
	

}

public void Image(WebElement Location)
{
	System.out.println("NaturalWidth::"+Location.getAttribute("naturalWidth"));
	System.out.println("Outer HTML::"+Location.getAttribute("outerHTML"));
	if(Location.getAttribute("naturalWidth").equals("0"))
	{
		System.out.println("Image is  broken");	
	}
	else
	{
		System.out.println("Image is not broken");
	}
}

public void Alert()
{
org.openqa.selenium.Alert alert=driver.switchTo().alert();	
alert.accept();
alert.dismiss();
String Text=alert.getText();
alert.sendKeys("Nataraj");
}
public void iframeDetails(String id,int value)
{
	
	if(id!=null)
	{
		driver.switchTo().frame(id);
	}
	else
	{
		driver.switchTo().frame(value);
	}
}

public void iframeRelease()
{
	driver.switchTo().defaultContent();
}

public void iframeDetails(String id)
{
	
	
		driver.switchTo().frame(id);
	
}
public void iframeDetails(int id)
{
	
	
		driver.switchTo().frame(id);
	
}
public void ListofCount(List<WebElement> list)
{
	System.out.println("Totall Count:"+list.size());
}

public void Windows(int value)
{
	Set<String> Windows=driver.getWindowHandles();
	int Count=0;
	for(String Name:Windows)
	{
		Count++;
	driver.switchTo().window(Name);
	GetTitle();
	if(value==Count)
	{
		break;
	}
	
	}
}
public void WindowsRelease(String Name)
{
	driver.switchTo().window(Name);
	
}
public void GetTitle()
{
	System.out.println((driver.getTitle()));
}


}


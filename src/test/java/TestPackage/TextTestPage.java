package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ObjectPackage.TextBoxObject;

public class TextTestPage {
	TextBoxObject t;
	BaseClass b;
	public TextTestPage()
	{
	t=new TextBoxObject();
	b=new BaseClass();
	}
	
	@Test
	public void Text()
	{
	t.Button().click();
	b.TextBox(t.Text(),t.Name());
	t.Home().click();
	
		
	}
	
}

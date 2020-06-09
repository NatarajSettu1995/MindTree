package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ObjectPackage.LinkObject;

public class LinkTestPage {

	LinkObject l;
	BaseClass b;
	
	public LinkTestPage() {
		l=new LinkObject();
		b=new BaseClass();
	}

	@Test
	public void Link_Details()
	{
		l.LinkPage().click();
		b.Link(l.link());
		l.HomePage().click();
		l.ImageHome().click();
	//	b.Image(l.Image());
		//l.HomePage().click();
		
		
	}
	
}

package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ObjectPackage.iframeObject;

public class iframeTestPage {
BaseClass b;
iframeObject i;

	public iframeTestPage() {
		b=new BaseClass();
		i= new iframeObject();
	}

	@Test
	public void iframe_Details()
	{
		i.iframeHome().click();
		b.iframeDetails(0);
		i.iframe().click();
		b.iframeRelease();
		b.iframeDetails(1);
		b.ListofCount(i.Cout());
		b.iframeDetails("frame2");
	i.Nestediframe().click();
		b.iframeRelease();
		b.ListofCount(i.Cout());
		i.Home().click();
		
	
	}
	
}

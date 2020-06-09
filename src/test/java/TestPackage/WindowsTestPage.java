package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ObjectPackage.WindowsObject;

public class WindowsTestPage {

	BaseClass b;
	WindowsObject w;
	
	public WindowsTestPage() {
		
	b=new BaseClass();
	w=new WindowsObject();
	
	}
	
	@Test
	public void windows()
	{
		w.Home.click();
		w.Button1.click();
		b.Windows(3);
		b.WindowsRelease(w.ParentWindow);
		b.GetTitle();
		
	}

}

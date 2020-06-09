package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ObjectPackage.ButtonObject;

public class ButtonTestPage {
BaseClass b;
ButtonObject bt;
	public ButtonTestPage() {
		b=new BaseClass();
		bt=new ButtonObject();
	}

	@Test
	public void Button()
	{
		bt.EntryButton().click();
		b.Button_Detail(bt.Button());
		bt.GotoHome().click();
	}
	
}

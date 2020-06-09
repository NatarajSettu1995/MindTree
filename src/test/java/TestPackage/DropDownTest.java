package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ObjectPackage.DropDownObject;

public class DropDownTest {

	BaseClass b;
	DropDownObject d;                    /*Created argument to Drobdown object page*/
	
	public DropDownTest() {
		
		b=new BaseClass();
		d=new 	DropDownObject();
		
		
	}

	
	@Test
	public void DropDown()
	{
		d.Button().click();
		//b.DropDown(d.DropDown(), d.index(),d.index2(),d.index3());
		//b.DropDown(d.MultiSelect(), d.index(),d.index2(),d.index3());
		//b.TextBox(d.DropDown(), "Selenium");
	b.DropDownWithoutUsing_Select(d.WSelect());
d.Home().click();
		
	}
}
package Test;

import org.testng.annotations.Test;

import Page.Selection;

public class Element_Selection extends BaseClass {
	
	@Test(enabled=true)
	
	public void Test_Element() {
		logger.info("Selecting a homepage element");
		Selection obj=new Selection(driver);
		obj.Select_Element();
		
	}
	@Test(enabled=true)
	public void Test_Add_To_Cart() {
		logger.info("Selecting an element In Top Offers Category");
		Selection obj=new Selection(driver);
		obj.Select_TopElement() ;
		obj.Item_Add_To_Cart();
	}
	
}

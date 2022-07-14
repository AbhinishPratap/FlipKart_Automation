package Test;

import org.testng.annotations.Test;

import Page.Flipcart;

public class Fashion extends BaseClass {
	
	@Test(enabled=true)
	
	public void fashion() {
		logger.info("Selecting a fashion category ");
		Flipcart obj = new Flipcart(driver);
		obj.fashion();
		obj.Fashion_Element();
		//driver.close();
	}
	@Test(enabled=true)
	public void Electronics_Item() {
		logger.info("selecting an electronic item ");
		Flipcart obj = new Flipcart(driver);
		obj.Elec_Items();
		obj.Item_Selection();
	}
	@Test(enabled=true)
	public void Home_Test() {
		logger.info("Selecting an item from home category");
		Flipcart obj = new Flipcart(driver);
		obj.HomeElement();
		obj.select_HomeItem();
		
	}
	@Test(enabled=true)
	public void Other_Categories() {
		logger.info("selecting an item from beauty, toys & More");
		Flipcart obj = new Flipcart(driver);
		obj.other_Category();
		obj.sports_Selection();
		
	}
	

}

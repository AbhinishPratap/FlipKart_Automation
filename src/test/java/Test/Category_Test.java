package Test;

import org.testng.annotations.Test;

import Page.Category_Selection;

public class Category_Test extends BaseClass {
	@Test(enabled=true)
	public void Categories() {
		logger.info("Selecting a category");
		Category_Selection obj=new Category_Selection(driver);
		
		obj.Select_Categories();
		obj.Select_Brand();
	}
	@Test(enabled=true)
	public void Mobile_Category() {
		logger.info("Selecting a mobile category");
		Category_Selection obj=new Category_Selection(driver);
		
		obj.Categories();
		}
	@Test(enabled=true)
	public void Appliance_Categories() {
		logger.info("Selecting an appliance category");
		Category_Selection obj=new Category_Selection(driver);
		obj.Appliance_Category();
	}
}

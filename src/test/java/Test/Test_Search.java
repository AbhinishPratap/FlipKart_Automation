package Test;

import org.testng.annotations.Test;

import Page.Excel;
import Page.Search;

public class Test_Search extends BaseClass{
	Excel object =new Excel();
	@Test(priority=1,enabled=true)
	public void Valid_Search_Test()  {
		logger.info("Here we are searching Mobile in search box");
		Search obj=new Search(driver);
		obj.search(object.getCellData(1, 2));
		
	}
	@Test(priority=2,enabled=true)
	public void InValid_Search_Test()  {
		logger.info("Here we are doing an invalid search");
		Search obj=new Search(driver);
		obj.search(object.getCellData(1, 3));
		
	}
	@Test(priority=3,enabled=true)
	public void Blank_Search_Test(){
		logger.info("here we are leaving the search box blank only providing space");
		Search obj=new Search(driver);
		obj.search(" ");
	
	}
}

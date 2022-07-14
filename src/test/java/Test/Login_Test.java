package Test;

import java.sql.Time;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Excel;
import Page.Login;

public class Login_Test extends BaseClass {
Excel object =new Excel();

	@Test(priority=1,enabled=true)
	public void ValidLoginTest() throws InterruptedException {
		logger.info("Valid Login Test");
		Login obj=new Login(driver);
		obj.Enter_Email(object.getCellData(1, 2));
		
		obj.password(object.getCellData(1, 3));
		obj.Submit_button();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	@Test(priority=2,enabled=true)
	public void InValidLoginTest()  {
		logger.info("Invalid Login Test");
		Login obj=new Login(driver);
		obj.Enter_Email(object.getCellData(1, 4));
		obj.password(object.getCellData(1, 5));
		obj.Submit_button();
		
		Assert.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	@Test(priority=5,enabled=true)
	public void BlankCredentials()  {
		logger.info("putting blank in login credentials");
		Login obj=new Login(driver);
		obj.Enter_Email("");
		obj.password("");
		obj.Submit_button();
		Assert.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	@Test(priority=3,enabled=true)
	public void IncorrectPassword() {
		logger.info("Providing incorrect password in login credentials ");
		Login obj=new Login(driver);
		obj.Enter_Email(object.getCellData(1, 2));
		obj.password(object.getCellData(1, 6));
		obj.Submit_button();
		Assert.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	@Test(priority=4,enabled=true)
	public void IncorrectEmailId() {
		logger.info("Providing an incorrect mail id in login credentials");
		Login obj=new Login(driver);
		obj.Enter_Email(object.getCellData(1, 7));
		obj.password(object.getCellData(1, 5));
		obj.Submit_button();
		Assert.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
}

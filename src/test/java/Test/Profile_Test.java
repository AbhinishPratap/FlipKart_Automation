package Test;

import org.testng.annotations.Test;

import Page.Excel;
import Page.Login;
import Page.Profile;

public class Profile_Test extends BaseClass {
	Excel object =new Excel();
	@Test(enabled=true)
	public void Prof_test() throws InterruptedException {
		logger.info("Here we are selecting my profile in Profile category");
		Profile obj = new Profile(driver);
		
		Login obj1=new Login(driver);
		
		obj1.Enter_Email(object.getCellData(1, 2));
		//System.out.println("");
		obj1.password(object.getCellData(1, 3));
		obj1.Submit_button();
		
		obj.Click_MyProfile();
		//obj.
	}
}

package Test;

import org.testng.annotations.Test;

import Page.Footer;

public class SocialMedia_Test extends BaseClass {
	@Test(enabled=true)
	public void FaceBook() {
		logger.info("Here we are connecting to the facebook ");
		Footer obj=new Footer(driver);
		obj.facebook_Click();
	}
	@Test(enabled=true)
	public void Youtube() {
		logger.info("Here we are connecting to the Youtube");
		Footer obj=new Footer(driver);
		obj.pop_up();
	}
	@Test(enabled=true)
	public void pop_Up() {
		logger.info("Here we are solving the pop ups");
		Footer obj=new Footer(driver);
		obj.youtube_Click();
	}

}

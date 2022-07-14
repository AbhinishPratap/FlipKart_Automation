package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
public class takeScreenshot {
	public static String captureScreenshot(WebDriver driver , String testname) throws IOException {
		String  imagepath = System.getProperty("user.dir")+"./FailedScreenshot/"+testname+".jpg";

		//String imagepath ="./FailedScreenshot/"+testname+".jpg";

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(imagepath));
		
		return imagepath;
	}

}

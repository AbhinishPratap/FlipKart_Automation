package Test;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utilities.takeScreenshot;


public class BaseClass  {



	static WebDriver driver;
	public static File file;
	public static Properties prop;
	public static FileInputStream fis;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	static {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "./Resources/log4j2.xml";

		Configurator.initialize(null, log4jConfigFile);
	}
	public static Logger logger = LogManager.getLogger(BaseClass.class.getName());
	
	static {

		try {
			file = new File("./Resources/confiq.Properties");
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	
	
	
	@BeforeMethod
	public static void initializedriver() {
		String browser_name = prop.getProperty("browser");

		System.out.println(browser_name);

		if (browser_name.equals("chrome")) {

			System.setProperty(prop.getProperty("ChromeDriver"), prop.getProperty("ChromePath"));

			

		        //driver = new ChromeDriver();
		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("window-size= 1920, 1080");
		        options.addArguments("--headless");
		        driver = new ChromeDriver(options);
	
		    }

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		
		if (browser_name.equals("edge")) {

			System.setProperty(prop.getProperty("driverPath"), prop.getProperty("Ms_path"));

			//driver = new EdgeDriver();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
		
		if (browser_name.equals("firefox")) {

			System.setProperty(prop.getProperty("f_driverPath"), prop.getProperty("firefoxPath"));

			//driver = new FirefoxDriver();
			driver.manage().window().fullscreen();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
		        FirefoxOptions options = new FirefoxOptions();
		        options.addArguments("window-size= 1920, 1080");
		        options.addArguments("--headless");
		        driver = new FirefoxDriver(options);
	
		        }

}
		
	@BeforeSuite
	public  void setReports() {
		extent = new ExtentReports("./Reports/ExtentReport.html");
	}
	@AfterSuite
	public void endReport() {
		extent.flush();
		extent.close();
	}

	@BeforeMethod
	public static void openurl() {
		driver.get(prop.getProperty("Url"));

	}
	@BeforeMethod
	public void startTest(Method name) {
		String testname = name.getName();
		extentTest = extent.startTest(testname);
	}


	@AfterMethod
	public void atestCaseResult(ITestResult result) throws IOException {
		if(result.getStatus() ==ITestResult.FAILURE) {
			String imagepath=takeScreenshot.captureScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(imagepath));
		}
		else {
			if(result.getStatus() == ITestResult.SUCCESS) {
				extentTest.log(LogStatus.PASS, "Test case passed successfully");			
			}}
		
		//driver.close();
	
		
		
	}
	
	@AfterMethod
	public void endTest() {
		extent.endTest(extentTest);
	}

	@AfterMethod
	public static void testClose() {
		driver.close();
	}

}



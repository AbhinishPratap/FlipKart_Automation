package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Search {
WebDriver driver;
	
	
	public Search(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@FindBy(how= How.XPATH, using = "//button[contains(text(),'✕')]")
	public WebElement Cross;
	@FindBy(how= How.XPATH, using = "//input[@title='Search for products, brands and more']")
	public WebElement Search_Product;
	@FindBy(how= How.XPATH, using = "//button[@type='submit']//*[name()='svg']")
	public WebElement Submit_Button;
	public void search(String product) {
		Cross.click();
		Search_Product.sendKeys(product);
		Submit_Button.click();
	}
}

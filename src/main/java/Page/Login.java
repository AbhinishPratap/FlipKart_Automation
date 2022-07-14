package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login {
	WebDriver driver;
	
	
	public Login(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	@FindBy(how= How.XPATH, using = "//input[@class='_2IX_2- VJZDxU']")
	public WebElement login ;
	@FindBy(how= How.XPATH, using = "//input[@type='password']")
	public WebElement Pass;
	@FindBy(how= How.XPATH, using = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	public WebElement Submit;
	
	public void Enter_Email(String email) {
		login.sendKeys(email);
		
		
//		login.click();
	}
	public void password(String pass) {
		Pass.sendKeys(pass);
	}
	public void Submit_button() {
		Submit.click();
	}
}

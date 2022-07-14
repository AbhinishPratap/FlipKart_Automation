package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Footer {
	WebDriver driver;
	
	
	public Footer(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	@FindBy(how= How.XPATH, using = "//button[contains(text(),'✕')]")
	public WebElement Cross;
	
	@FindBy(how = How.XPATH, using = "//button[@class='_2KpZ6l _2doB4z']")
	public WebElement popup;

	@FindBy(how = How.XPATH, using = "//a[text()='Facebook']")
	public WebElement facebook;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/footer[1]/div[1]/div[3]/div[1]/div[4]/a[3]")
	public WebElement youtube;

	public void pop_up() {

		popup.click();
	}

	public void facebook_Click() {
		Cross.click();
		facebook.click();
	}

	public void youtube_Click() {
		Cross.click();
		youtube.click();
	}
}


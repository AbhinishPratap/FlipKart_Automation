package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	WebDriver driver;
	Actions action;

	public Profile(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Abhinish')]")
    private WebElement MyAccount;





@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]")
private WebElement MyProfile;   

    
    public void Click_MyProfile() throws InterruptedException
    {    
       
        
        action.moveToElement(MyAccount).perform();
        action.moveToElement(MyProfile).perform();
        MyProfile.click();

    }
}

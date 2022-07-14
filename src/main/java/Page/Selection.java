package Page;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Selection {
	
WebDriver driver;
	
	
	public Selection(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@FindBy(how= How.XPATH, using = "//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
	public WebElement Element;
	@FindBy(how= How.XPATH, using = "//button[contains(text(),'✕')]")
	public WebElement Cross;
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
	public WebElement Top_Offers;
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
	public WebElement Select_Categories;
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]")
	public WebElement Select_Item;
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")
	public WebElement Add_To_Cart;
//	@FindBy(how= How.XPATH, using = "")
	
	public void Select_TopElement() {
		Cross.click();
		Top_Offers.click();
		Select_Categories.click();
		
		
		}
	public void Item_Add_To_Cart() {
		Select_Item.click();
		String mainWindowHandle = driver.getWindowHandle();
		 
		Set<String> handles = driver.getWindowHandles();
		
		System.out.println("Length of window "+ handles.size());
		
		for(String page :handles) {
			
		
			if(!page.contains(mainWindowHandle)) {
				
			
				driver.switchTo().window(page);
				
				
				
			}
			else {
				driver.switchTo().window(mainWindowHandle).close();
			}
		}
		Add_To_Cart.click();
		
	}
	public void Select_Element() {
		Cross.click();
		Element.click();
	}
}

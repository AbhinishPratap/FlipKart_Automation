package Page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Category_Selection {
WebDriver driver;
	
	
	public Category_Selection(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	@FindBy(how= How.XPATH, using = "//button[contains(text(),'✕')]")
	public WebElement Cross;
	@FindBy(how= How.XPATH, using = "//img[@alt='Mobiles']")
	public WebElement Category;
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[5]/div[1]/div[1]/a[1]/div[1]/img[2]")
	public WebElement Choose_Brand;
	
//	Here we are choosing Mobile Category
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/div[1]/div[1]/img[1]")
	public WebElement Mobiles;
	
//	Here we are selecting a mobile brand
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[13]/div[1]/div[2]/a[1]/div[1]/img[2]")
	public WebElement MobileSelection;
	
//	Here we are choosing mobile item
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]")
	public WebElement MobileItem;
//	Here we are adding an item to the cart
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")
	public WebElement CartButton;
	
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/a[1]/div[1]/div[1]/img[1]")
	public WebElement Appliances;
//	Here we are choosing an item like television 
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/a[1]/div[1]/div[1]/img[2]")
	public WebElement Television;
//	Selecting an item 
	@FindBy(how= How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]")
	public WebElement Appliance_Item;
	
	public void Appliance_Category() {
		Cross.click();
		Appliances.click();
		Television.click();
		Appliance_Item.click();
		//System.out.println(driver.getTitle()+" : Appliance Category");
		Assert.assertEquals(driver.getTitle(),"Buy Products Online at Best Price in India - All Categories | Flipkart.com");
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
	}
	

	public void Categories() {
		Cross.click();
		Mobiles.click();
		MobileSelection.click();
		MobileItem.click();
		
		
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
		CartButton.click();
	}
	
	public void Select_Categories() {
		Cross.click();
		Category.click();
		Assert.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
		System.out.println(driver.getTitle()+" : Select Categories");
	}
	public void Select_Brand() {
		Choose_Brand.click();
		
		System.out.println(driver.getTitle()+" : Choose Brand");
	}
}

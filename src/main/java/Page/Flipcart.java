package Page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Flipcart {
	WebDriver driver;
	Actions action;

	public Flipcart(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	public WebElement Cross;
	
//	Here we are going to choose fashion category
	@FindBy(how = How.XPATH, using = "//img[@alt='Fashion']")
	public WebElement Fashion;
	
//  in Fashion category we are choosing men footwear	
	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[5]")
	public WebElement menFootwear;
	
//	Here we are choosing footwear category
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/a[6]")
	public WebElement Formal;
	
//	Here we are choosing an item
	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	public WebElement Shoe;
	
//	Here we are choosing an Electronics Category
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[1]/div[1]/img[1]")
	public WebElement Electronics;
	
//	Here we are choosing electronich item
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[7]")
	public WebElement Laptop;
	
//	Here we are choosing usb item
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/a[7]")
	public WebElement Usb;
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/a[2]")
	public WebElement Usb_Item;
	
//	Here we are in the home Category
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[1]/div[1]/img[1]")
	public WebElement Home;
	
//	Here we are choosing decorative part
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[6]")
	public WebElement home_Decor;
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/a[6]")
	public WebElement Assesories;
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/a[2]")
	public WebElement Home_Element;
	
//	Here we are in the Beauty,toys and more category
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]/a[1]/div[1]")
	public WebElement otherItems;
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[7]")
	public WebElement Sports;
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/a[2]")
	public WebElement BadMinton;
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]")
	public WebElement Bad_Item;
	
	public void other_Category() {
//		In this Beauty,toys and more category we are taking sports item
		Cross.click();
		action.moveToElement(otherItems).perform();
		action.moveToElement(Sports).perform();
		BadMinton.click();
	}
	public void sports_Selection() {
		Bad_Item.click();
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
	
	public void HomeElement() {
//		Here we are choosing home category to choose decorative part
		Cross.click();
		action.moveToElement(Home).perform();
		action.moveToElement(home_Decor).perform();
		Assesories.click();
	}
	public void select_HomeItem() {
		Home_Element.click();
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
	
	public  void Elec_Items() {
//		In this category we are taking electronic items
		Cross.click();
		action.moveToElement(Electronics).perform();
		action.moveToElement(Laptop).perform();
		Usb.click();
	}
	public void Item_Selection() {
		Usb_Item.click();
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
	public void fashion() {
		Cross.click();
		
		action.moveToElement(Fashion).perform();
		action.moveToElement(menFootwear).perform();
	
		Formal.click();
		}
	public void Fashion_Element() {
		Shoe.click();
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
}

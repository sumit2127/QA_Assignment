package SyamieRocco;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage 
{

	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")private WebElement Women;
	@FindBy(xpath="//*[@id='columns']/div[1]/a[3]")private WebElement Dresses;
	@FindBy(xpath="//a[@class='product_img_link']")private WebElement image;
	@FindBy(xpath="//*[@id='quantity_wanted']")private WebElement quantity;
	@FindBy(xpath="//*[@id='add_to_cart']/button")private WebElement cart;
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[2]/div[3]/span")private WebElement totalcheck ;
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")private WebElement shopcheckout ;
	@FindBy(xpath="//*[@id='center_column']/p[2]/a[1]")private WebElement summcheckout ;
	@FindBy(xpath="//*[@id='center_column']/form/p/button")private WebElement addresscheckout ;
	@FindBy(xpath="//*[@id='uniform-cgv']")private WebElement checkbtn ;
	@FindBy(xpath="//*[@id='form']/p/button")private WebElement shipcheckout ;
	@FindBy(xpath="//*[@id='HOOK_PAYMENT']/div[1]")private WebElement paybank ;
	@FindBy(xpath="//*[@id='cart_navigation']/button")private WebElement confirmbtn ;
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]")private WebElement profile ;
	@FindBy(xpath="//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")private WebElement ordercheck ;
	@FindBy(xpath="//*[@id='order-list']/tbody/tr[1]/td[3]")private WebElement orderamount ;


	public ActiTimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}                                                   
	
	Actions act;
	
	public void mouseOver(WebElement ele, WebDriver driver)
	{
		act= new Actions(driver);
		act.moveToElement(Women).build().perform();
	}
	
	public void clickEveningDress()
	{
		Dresses.click();
	}
	 
	public void clickOnImage()
	{
		image.click();
	}
	
	public void clear()
	{
		quantity.clear();
	}
	public void setQuantity(String qty)           
	{
		quantity.sendKeys("2");
	}
	
	public void clickAddToCart()
	{
		cart.click();
	}
	public boolean verifyTotalAmout(WebDriver driver,String text)
	{
		String result=totalcheck.getText();
		if(result.equals("$103.98"))
		{
			return true;
		} else
		{
			return false;
		}
	}
	public void clickshopProceedCheckout(WebDriver driver)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", shopcheckout);
	}
		
	
	public void clickToSummaryPageCheckout(WebDriver driver)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", summcheckout);
	}
	public void clickToAddresPageCheckout(WebDriver driver)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", addresscheckout);
	}
	public void clickcheckedBox()
	{
		checkbtn.click();
	}
	
	public void clickToShippingPageCheckout(WebDriver driver)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", shipcheckout);
	}
	public void clickOnPayByBankWire(WebDriver driver)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", paybank);
	}
	public void clickOnConfirmOrder(WebDriver driver)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", confirmbtn);
	}
	public void refresh(WebDriver driver)
	{
		driver.navigate().refresh();
	}
public void clickOnProfileName()
{
	profile.click();
}
public void clickOnOrderAndHistory()
{
	ordercheck.click();
}

public boolean verifyTotalAmoutOrder(String text)
{
	String result=orderamount.getText();
	if(result.equals("103.98"))
	{
		return true;
	} else
	{
		return false;
	}
	
}	
}

package SyamieRocco;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPageScript 
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

	ActiTimeHomePage home;

	public void ActiTimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		home=new ActiTimeHomePage(driver);
	}
	
	public void homePageValidate(WebDriver driver)
	{
		home.mouseOver(Women, driver);
		home.clickEveningDress(Dresses);
		home.clickOnImage(image);
		home.clear(quantity);
		home.setQuantity(quantity);
		home.clickAddToCart(cart);
		home.verifyTotalAmout(driver, totalcheck);
		home.clickshopProceedCheckout(driver,shopcheckout);
		home.clickToSummaryPageCheckout(driver, summcheckout);
		home.clickToAddresPageCheckout(driver, addresscheckout);
		home.clickcheckedBox(checkbtn);
		home.clickToShippingPageCheckout(driver, shipcheckout);
		home.clickOnPayByBankWire(driver, paybank);
		home.clickOnConfirmOrder(driver, confirmbtn);
		home.refresh(driver);
		home.clickOnProfileName(profile);
		home.clickOnOrderAndHistory(ordercheck);
		home.verifyTotalAmoutOrder(driver,orderamount);
	
		
		
	}
	
}

	
	
	
	
	
	
	
	
	
	
	


package SyamieRocco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage

{
	@FindBy(xpath="//input[@name='email']")private WebElement email;
	@FindBy(xpath="//input[@name='passwd']")private WebElement pwd;
	@FindBy(xpath="//button[@id='SubmitLogin'")private WebElement submit;
	public ActiTimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
public void setActiTimeUsername(String user)
{
	email.sendKeys(user);
}
public void setActiTimePassword(String pass)
{
pwd.sendKeys(pass);
}
public void clicktActiTimeSubmit()
{
	submit.click();
}
}



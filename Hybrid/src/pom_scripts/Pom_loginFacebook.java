package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class Pom_loginFacebook extends Base_Page
{
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement passw;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement lgn_btn;
	
	public Pom_loginFacebook(WebDriver driver)
	{
		super(driver);
	}
	
	public void username(String uname)
	{
		user.sendKeys(uname);
	}
	
	public void password(String pwd)
	{
		passw.sendKeys(pwd);
	}
	
	public void loginbtn()
	{
		lgn_btn.click();
	}
}
package pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	@FindBy(id = "txtUsername")
	WebElement eamil;
	
	@FindBy(id = "txtPassword")
	WebElement pass;
	
	
	@FindBy(id = "btnLogin")
	WebElement click;
	
	
	WebDriver driver;
	public loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void user(String name) {
		eamil.clear();
		eamil.sendKeys(name);
	}
	
	public void pass(String pa) {
		pass.clear();
		pass.sendKeys(pa);
	}
	
	
	public void login() {
		click.click();
	}
	
	
	public void verify() {
		String ak= driver.getTitle();
		Assert.assertEquals(ak, "OrangeHR");
	}
	

	
}

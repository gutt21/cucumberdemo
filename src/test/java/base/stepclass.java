package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.loginpage;

public class stepclass extends basea {

	
	
	
	@Given("user launch browser")
	public void user_launch_browser() {
	    
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		
	}

	@When("user enter url {string}")
	public void user_enter_url(String string) {
	   driver.get(string);
	   lg=new loginpage(driver);
	  
		
		
	}

	@When("user enter email id {string} and  password {string}")
	public void user_enter_email_id_and_password(String email, String pass) {
	   // lg.user(email);
	   // lg.pass(pass);
		driver.findElement(By.id("txtUsername")).sendKeys(email);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		
	}

	@When("user click on login")
	public void user_click_on_login() {
	    lg.login();
	}

	@Then("user verify login")
	public void user_verify_login() {
	   lg.verify();
	}

	@Then("close browser")
	public void close_browser() throws Exception {
		Thread.sleep(3000);
	   driver.close();
	}
	
	
	
}

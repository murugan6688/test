package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LoginStepdefinition {

	WebDriver browser;
	
//  Given 
//	When User enter the valid credentials
//	Then  User clicks the login button 
//	And page navigates without error 
//	And verify user landed on home page
	
	@Given("^Login page is available to access$")
	
	public void Login_page_is_available_to_access(){
		System.setProperty("webdriver.chrome.driver","c:/Users/mu307892/Desktop/Selenium/Tools software/chromedriver_win32/chromedriver.exe");
		browser = new ChromeDriver();
		browser.get("https://www.freecrm.com");
			}
	@When ("^User enter the valid credentials$")
	public void User_enter_the_valid_credentials(){
		String title = browser.getTitle();
		System.out.println(title);
	}
	@Then("^User clicks the login button$")
	public void user_clicks_the_login_button(){ 
	browser.findElement(By.name("username")).sendKeys("murugan");
	browser.findElement(By.name("password")).sendKeys("london6688");
			}
	
	@Then("^page navigates without error$")
	public void page_navigates_without_error()  {
		WebElement loginbutton = browser.findElement(By.tagName("submit"));
		loginbutton.click();

	}
	
}

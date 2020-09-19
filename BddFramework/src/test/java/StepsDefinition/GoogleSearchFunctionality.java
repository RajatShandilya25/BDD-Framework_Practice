package StepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GoogleSearchFunctionality 
{
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("User is on Google search page")
	public void user_is_on_google_search_page() 
	{
		driver.get("https://www.google.co.in/?gws_rd=ssl");
	}

	@When("user enter any text in search textbox")
	public void user_enter_any_text_in_search_textbox() 
	{
		driver.findElement(By.name("q")).sendKeys("Cucumber practice");
	}

	@And("click enter button")
	public void click_enter_button() 
	{
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is redirected to the result page")
	public void user_is_redirected_to_the_result_page() 
	{
		String ExpectedTitle = "Cucumber practice - Google Search";
	    
	    String ActualTitle = driver.getTitle();
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	    driver.quit();
	    
	}

}

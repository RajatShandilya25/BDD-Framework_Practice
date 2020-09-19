package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	
	@Given("user is on login page")
	public void UserIsOnLoginPage()
	{
		System.out.println("Inside given");
	}
	
	@When("user enters Username and Password")
	public void EnterCredentials()
	{
		System.out.println("Inside when");

	}
	
	@And("clicks on login button")
	public void ClickLoginButton()
	{
		System.out.println("Inside and");
	}
	
	@Then("user is navigated to homepage")
	public void HomePage()
	{
		System.out.println("Inside then");
	}
	

}

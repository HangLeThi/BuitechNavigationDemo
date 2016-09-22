package buitech.uk.auto.steps.serenity;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class BuitechScenarioSteps {
	@Steps
	UserSteps userSteps;
	@Given("^I am on  http://buitech\\.co\\.uk/$")
	public void i_am_on_http_buitech_co_uk() throws Throwable {
	   userSteps.Open_buitech_website();
	}

	@Given("^maximize the browser$")
	public void maximize_the_browser() throws Throwable {
	    userSteps.maximize_browser();
	}

	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String Link) throws Throwable {
	  //  userStepsclick_on_link(Link);click_on_testing_services()
		userSteps.click_on_testing_services();
		userSteps.click_on_testing_solutions(); 
		userSteps.click_on_resources();
		userSteps.click_on_clients();
		userSteps.click_on_news();
		
	}
	/*@When("^I wait for a second$")
	public void i_wait_for_a_second(int x, TimeUnit SECONDS) throws Throwable {
		
		 userSteps.wait_for_loading(x, SECONDS);
	}*/
	@When("^the page is display with \"([^\"]*)\"$")
	public void the_page_is_display_with(String Title) throws Throwable {
		// Assert.assertEquals(userSteps.getTitleOfHomePage(), title);
	    Assert.assertEquals(userSteps.getTitleOfTestingServicesPage(), Title);
	    Assert.assertEquals(userSteps.getTitleOfTestingSolutionsPage(), Title);
	    Assert.assertEquals(userSteps.getTitleOfTestingResourcesPage(), Title);
	    Assert.assertEquals(userSteps.getTitleOfTestingClientsPage(), Title);
	    Assert.assertEquals(userSteps.getTitleOfTestingNewsPage(), Title);
	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
	    userSteps.close_browser();
	}
	
	
	
	
	
	
	
	
	
	
	/*=================== Run OK =====================
	 * @Given("^I am on http://buitech\\.co\\.uk/$")
	public void i_am_on_http_buitech_co_uk() throws Throwable {
	    userSteps.open_buitech_website();
	}

	@Given("^maximize the browser$")
	public void maximize_the_browser() throws Throwable {
	    userSteps.maximize_browser();
	}

	@When("^I click on testing services$")
	public void i_click_on_testing_services() throws Throwable {
	    userSteps.click_on_testing_services();
	}

	@When("^the page is display with title page$")
	public void the_page_is_display_with_title_page() throws Throwable {
	  
	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
	    userSteps.close_browser();
	}

	@Given("^I am on  http://buitech\\.co\\.uk/$")
	public void i_am_on_http_buitech_co_uk1() throws Throwable {
	    userSteps.open_buitech_website();
	}

	@When("^I click on testing solutions$")
	public void i_click_on_testing_solutions() throws Throwable {
	    userSteps.click_on_testing_solutions();
	}=================== Run OK =====================*/

	}

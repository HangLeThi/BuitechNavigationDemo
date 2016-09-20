package buitech.uk.auto.steps.serenity;

import org.junit.Assert;

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
	    userSteps.click_on_link(Link);
	}

	@When("^the page is display with \"([^\"]*)\"$")
	public void the_page_is_display_with(String title) throws Throwable {
		 Assert.assertEquals(userSteps.getTitleOfHomePage(), title);
	    Assert.assertEquals(userSteps.getTitleOfTestingServicesPage(), title);
	    Assert.assertEquals(userSteps.getTitleOfTestingSolutionsPage(), title);
	    Assert.assertEquals(userSteps.getTitleOfTestingResourcesPage(), title);
	    Assert.assertEquals(userSteps.getTitleOfTestingClientsPage(), title);
	    Assert.assertEquals(userSteps.getTitleOfTestingNewsPage(), title);
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

package buitech.uk.auto.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://buitech.co.uk/")
public class BuitechHomePage extends PageObject {
	//*[@id="navigation"]/div/ul/li[1]/a
	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[2]/a")
	WebElement homepage;
	
	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[2]/a")
	WebElement testingServices;

	@FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
	WebElement TestingServicesTitle;

	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[3]")
	WebElement testingSolutions;

	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[4]")
	WebElement resources;

	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[5]")
	WebElement clients;
	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[6]")
	WebElement news;
	
	
/*	public void click_on_navigation(String link) {
		news.click();
		
	}*/


	


	public void click_on_testing_services() {
		testingServices.click();

	}

	public void click_on_testing_solution() {
		testingSolutions.click();

	}

	public void click_on_resouces() {
		resources.click();

	}

	public void click_on_clients() {
		clients.click();

	}

	
	public void click_on_news() {
		news.click();
		
	}
	public void click_on_home() {
		homepage.click();
		
	}
	

	public void close_browser() {
		getDriver().quit();

	} 
	/*
	 * =================== Run OK ===================== public void
	 * click_testing_services_link() { testingServices.click();
	 * 
	 * }
	 * 
	 * public void click_testing_solutions_link() { testingSolutions.click();
	 * 
	 * }=================== Run OK =====================
	 */

	
	

}

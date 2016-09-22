package buitech.uk.auto.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://buitech.co.uk/")
public class BuitechHomePage extends PageObject {
	// *//*[@id="content"]/div/div[1]/h1
	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[2]/a")
	WebElement homepage;

	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[2]/a")
	WebElement testingServices;

	@FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
	WebElement TestingServicesTitle;

	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[3]")
	WebElement testingSolutions;
	@FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
	WebElement testingSolutionsTitle;

	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[4]")
	WebElement resources;
	@FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
	WebElement resourcesTitle;
	
	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[5]")
	WebElement clients;
	@FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
	WebElement clientsTitle;
	
	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[6]")
	WebElement news;
	@FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
	WebElement newsTitle;

	public void click_on_testing_services() {
		testingServices.click();

	}
	public Object get_testing_services_title() {
		return TestingServicesTitle.getText();
	}

	public void click_on_testing_solution() {
		testingSolutions.click();

	}
	public Object get_testing_solutions_title() {
		// TODO Auto-generated method stub
		return testingSolutionsTitle.getText();
	}
	public void click_on_resouces() {
		resources.click();

	}
	public Object get_testing_resources_title() {
		// TODO Auto-generated method stub
		return resourcesTitle.getText();
	}
	public void click_on_clients() {
		clients.click();

	}
	public Object get_clients_title() {
		// TODO Auto-generated method stub
		return clientsTitle.getText();
	}
	public void click_on_news() {
		news.click();

	}
	public Object get_news_title() {
		// TODO Auto-generated method stub
		return newsTitle.getText();
	}
	
	public void click_on_home() {
		homepage.click();

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

	
	public void close_browser() {
		getDriver().quit();

	}

}

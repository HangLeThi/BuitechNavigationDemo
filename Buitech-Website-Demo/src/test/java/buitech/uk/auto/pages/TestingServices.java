package buitech.uk.auto.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
//import net.serenitybdd.core.pages.PageObject;

public class TestingServices extends BuitechHomePage {
	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[2]/a")
	WebElement homepage;
	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[3]")
	WebElement testingSolutions;
	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[4]")
	WebElement resources;
	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[5]")
	WebElement clients;
	@FindBy(xpath = "//*[@id='navigation']/div/ul/li[6]")
	WebElement news;
	
	public void click_on_menu_link() {
		testingSolutions.click();
		/*resources.click();
		clients.click();
		news.click();*/
	}
	
}

package buitech.uk.auto.steps.serenity;

import buitech.uk.auto.pages.BuitechHomePage;
import net.thucydides.core.steps.ScenarioSteps;

public class UserSteps extends ScenarioSteps {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BuitechHomePage buitechHomePage;
	public void Open_buitech_website() {
		buitechHomePage.open();
		
	}
	public void maximize_browser() {
		getDriver().manage().window().maximize();
		
	}
	public void click_on_link(String Link) {
		buitechHomePage.click_on_testing_services();
		buitechHomePage.click_on_testing_solution();
		buitechHomePage.click_on_resouces();
		buitechHomePage.click_on_clients();
		buitechHomePage.click_on_news();
		buitechHomePage.click_on_home();
		
		//buitechHomePage.click_on_navigation(Link);
		
	}
	public Object getTitleOfTestingServicesPage() {
		// TODO Auto-generated method stub
		return null;
	}		
	
	public Object getTitleOfTestingSolutionsPage() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getTitleOfTestingResourcesPage() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getTitleOfTestingClientsPage() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getTitleOfTestingNewsPage() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getTitleOfHomePage() {
		return buitechHomePage.getTitle();
	}
	
	public void close_browser() {
		buitechHomePage.close_browser();
		
	}
	
	
	
	
	
/*=================== Run OK =====================
 	public void open_buitech_website() {
		buitechPage.open();
		
	}
	public void maximize_browser() {
		getDriver().manage().window().maximize();
		
	}
	public void click_on_testing_services() {
		buitechPage.click_testing_services_link();
		
	}
	public void close_browser() {
		getDriver().quit();
		
	}
	public void click_on_testing_solutions() {
		buitechPage.click_testing_solutions_link();
		
	}=================== Run OK =====================*/

}

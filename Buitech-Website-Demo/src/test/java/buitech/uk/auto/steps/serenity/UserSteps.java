package buitech.uk.auto.steps.serenity;

import java.util.concurrent.TimeUnit;

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

	public void click_on_testing_services() {
		buitechHomePage.click_on_testing_services();

	}
	/*public void wait_for_loading(int x, TimeUnit SECONDS) {
		getDriver().manage().timeouts().pageLoadTimeout(100, SECONDS);
		
	}*/
	public Object getTitleOfTestingServicesPage() {

		return buitechHomePage.get_testing_services_title();
	}

	public void click_on_testing_solutions() {
		buitechHomePage.click_on_testing_solution();

	}

	public Object getTitleOfTestingSolutionsPage() {

		return buitechHomePage.get_testing_solutions_title();
	}

	public void click_on_resources() {
		buitechHomePage.click_on_resouces();

	}

	public Object getTitleOfTestingResourcesPage() {

		return buitechHomePage.get_testing_resources_title();
	}

	public void click_on_clients() {
		buitechHomePage.click_on_clients();

	}

	public Object getTitleOfTestingClientsPage() {

		return buitechHomePage.get_clients_title();
	}

	public void click_on_news() {
		buitechHomePage.click_on_news();

	}

	public Object getTitleOfTestingNewsPage() {

		return buitechHomePage.get_news_title();
	}

	/*
	 * public void click_on_link(String Link) {
	 * buitechHomePage.click_on_testing_services();
	 * buitechHomePage.click_on_testing_solution();
	 * buitechHomePage.click_on_resouces(); buitechHomePage.click_on_clients();
	 * buitechHomePage.click_on_news(); buitechHomePage.click_on_home();
	 * 
	 * //buitechHomePage.click_on_navigation(Link);
	 * 
	 * }
	 */

	/*
	 * public Object getTitleOfHomePage() { return buitechHomePage.getTitle(); }
	 */

	public void close_browser() {
		buitechHomePage.close_browser();

	}

	/*
	 * =================== Run OK ===================== public void
	 * open_buitech_website() { buitechPage.open();
	 * 
	 * } public void maximize_browser() {
	 * getDriver().manage().window().maximize();
	 * 
	 * } public void click_on_testing_services() {
	 * buitechPage.click_testing_services_link();
	 * 
	 * } public void close_browser() { getDriver().quit();
	 * 
	 * } public void click_on_testing_solutions() {
	 * buitechPage.click_testing_solutions_link();
	 * 
	 * }=================== Run OK =====================
	 */

}

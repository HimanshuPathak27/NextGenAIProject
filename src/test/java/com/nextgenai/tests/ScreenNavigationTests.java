package com.nextgenai.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nextgenai.driverscript.TestBase;
import com.nextgenai.pages.HomePage;

public class ScreenNavigationTests extends TestBase{
	
	@Test(priority=1)
	public void validatingHomePageNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToHomePage();
	}
	
	/*
	@Test(priority=2)
	public void validatingSeleniumCurriculumNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToSeleniumCurriculumPage();
	}
	
	@Test(priority=3)
	public void validatingToolsCurriculumNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToToolsCurriculumPage();
	}
	*/
	
	@Test(priority=4)
	public void validatingRegistrationFormNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToRegisterDemoPage();
	}
	
	@Test(priority=5)
	public void validatingDynamicTransactionNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToDynamicTransactionPage();
	}
	
	@Test(priority=6)
	public void validatingMouseEventNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToMouseEventPage();
	}
	
	@Test(priority=7)
	public void validatingAlertAndPopupNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToAlertAndPopupPage();
	}
	
	@Test(priority=8)
	public void validatingMultipleWindowsNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToMultipleWindowsPage();
	}
	
	@Test(priority=9)
	public void validatingIFrameNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToiFramesPage();
	}
	
	@Test(priority=10)
	public void validatingWebTableNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToWebTablesPage();
	}
	
	@Test(priority=11)
	public void validatingProgressBarNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToProgressBarPage();
	}
	
	@Test(priority=12)
	public void validatingTechTalksNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToTechTalksPage();
	}
	/*
	@Test(priority=13)
	public void validatingTestimonialsNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToTestimonialsPage();
	}
	
	@Test(priority=14)
	public void validatingPythonForAutomationNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToPythonForAutomationPage();
	}
	*/
}

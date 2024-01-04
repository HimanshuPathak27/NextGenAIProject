package com.nextgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.nextgenai.objectrepository.ObjectRepository;

public class HomePage {
	
	public WebDriver driver;
	public Actions mouseHover;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(partialLinkText = ObjectRepository.homeLink) 
	@CacheLookup
	WebElement homePage;
	
	@FindBy(partialLinkText = ObjectRepository.courseOfferedLink) 
	@CacheLookup
	WebElement courseOffered;
	
	@FindBy(partialLinkText = ObjectRepository.seleniumCurriculumLink) 
	@CacheLookup
	WebElement seleniumCurriculum;
	
	@FindBy(partialLinkText = ObjectRepository.toolsCurriculumLink) 
	@CacheLookup
	WebElement toolsCurriculum;
	
	@FindBy(partialLinkText = ObjectRepository.demoSitesLink) 
	@CacheLookup
	WebElement demoSites;
	
	@FindBy(partialLinkText = ObjectRepository.practiceAutomationLink) 
	@CacheLookup
	WebElement practiceAutomation;
	
	@FindBy(partialLinkText = ObjectRepository.registerDemoLink) 
	@CacheLookup
	WebElement registerDemo;
	
	@FindBy(partialLinkText = ObjectRepository.dynamicTransactionLink) 
	@CacheLookup
	WebElement dynamicTransaction;
	
	@FindBy(partialLinkText = ObjectRepository.mouseEventLink) 
	@CacheLookup
	WebElement mouseEvent;
	
	@FindBy(partialLinkText = ObjectRepository.alertAndPopupLink) 
	@CacheLookup
	WebElement alertAndPopup;
	
	@FindBy(partialLinkText = ObjectRepository.multipleWindowsLink) 
	@CacheLookup
	WebElement multipleWindows;
	
	@FindBy(partialLinkText = ObjectRepository.iFramesLink) 
	@CacheLookup
	WebElement iFrames;
	
	@FindBy(partialLinkText = ObjectRepository.webTablesLink) 
	@CacheLookup
	WebElement webTables;
	
	@FindBy(partialLinkText = ObjectRepository.progressBarLink) 
	@CacheLookup
	WebElement progressBar;
	
	@FindBy(partialLinkText = ObjectRepository.aboutMeLink) 
	@CacheLookup
	WebElement aboutMe;
	
	@FindBy(partialLinkText = ObjectRepository.techTalksLink) 
	@CacheLookup
	WebElement techTalks;
	
	@FindBy(partialLinkText = ObjectRepository.testimonialsLink) 
	@CacheLookup
	WebElement testimonials;
	
	@FindBy(partialLinkText = ObjectRepository.pythonForAutomationLink) 
	@CacheLookup
	WebElement pythonForAutomation;
	
	public void navigateToHomePage() {
		homePage.click();
		Reporter.log("Successfully Navigated to Home Page");
	}
	
	public void navigateToSeleniumCurriculumPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(courseOffered).perform();
		mouseHover.moveToElement(seleniumCurriculum).click().perform();
		Reporter.log("Successfully Navigated to Selenium Curriculum Page");
	}
	
	public void navigateToToolsCurriculumPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(courseOffered).perform();
		mouseHover.moveToElement(toolsCurriculum).click().perform();
		Reporter.log("Successfully Navigated to Tools Curriculum Page");
	}
	
	public void navigateToRegisterDemoPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();
		mouseHover.moveToElement(practiceAutomation).perform();
		mouseHover.moveToElement(registerDemo).click().perform();
		Reporter.log("Successfully Navigated to Register Demo Page");
	}
	
	public void navigateToDynamicTransactionPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();
		mouseHover.moveToElement(practiceAutomation).perform();
		mouseHover.moveToElement(dynamicTransaction).click().perform();
		Reporter.log("Successfully Navigated to Dynamic Transaction Page");
	}
	
	public void navigateToMouseEventPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();
		mouseHover.moveToElement(practiceAutomation).perform();
		mouseHover.moveToElement(mouseEvent).click().perform();
		Reporter.log("Successfully Navigated to MouseEvent Page");
	}
	
	public void navigateToAlertAndPopupPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();
		mouseHover.moveToElement(practiceAutomation).perform();
		mouseHover.moveToElement(alertAndPopup).click().perform();
		Reporter.log("Successfully Navigated to Alert and Popup Page");
	}
	
	public void navigateToMultipleWindowsPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();
		mouseHover.moveToElement(practiceAutomation).perform();
		mouseHover.moveToElement(multipleWindows).click().perform();
		Reporter.log("Successfully Navigated to Multiple Windows Page");
	}
	
	public void navigateToiFramesPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();
		mouseHover.moveToElement(practiceAutomation).perform();
		mouseHover.moveToElement(iFrames).click().perform();
		Reporter.log("Successfully Navigated to i Frames Page");
	}
	
	public void navigateToWebTablesPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();
		mouseHover.moveToElement(practiceAutomation).perform();
		mouseHover.moveToElement(webTables).click().perform();
		Reporter.log("Successfully Navigated to Web Tables Page");
	}
	
	public void navigateToProgressBarPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(demoSites).perform();
		mouseHover.moveToElement(practiceAutomation).perform();
		mouseHover.moveToElement(progressBar).click().perform();
		Reporter.log("Successfully Navigated to Progress Bar Page");
	}
	
	public void navigateToTechTalksPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(aboutMe).perform();
		mouseHover.moveToElement(techTalks).click().perform();
		Reporter.log("Successfully Navigated to Tech Talks Page");
	}
	
	public void navigateToTestimonialsPage() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(aboutMe).perform();
		mouseHover.moveToElement(testimonials).click().perform();
		Reporter.log("Successfully Navigated to Testimonials Page");
	}
	
	public void navigateToPythonForAutomationPage() {
		pythonForAutomation.click();
		Reporter.log("Successfully Navigated to Python For Automation Page");
	}
	
}

package com.nextgenai.tests;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nextgenai.driverscript.TestBase;
import com.nextgenai.pages.HomePage;
import com.nextgenai.pages.RegisterUserPage;

public class RegisterUserTests extends TestBase{
	
	@Test(dataProviderClass = com.nextgenai.utilities.TestUtil.class,dataProvider = "registerDemo")
	public void registerUser(Hashtable<String,String> data) throws InterruptedException{
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToRegisterDemoPage();
		
		RegisterUserPage registerUser = PageFactory.initElements(driver, RegisterUserPage.class);
		registerUser.validateRegisterUserPageTitle(data.get("RegistrationPageTitle"));
		registerUser.validateRegisterFormTitle(data.get("TitleValidation"));
		registerUser.validateFirstNameField(data.get("FirstName"));
		registerUser.validateLastNameField(data.get("LastName"));
		registerUser.validateFemaleGenderRadioButton();
		registerUser.validateMaleGenderRadioButton();
		registerUser.validateOtherGenderRadioButton();
		registerUser.validateStreetAddressField(data.get("StreetAddress"));
		registerUser.validateApartmentNameField(data.get("ApartmentNumber"));
		registerUser.validateCityField(data.get("City"));
		registerUser.validateStateField(data.get("State"));
		registerUser.validatePostalCodeField(data.get("PinCode"));
		registerUser.validateCountryDropdown(data.get("Country"));
		registerUser.validateEmailField(data.get("EmailID"));
		registerUser.validateDateOfDemoField(data.get("DemoDate"));
		registerUser.validateConvenientHoursDropdown(data.get("HH"));
		registerUser.validateConvenientMinutesDropdown(data.get("MM"));
		registerUser.validateMobileNumberField(data.get("MobileNumber"));		
		registerUser.validateSeleniumWebdriverCheckbox();
		registerUser.validateCoreJavaCheckbox();
		registerUser.validateTestNGCheckbox();		
		registerUser.validateQueryField(data.get("Query"));
		registerUser.validateVerificationCodeField();
		registerUser.validateSumitButton();	
	}
	
	/*
	@Test(priority=1)
	public void validatingRegistrationFormNavigation() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.navigateToRegisterDemoPage();
	}
	
	@Test(priority = 2)
	public void validatingRegistrationPageTitle() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateRegisterUserPageTitle("Demo Site – Registration Form – NxtGen A.I Academy");
	}
	
	@Test(priority=3)
	public void validatingRegistrationFormTitle() { 
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateRegisterFormTitle("Register For Demo");
	}
	
	@Test(priority=4)
	public void validatingFirstNameField() { 
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateFirstNameField("Himanshu");
	}
	
	@Test(priority=5)
	public void validatingLastNameField() { 
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateLastNameField("Pathak");
	}
	
	@Test(priority=6)
	public void validatingMaleRadioButton() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateMaleGenderRadioButton();
	}
	
	@Test(priority=7)
	public void validatingFemaleRadioButton() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		 regUserPage.validateFemaleGenderRadioButton();
	}
	
	@Test(priority=8)
	public void validatingOtherRadioButton() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateOtherGenderRadioButton();
	}
	
	@Test(priority=9)
	public void validatingStreetAddressField() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateStreetAddressField("Lodhi Puram");
	}
	
	@Test(priority=10)
	public void validatingApartmentNameField() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateApartmentNameField("17/238 Z-16");
	}
	
	@Test(priority=11)
	public void validatingCityField() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateCityField("Aligarh");
	}
	
	@Test(priority=12)
	public void validatingStateField() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateStateField("Uttar Pradesh");
	}
	
	@Test(priority=13)
	public void validatingPostalCodeField() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validatePostalCodeField("202001");
	}
	
	@Test(priority=14)
	public void validatingCountryDropdown() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateCountryDropdown("India");
	}
	
	@Test(priority=15)
	public void validatingEmailField() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateEmailField("himanshu.pathak@company.com");
	}
	
	@Test(priority=16)
	public void validatingDateOfDemoField() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateDateOfDemoField("10/29/2023");
	}
	
	@Test(priority=17)
	public void validatingConvenientHoursDropdown() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateConvenientHoursDropdown("03");
	}
	
	@Test(priority=18)
	public void validatingConvenientMinutesDropdown() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateConvenientMinutesDropdown("20");
	}
	
	@Test(priority=19)
	public void validatingMobileNumberField() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateMobileNumberField("9595320201");
	}
	
	@Test(priority=20)
	public void validatingSeleniumWebdriverCheckbox() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateSeleniumWebdriverCheckbox();
	}
	
	@Test(priority=21)
	public void validatingCoreJavaCheckbox() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateCoreJavaCheckbox();
	}
	
	@Test(priority=22)
	public void validatingTestNGCheckbox() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateTestNGCheckbox();
	}
	
	@Test(priority=23)
	public void validatingQueryField() { 
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateQueryField("How many days does the training go?");
	}
	
	@Test(priority=24)
	public void validatingVerificationCodeField() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateVerificationCodeField();
	}
	
	@Test(priority=25)
	public void validatingSumitButton() {
		RegisterUserPage regUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
		regUserPage.validateSumitButton();
	}
	*/
}	


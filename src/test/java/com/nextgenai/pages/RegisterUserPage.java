package com.nextgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.nextgenai.objectrepository.ObjectRepository;

public class RegisterUserPage{

	public WebDriver driver;
	
	public RegisterUserPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath = ObjectRepository.regFormTitleXpath) 
	@CacheLookup
	WebElement regFormTitle;

	@FindBy(xpath = ObjectRepository.firstNameFieldXpath) 
	@CacheLookup
	WebElement firstNameField;

	@FindBy(xpath = ObjectRepository.lastNameFieldXpath) 
	@CacheLookup
	WebElement lastNameField;

	@FindBy(xpath = ObjectRepository.maleGenderRadioBtnXpath) 
	@CacheLookup
	WebElement maleGenderRadioBtn;

	@FindBy(xpath = ObjectRepository.femaleGenderRadioBtnXpath) 
	@CacheLookup
	WebElement femaleGenderRadioBtn;

	@FindBy(xpath = ObjectRepository.otherGenderRadioBtnXpath) 
	@CacheLookup
	WebElement otherGenderRadioBtn;

	@FindBy(xpath = ObjectRepository.streetAddressFieldXpath) 
	@CacheLookup
	WebElement streetAddressField;

	@FindBy(xpath = ObjectRepository.apartmentNameFieldXpath) 
	@CacheLookup
	WebElement apartmentNameField;

	@FindBy(xpath = ObjectRepository.cityFieldXpath) 
	@CacheLookup
	WebElement cityField;

	@FindBy(xpath = ObjectRepository.stateFieldXpath) 
	@CacheLookup
	WebElement stateField;

	@FindBy(xpath = ObjectRepository.postalCodeFieldXpath) 
	@CacheLookup
	WebElement postalCodeField;

	@FindBy(xpath = ObjectRepository.countryDDXpath) 
	@CacheLookup
	WebElement countryDD;

	@FindBy(xpath = ObjectRepository.emailFieldXpath) 
	@CacheLookup
	WebElement emailField;

	@FindBy(xpath = ObjectRepository.dateOfDemoFieldXpath) 
	@CacheLookup
	WebElement dateOfDemoField;

	@FindBy(xpath = ObjectRepository.convHoursDDXpath) 
	@CacheLookup
	WebElement convHours;

	@FindBy(xpath = ObjectRepository.convMinutesDDXpath) 
	@CacheLookup
	WebElement convMinutes;

	@FindBy(xpath = ObjectRepository.mobileNumberFieldXpath) 
	@CacheLookup
	WebElement mobileNumberField;

	@FindBy(xpath = ObjectRepository.seleniumWebDriverCheckboxXpath) 
	@CacheLookup
	WebElement seleniumWebDriverCheckbox;

	@FindBy(xpath = ObjectRepository.coreJavaCheckboxXpath) 
	@CacheLookup
	WebElement coreJavaCheckbox;

	@FindBy(xpath = ObjectRepository.testNGCheckboxXpath) 
	@CacheLookup
	WebElement testNGCheckbox;

	@FindBy(xpath = ObjectRepository.queryFieldXpath) 
	@CacheLookup
	WebElement queryField;

	@FindBy(xpath = ObjectRepository.sampleVerificationCodeXpath) 
	@CacheLookup
	WebElement sampleVerificationCode;

	@FindBy(xpath = ObjectRepository.verificationCodeFieldXpath) 
	@CacheLookup
	WebElement verificationCodeField;

	@FindBy(xpath = ObjectRepository.submitButtonXpath) 
	@CacheLookup
	WebElement submitButton;

	public void validateRegisterUserPageTitle(String expPageTitle) {
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, expPageTitle, "Expected and Actual Titles of Register User Page are not same");
		Reporter.log("Title of Regsiter User Page is validated");
	}

	public void validateRegisterFormTitle(String expFormTitle) {
		String actualFormTitle = regFormTitle.getText();
		Assert.assertEquals(actualFormTitle, expFormTitle, "Expected and Actual Titles of Register User Page are not same");
		Reporter.log("Title of Regsiter Form is validated");
	}

	public void validateFirstNameField(String firstName) {
		firstNameField.sendKeys(firstName);
		Reporter.log("First Name is entered successfully" + "; Value = " + firstName);

	}

	public void validateLastNameField(String lastName) {
		lastNameField.sendKeys(lastName);
		Reporter.log("Last Name is entered successfully" + "; Value = " + lastName);
	}

	public void validateMaleGenderRadioButton() {
		maleGenderRadioBtn.click();
		Reporter.log("Male gender is selected successfully");
	}

	public void validateFemaleGenderRadioButton() {
		femaleGenderRadioBtn.click();
		Reporter.log("Female gender is selected successfully");
	}

	public void validateOtherGenderRadioButton() {
		otherGenderRadioBtn.click();
		Reporter.log("Other gender is selected successfully");
	}

	public void validateStreetAddressField(String streetAdd) {
		streetAddressField.sendKeys(streetAdd);
		Reporter.log("Street Address is entered successfully" + "; Value = " + streetAdd);
	}

	public void validateApartmentNameField(String aptName) {
		apartmentNameField.sendKeys(aptName);
		Reporter.log("Apartment Name is entered successfully" + "; Value = " + aptName);
	}

	public void validateCityField(String cityName) {
		cityField.sendKeys(cityName);
		Reporter.log("City Name is entered successfully" + "; Value = " + cityName);
	}

	public void validateStateField(String stateName) {
		stateField.sendKeys(stateName);
		Reporter.log("State Name is entered successfully" + "; Value = " + stateName);
	}

	public void validatePostalCodeField(String postalCode) {
		postalCodeField.sendKeys(postalCode);
		Reporter.log("Postal Code is entered successfully" + "; Value = " + postalCode);
	}

	public void validateCountryDropdown(String country) {
		Select cdd = new Select(countryDD);
		cdd.selectByVisibleText(country);
		Reporter.log("Country is selected successfully" + "; Value = " + country);
	}

	public void validateEmailField(String email) {
		emailField.sendKeys(email);
		Reporter.log("Email is entered successfully" + "; Value = " + email);
	}

	public void validateDateOfDemoField(String dateOfDemo) {
		dateOfDemoField.sendKeys(dateOfDemo);
		Reporter.log("Date of Demo is entered successfully" + "; Value = " + dateOfDemo);
	}

	public void validateConvenientHoursDropdown(String convHrs) {
		Select ch = new Select(convHours);
		ch.selectByVisibleText(convHrs);
		Reporter.log("Convenient Hours are selected successfully" + "; Value = " + convHrs);
	}

	public void validateConvenientMinutesDropdown(String convMin) {
		Select cm = new Select(convMinutes);
		cm.selectByVisibleText(convMin);
		Reporter.log("Convenient Minutes are selected successfully" + "; Value = " + convMin);
	}

	public void validateMobileNumberField(String mobileNumber) {
		mobileNumberField.sendKeys(mobileNumber);
		Reporter.log("Mobile Number is entered successfully" + "; Value = " + mobileNumber);
	}

	public void validateSeleniumWebdriverCheckbox() {
		seleniumWebDriverCheckbox.click();
		Reporter.log("Selenium Webdriver checkbox is selected successfully");
	}

	public void validateCoreJavaCheckbox() {
		coreJavaCheckbox.click();
		Reporter.log("Core Java checkbox is selected successfully");
	}

	public void validateTestNGCheckbox() {
		testNGCheckbox.click();
		Reporter.log("Test NG checkbox is selected successfully");
	}

	public void validateQueryField(String query) {
		queryField.sendKeys(query);
		Reporter.log("Query is entered successfully" + "; Value = " + query);
	}

	public void validateVerificationCodeField() {
		String codeString = sampleVerificationCode.getText();
		String code = (codeString.split(" ")[1]);
		verificationCodeField.sendKeys(code);
		Reporter.log("Verification Code is entered successfully");
	}

	public void validateSumitButton() {
		submitButton.click();
		Reporter.log("Submit Button is clicked successfully");
	}

}

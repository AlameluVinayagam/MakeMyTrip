package com.testrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Details extends Base{
	
	public Details(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "(//span[@class=\"darkText lightFont fontSize14\"])[2]")
	private WebElement no;
	
	@FindBy(xpath = "//button[text()='+ ADD NEW ADULT']")
	private WebElement add_adult;
	
	@FindBy(xpath = "//p[text()='First & Middle Name is required.']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@value=\"FEMALE\"]")
	private WebElement gender;
	
	@FindBy(xpath = "//div[@class=\"dropdown__control css-yk16xz-control\"]")
	private WebElement country_code;
	
	@FindBy(xpath = "(//input[@class=\"tvlrInput \"])[3]")
	private WebElement mobile_no ;
	
	@FindBy(xpath = "(//input[@class=\"tvlrInput \"])[4]")
	private WebElement mail;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continue_btn;
	
	@FindBy(xpath = "//button[text()='Got it']")
	private WebElement got_it;
	
	@FindBy(xpath = "//a[text()='Search']")
	private WebElement search;

	public WebElement getNo() {
		return no;
	}


	public WebElement getAdd_adult() {
		return add_adult;
	}


	public WebElement getName() {
		return name;
	}


	public WebElement getGender() {
		return gender;
	}


	public WebElement getCountry_code() {
		return country_code;
	}


	public WebElement getMobile_no() {
		return mobile_no;
	}


	public WebElement getMail() {
		return mail;
	}


	public WebElement getContinue_btn() {
		return continue_btn;
	}


	public WebElement getGot_it() {
		return got_it;
	}
	
	
	public WebElement getSearch() {
		return search;
	}

	}



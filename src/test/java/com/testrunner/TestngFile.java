package com.testrunner;

import com.Project.BaseClass;

import java.util.Iterator;
import java.util.Set;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Project.*;

public class TestngFile extends BaseClass {

	public static WebDriver driver;

	static PageObjectManager pom = new PageObjectManager(driver);
	
	@BeforeSuite
	public static void browserLaunch() {
		browserLaunch("chrome");
	}
	
	@BeforeMethod
	public static void launchUrl() {
		launchUrl("https://www.makemytrip.com/");
	}

	public static void select() {
		clickWebelement(pom.getHome().getFromcity());
		clickWebelement(pom.getHome().getSelectcity());
		clickWebelement(pom.getHome().getTocity());
		clickWebelement(pom.getHome().getToselect());
	}

	public static void date() {
		clickWebelement(pom.getHome().getDeparture());
		clickWebelement(pom.getHome().getSearch());
	}

	public static void priceDetails() {
		clickWebelement(pom.getHome().getClose());
		clickWebelement(pom.getHome().getView_price());
		clickWebelement(pom.getHome().getBook_now());
	}

	public static void switchWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		itr.next();
		String tab2 = itr.next();
		switchToWindow(tab2);

	}

	public static void details() {
		clickWebelement(pom.getDet().getNo());
		clickWebelement(pom.getDet().getAdd_adult());
		clickWebelement(pom.getDet().getName());
		inputValues(pom.getDet().getName(), "abc");
		clickWebelement(pom.getDet().getGender());
		clickWebelement(pom.getDet().getCountry_code());
		clickWebelement(pom.getDet().getMobile_no());
		inputValues(pom.getDet().getMobile_no(), "1234685792");
		clickWebelement(pom.getDet().getMail());
		inputValues(pom.getDet().getMail(), "abc@123");
		clickWebelement(pom.getDet().getContinue_btn());
		clickWebelement(pom.getDet().getGot_it());
		clickWebelement(pom.getDet().getSearch());
	}
	
	@AfterSuite
	public static void exit() {
		driver.quit();
		
	}
	
	public static void main(String args[]) {
		
		browserLaunch();
		launchUrl();
		select();
		date();
		priceDetails();
		switchWindow();
		details();
		
	}

}

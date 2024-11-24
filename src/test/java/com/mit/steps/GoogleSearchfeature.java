package com.mit.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mit.common.GoogleBase;
import com.mit.pages.GoogleHomepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchfeature extends GoogleBase {
	//WebDriver driver;
	 GoogleHomepage gh;
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
	   launchBrowser(); 
	//WebDriver driver;//this is local variable and to make it global variable we have to put in in the class method
	
	//WebDriverManager.chromedriver().setup();
	//driver = new ChromeDriver();
	//driver.get("https://www.google.com");
	//driver.manage().window().maximize();
	//driver.manage().window().maximize();
	
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		 gh = new GoogleHomepage(driver);		
	
		WebElement searchBox;
		searchBox=driver.findElement(By.name("q"));
		
		searchBox.sendKeys(string);
		
		
	 
		
		//1.Find/locate the element
		
//		WebElement searchBox;
//	 searchBox = driver.findElement(By.name("q"));
//	 //2.perform action
//	//searchbox.sendKeys(string);	
//	 searchbox.sendKeys(string);
		
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		 gh = new GoogleHomepage(driver);
	WebElement searchBtn;
	searchBtn = driver.findElement(By.name("btnK"));
	//searchBtn.click();
	searchBtn.submit();
	
	//if the click method doesn't work we will use submit method
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
	    closeBrowser();
	}
}
